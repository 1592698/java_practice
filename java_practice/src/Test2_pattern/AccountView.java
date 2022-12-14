package Test2_pattern;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_18_pattern.Account;

class AccountManager{

	private ArrayList<Account> list;
	private Scanner stdIn;
	private Connection connection = null;
	
	public AccountManager() {
		getConnection();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	//해당계좌찾기
	private Account findAccountTraverse(int id) {
		for(Account account : list) {
			if(account.getId()==id) { //동일한 계좌가 있다면
				return account;
			}
		}
		return null;
	}
	private Account findAccount(int id) { 
		//입금,출금,조회시에 계좌찾기
		Account account =findAccountTraverse(id);
		if(account == null) {
			System.out.println("계좌를 찾을 수 없습니다");
		}
		return account;
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
	
	private boolean isAccount(int id) { //동일한 계좌가 있는지
		int res=0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM account WHERE id = '" + id + "'";
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
	private boolean insertAccount(Account account) {
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
	
	private boolean updateBalance(int id, long money, boolean flag) {
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
	
	private Account selectOne(int id) {
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
	
	private ArrayList<Account> selectAll(){
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
	
	
	public void makeAccount() { //계좌 개설
		Account account = new Account();
		System.out.println("계좌번호 : ");
		account.setId(stdIn.nextInt());
		
		System.out.println("이름 : ");
		account.setName(stdIn.next());
		
		System.out.println("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
//		list.add(account);
		if(insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다.");
			//System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다");
		}
	}

	public void deposit() {//입금
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("입금액: ");
		long money = stdIn.nextLong();
		
		//해당 계좌 찾기
//		for(Account account : list) {
//			if(account.getId()==id) { //동일한 계좌가 있다면
//				account.setBalance(money+account.getBalance());
//				System.out.println("입금완료 되었습니다");
//				selectOne(id);
//			}
//		}
//		System.out.println("해당 계좌번호가 존재하지 않습니다");
		
		//해당 계좌 찾기
		if(isAccount(id)) {
			updateBalance(id, money, true);
				System.out.println("입금 완료되었습니다.");
		}
		else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}
//		Account account = findAccount(id);
//		if(account !=null) {
//			account.setBalance(money + account.getBalance());
//			System.out.println("입금 완료되었습니다.");
//		}
	}

	public void withdraw() {//출금
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("출금액");
		long money = stdIn.nextLong();
		
		//해당계좌 찾기
		if(isAccount(id)) {
			Account account = selectOne(id);
			if(account.getBalance()<money) {
				System.out.println("잔액부족");
			}
			else {
				updateBalance(id, money, false);
				System.out.println("출금완료");
			}
			return;
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}
	//해당 계좌 찾기
//		for(Account account : list) {
//			if(account.getId()==id) { //동일한 계좌가 있다면
//				if(account.getBalance()<money) {
//					System.out.println("잔액 부족");
//			}
//				else {
//					account.setBalance(account.getBalance()-money);
//				}
//				return;
//			}
//		}
//		System.out.println("해당 계좌번호가 존재하지 않습니다");
		
	}
	
	public void inquire() { //잔액조회
		System.out.println("계좌번호: ");
		int id = stdIn.nextInt();
		
		Account account = selectOne(id);
		//해당 계좌 찾기
//		for(Account account : list) {
//		if(account.getId()==id) { //동일한 계좌가 있다면
//			System.out.println(account.getId() + "\t" + account.getName()+"\t" + account.getBalance());
//			return;
//		}
//	}
		if(account !=null) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}else{
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}
	}
	public void display() {  //출금
	
		ArrayList<Account>list = selectAll();
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName()+"\t" + account.getBalance());
		}
	}
	
}
public class AccountView {

	public static void main(String[] args) {

		AccountManager manager = new AccountManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("선택 : ");
			int choice = stdIn.nextInt();
			switch(choice) {
			case 1:
				
				manager.makeAccount();
				break;
			case 2:
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4:
				System.out.println("계좌번호\t성명\t잔액");
				manager.inquire();
				break;
			case 5:
				System.out.println("계좌번호\t성명\t금액");
				manager.display();
				break;
			case 6:
				manager.disConnect();
				System.out.println("종료합니다");
				stdIn.close();
				return;
			default:
				System.out.println("잘못 누르셨습니다. \n다시 선택해주세요");
				break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("=============Menu===============");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 전체출력");
		System.out.println("6. 프로그램종료");
		System.out.println();
	}
}

