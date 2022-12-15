package student_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CourseDAO {

	private Connection connection = null;
	
	
	public CourseDAO() {
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
		
//		boolean isCourse(int code, int studentNumber) {
//			int res= 0;
//			try {
//				String sql = "SELECT COUNT(*) AS code FROM course WHERE code = '" + code + "' and studentNumber = '" + studentNumber + "'";
////				System.out.println(sql);
//				Statement statement = connection.createStatement();
//				ResultSet resultSet = statement.executeQuery(sql);
//				resultSet.next();
//				res=resultSet.getInt("code");
//				
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			return res != 0 ? true : false;
//		}
		
		boolean isCourse( int studentNumber) {
			int res= 0;
			try {
				String sql = "SELECT COUNT(*) AS code FROM course WHERE studentNumber = '" + studentNumber + "'";
//				System.out.println(sql);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				resultSet.next();
				res=resultSet.getInt("code");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return res != 0 ? true : false;
		}
		
		boolean updateScore(int code, int studentNumber, int score) {
			Statement statement =null;
		
			boolean res = false;
			int upd = 0;
			try {
				String sql;
			
					//update ���̺� set �ʵ� = �� [ �ʵ� = �� ] where ����
					sql = String.format("UPDATE course SET score = %d WHERE (code = %d) and (studentNumber = %d) ", score, code, studentNumber);
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
		
		boolean insertCourse(Course course) {
			Statement statement =null;
//			if(isCourse(/*course.getCode(),*/ course.getStudentNumber())) {
//				System.out.println(course.getCode() + " ���� �ڵ尡  �����մϴ�.");
//				return false;
//			}
			boolean res = false;
			int upd = 0;
			try {
				String sql = String.format("INSERT INTO course VALUES (%d, %d, %d)",
						course.getCode(), course.getStudentNumber(), course.getScore());
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
		
		boolean deleteCourse(int code) {
			boolean res = false;
			Statement statement =null;
			int upd = 0;
			try {
				String sql = "DELETE FROM course WHERE code ='"+ code +"' ";
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
		ArrayList<Course> selectAll(){
			//��ü ���� ����
			Statement statement =null;
			ArrayList<Course> list = new ArrayList<>(); 
			try {
				String sql = "SELECT * FROM course ";
				System.out.println(sql);
				statement = connection.createStatement();
				ResultSet resultSet =statement.executeQuery(sql);
				while(resultSet.next()) {
					Course course = new Course(resultSet.getInt("code"), resultSet.getInt("studentNumber"));
					list.add(course);
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
