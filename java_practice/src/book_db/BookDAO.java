package book_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	
	/*�����ͺ��̽��� �ڹٸ� �������ֱ� ���� ��ü�� 
	 * getConnection()�޼��带 ���� DB�� �����ϴ� ������ �����Ѵ�.*/
	private Connection connection = null;
	
	
	public BookDAO() {
		getConnection();
		
	}

	//��񿬰�
	private void getConnection() {
		try {
			String url = "jdbc:mariadb://localhost:3306/book";
			String user = "root";
			String password = "0528";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection = DriverManager.getConnection(url,user, password);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//��������, ���� ����ÿ� ���
	public void disConnect() {
		try {
			if(connection !=null) {
				connection.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// å �˻�
	   public ArrayList<Book> searchBook (String name) {
	      Statement statement = null;
	      /*Statement ���� ������ �����ϱ� ���� ��ü
	     	���� ������� ���� Scanner�� ���� ����ڷκ��� ���ڸ� �����ʰ� ����� ����� �� ����Ѵ�
	      */
	      
	      ArrayList<Book> books = new ArrayList<>();
	      
	      try {
	         String sql = "SELECT * FROM book WHERE name LIKE '%" + name + "%'";
	         statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql);
	         //ResultSet�� ������ ����� ���� ��ü
	         //ResultSet�� statement�� ������ ������ ������������μ� ��� ���� �����´�.
	         //executeQuery()�� �����ϴ� �޼���, ()�ȿ��� ���� ���ڿ��� �־��ش�.
	         
	         while(resultSet.next()) {
	            Book book = new Book();
	            book.setCode(resultSet.getInt("code"));
	            book.setName(resultSet.getString("name"));
	            book.setAutor(resultSet.getString("autor"));
	            book.setCnt(resultSet.getInt("cnt"));
	            books.add(book);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(statement != null) {
	               statement.close();
	            }
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	      return books;
	   }
	
	
	boolean isBook(int code) {
		int res= 0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM book WHERE code = '" + code + "'";
//			System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res=resultSet.getInt("cnt");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	 boolean insertBook(Book book) {
		//å ����
		//å �������� ������ �ڵ尡 �����ϴ��� Ȯ��
		
		Statement statement =null;
		if(isBook(book.getCode())) {
			System.out.println(book.getCode() + " å �ڵ尡  �����մϴ�.");
			return false;
		}
		boolean res = false;
		int upd = 0;
		try {
			String sql = String.format("INSERT INTO book VALUES (%d, '%s', '%s', '%d')",
					book.getCode(), book.getName(), book.getAutor(), book.getCnt());
		//System.out.println(sql);
			statement = connection.createStatement();
			upd=statement.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement!=null) {
					statement.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res=(upd==0) ? false : true;
		return res;
	}	
	
	 boolean updateBook(int code, int cnt, boolean flag) {
		//�ݳ� �뿩
		//flag true: �ݳ�, false �뿩
		Statement statement = null;
		boolean res= false;
		int upd =0;
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE book SET cnt = cnt + %d WHERE (code = %d)", cnt, code);
			}
			else {
				sql = String.format("UPDATE book SET cnt = cnt - %d WHERE (code = %d)", cnt, code);
			}
			//System.out.println(sql);
			statement = connection.createStatement();
			upd=statement.executeUpdate(sql); //�����Ȱ� ��ȯ
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) {
					statement.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		res = (upd == 0)? false : true;
		return res;
	}
	
	 Book selectOne(int code) {
		//å �ڵ� �޾� ���� ����
		Statement statement = null;
		Book book = null;
		try {
			String sql = "SELECT * FROM book WHERE code = '" + code + "'";
			System.out.println(sql);
			statement =connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()) {
				book = new Book();
				book.setCode(resultSet.getInt("code"));
				book.setName(resultSet.getString("name"));
				book.setCnt(resultSet.getInt("cnt"));
				book.setAutor(resultSet.getString("autor"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement !=null) {
					statement.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
	}
	
	 ArrayList<Book> selectAll(){
		//��ü ���� ����
		Statement statement =null;
		ArrayList<Book> list = new ArrayList<>(); 
		try {
			String sql = "SELECT * FROM book ";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet =statement.executeQuery(sql);
			while(resultSet.next()) {
				Book book = new Book(resultSet.getInt("code"), resultSet.getString("name"),
						resultSet.getString("autor"), resultSet.getInt("cnt"));
				list.add(book);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement !=null) {
					statement.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}//�������
}