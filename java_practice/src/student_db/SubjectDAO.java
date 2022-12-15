package student_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.mariadb.jdbc.plugin.Codec;


public class SubjectDAO {

	//삭제 
	//추가
	//전체목록
	
	private Connection connection = null;
		
		
	public SubjectDAO() {
		getConnection();
	}
	
	//디비연결
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
 
		
		ArrayList<Subject> selectAll(){
			//전체 정보 전달
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
		}//디비종료
		
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
				System.out.println(subject.getCode() + " 과목 코드가  존재합니다.");
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
