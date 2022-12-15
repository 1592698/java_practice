package student_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class StudentDAO {

	private Connection connection = null;
	
	
	public StudentDAO() {
		getConnection();
	}
	
	//��񿬰�
		private void getConnection() {
			try {
				String url = "jdbc:mariadb://localhost:3306/student";
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
		
		boolean isStudent(int studentNumber) {
			int res= 0;
			try {
				String sql = "SELECT COUNT(*) AS studentNumber FROM student WHERE studentNumber = '" + studentNumber + "'";
//				System.out.println(sql);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				resultSet.next();
				res=resultSet.getInt("studentNumber");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return res != 0 ? true : false;
		}
		
		boolean deleteStudent(int studentNumber) {
			boolean res = false;
			Statement statement =null;
			int upd = 0;
			try {
				String sql = "DELETE FROM student WHERE studentNumber = '"+studentNumber+"'";
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
		
		boolean insertStudent(Student student) {
			//���� �й��ִ���
			
			Statement statement =null;
			if(isStudent(student.getStudentNumber())) {
				System.out.println(student.getStudentNumber() + " �й���  �����մϴ�.");
				return false;
			}
			boolean res = false;
			int upd = 0;
			try {
				String sql = String.format("INSERT INTO student VALUES (%d, '%s', %d, '%s')",
						student.getStudentNumber(), student.getName(),  student.getPhoneNumber(), student.getMemo());
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
		
		boolean subjectAdd(int code) {
			Statement statement =null;
			boolean res = false;
			int upd = 0;
			try {
				String sql = "SELECT * FROM subject WHERE subject = '"+ code +"'";
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
		
		Student selectOne(int studentNumber) {
				//å �ڵ� �޾� ���� ����
				Statement statement = null;
				Student student = null;
				try {
					String sql = "SELECT * FROM student WHERE studentNumber = '" + studentNumber + "'";
					System.out.println(sql);
					statement =connection.createStatement();
					ResultSet resultSet = statement.executeQuery(sql);
					
					if(resultSet.next()) {
						student = new Student();
						student.setStudentNumber(resultSet.getInt("studentNumber"));
						student.setName(resultSet.getString("name"));
						student.setPhoneNumber(resultSet.getInt("phoneNumber"));
						student.setMemo(resultSet.getString("memo"));
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
				return student;
			}
			
			 ArrayList<Student> selectAll(){
				//��ü ���� ����
				Statement statement =null;
				ArrayList<Student> list = new ArrayList<>(); 
				try {
					String sql = "SELECT * FROM student ";
					System.out.println(sql);
					statement = connection.createStatement();
					ResultSet resultSet =statement.executeQuery(sql);
					while(resultSet.next()) {
						Student student = new Student(resultSet.getInt("studentNumber"), resultSet.getString("name"),
								resultSet.getInt("phoneNumber"), resultSet.getString("memo"));
						list.add(student);
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
