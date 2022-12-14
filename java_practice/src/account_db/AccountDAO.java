package account_db;

import java.sql.*;
import java.util.ArrayList;

public class AccountDAO {

	/*DB 서버와 접속하고 레코들 처리하는 기능
	 * 데이터베이스 처리에 관한 기능만으로 구성되는 객체를 DAO data access object 객체라고 함*/
	private Connection connection = null;
	
	public AccountDAO() {
		getConnection();
	}
	//디비 관련 시작
		private void getConnection() { //디비 연결
			try {
				String url = "jdbc:mariadb://localhost:3306/sample_java_account";
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
		public void disConnect() {//연결해제, 서비스 종료시에 사용
			try {
				if(connection !=null) {
					connection.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		boolean isAccount(int id) { //동일한 계좌가 있는지
			int res=0;
			try {
				String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id = '" + id + "'";
//				System.out.println(sql);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				resultSet.next();
				res=resultSet.getInt("cnt");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return res != 0 ? true : false;
		}
		 boolean insertAccount(Account account) {
			//계좌생성
			//계좌 생성전에 동일한 번호가 존재하는지 확인
			
			Statement statement =null;
			if(isAccount(account.getId())) {
				System.out.println(account.getId() + " 계좌가 존재합니다.");
				return false;
			}
			boolean res = false;
			int upd = 0;
			try {
				String sql = String.format("INSERT INTO account VALUES (%d, '%s','%d')",
						account.getId(), account.getName(), account.getBalance());
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
		
		 boolean updateBalance(int id, long money, boolean flag) {
			//입금 출금
			//flag true: 입금, false 출금
			Statement statement = null;
			boolean res= false;
			int upd =0;
			try {
				String sql;
				if(flag) {
					sql = String.format("UPDATE account SET balance = balance + %d WHERE (id = %d)", money, id);
				}
				else {
					sql = String.format("UPDATE account SET balance = balance - %d WHERE (id = %d)", money, id);
				}
				//System.out.println(sql);
				statement = connection.createStatement();
				upd=statement.executeUpdate(sql); //수정된거 반환
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
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
		
		 Account selectOne(int id) {
			//계좌 번호를 받아 정보 전달
			Statement statement = null;
			Account account = null;
			try {
				String sql = "SELECT * FROM account WHERE id = '" + id + "'";
				System.out.println(sql);
				statement =connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				
				if(resultSet.next()) {
					account = new Account();
					account.setId(resultSet.getInt("id"));
					account.setName(resultSet.getString("name"));
					account.setBalance(resultSet.getInt("balance"));
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
			return account;
		}
		
		 ArrayList<Account> selectAll(){
			//전체 정보 전달
			Statement statement =null;
			ArrayList<Account> list = new ArrayList<>(); 
			try {
				String sql = "SELECT * FROM account ";
				System.out.println(sql);
				statement = connection.createStatement();
				ResultSet resultSet =statement.executeQuery(sql);
				while(resultSet.next()) {
					Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"),
							resultSet.getInt("balance"));
					list.add(account);
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
