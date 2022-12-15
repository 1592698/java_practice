package student_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.mariadb.jdbc.plugin.Codec;


public class SubjectDAO {

	//���� 
	//�߰�
	//��ü���
	
	private Connection connection = null;
		
		
	public SubjectDAO() {
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
 
		
		ArrayList<Subject> selectAll(){
			//��ü ���� ����
			Statement statement =null;
			ArrayList<Subject> list = new ArrayList<>(); 
			try {
				String sql = "SELECT * FROM subject ";
//				System.out.println(sql);
				statement = connection.createStatement();
				ResultSet resultSet =statement.executeQuery(sql);
				while(resultSet.next()) {
					Subject subject = new Subject(resultSet.getInt("code"), resultSet.getString("subjectName"));
					list.add(subject);
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
		
		boolean isSubject(int code) {
			int res= 0;
			try {
				String sql = "SELECT COUNT(*) AS code FROM subject WHERE code = '" + code + "'";
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
		boolean insertSubject(Subject subject) {
			Statement statement =null;
			if(isSubject(subject.getCode())) {
				System.out.println(subject.getCode() + " ���� �ڵ尡  �����մϴ�.");
				return false;
			}
			boolean res = false;
			int upd = 0;
			try {
				String sql = String.format("INSERT INTO subject VALUES (%d, '%s')",
						subject.getCode(), subject.getSubjectName());
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
		
		boolean deleteSubject(int code) {
			boolean res = false;
			Statement statement =null;
			int upd = 0;
			try {
				String sql = " DELETE FROM subject WHERE code='" + code + "' ";
//				
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
}
