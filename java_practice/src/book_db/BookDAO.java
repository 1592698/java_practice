package book_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	
	/*데이터베이스와 자바를 연결해주기 위한 객체로 
	 * getConnection()메서드를 통해 DB를 연결하는 역할을 수행한다.*/
	private Connection connection = null;
	
	
	public BookDAO() {
		getConnection();
		
	}

	//디비연결
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
	
	//연결해제, 서비스 종료시에 사용
	public void disConnect() {
		try {
			if(connection !=null) {
				connection.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 책 검색
	   public ArrayList<Book> searchBook (String name) {
	      Statement statement = null;
	      /*Statement 정적 쿼리를 전달하기 위한 객체
	     	정적 쿼리라는 것은 Scanner와 같이 사용자로부터 인자를 받지않고 결과를 출력할 때 사용한다
	      */
	      
	      ArrayList<Book> books = new ArrayList<>();
	      
	      try {
	         String sql = "SELECT * FROM book WHERE name LIKE '%" + name + "%'";
	         statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql);
	         //ResultSet은 쿼리의 결과를 담은 객체
	         //ResultSet에 statement가 전달한 쿼리를 실행시켜줌으로서 결과 값을 가져온다.
	         //executeQuery()는 실행하는 메서드, ()안에는 쿼리 문자열을 넣어준다.
	         
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
		//책 생성
		//책 생성전에 동일한 코드가 존재하는지 확인
		
		Statement statement =null;
		if(isBook(book.getCode())) {
			System.out.println(book.getCode() + " 책 코드가  존재합니다.");
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
		//반납 대여
		//flag true: 반납, false 대여
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
			upd=statement.executeUpdate(sql); //수정된거 반환
			
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
		//책 코드 받아 정보 전달
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
		//전체 정보 전달
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
	}//디비종료
}