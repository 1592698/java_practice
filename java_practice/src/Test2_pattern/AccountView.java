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
	//�ش����ã��
	private Account findAccountTraverse(int id) {
		for(Account account : list) {
			if(account.getId()==id) { //������ ���°� �ִٸ�
				return account;
			}
		}
		return null;
	}
	private Account findAccount(int id) { 
		//�Ա�,���,��ȸ�ÿ� ����ã��
		Account account =findAccountTraverse(id);
		if(account == null) {
			System.out.println("���¸� ã�� �� �����ϴ�");
		}
		return account;
	}
	//��� ���� ����
	private void getConnection() { //��� ����
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
	
	public void disConnect() {//��������, ���� ����ÿ� ���
		try {
			if(connection !=null) {
				connection.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private boolean isAccount(int id) { //������ ���°� �ִ���
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
		//���»���
		//���� �������� ������ ��ȣ�� �����ϴ��� Ȯ��
		
		Statement statement =null;
		if(isAccount(account.getId())) {
			System.out.println(account.getId() + " ���°� �����մϴ�.");
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
		//�Ա� ���
		//flag true: �Ա�, false ���
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
			upd=statement.executeUpdate(sql); //�����Ȱ� ��ȯ
			
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
		//���� ��ȣ�� �޾� ���� ����
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
		//��ü ���� ����
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
	}//�������
	
	
	public void makeAccount() { //���� ����
		Account account = new Account();
		System.out.println("���¹�ȣ : ");
		account.setId(stdIn.nextInt());
		
		System.out.println("�̸� : ");
		account.setName(stdIn.next());
		
		System.out.println("�Աݾ� : ");
		account.setBalance(stdIn.nextLong());
		
//		list.add(account);
		if(insertAccount(account)) {
			System.out.println("���°� �����Ǿ����ϴ�.");
			//System.out.println(list.toString()+"\t");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�");
		}
	}

	public void deposit() {//�Ա�
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		System.out.println("�Աݾ�: ");
		long money = stdIn.nextLong();
		
		//�ش� ���� ã��
//		for(Account account : list) {
//			if(account.getId()==id) { //������ ���°� �ִٸ�
//				account.setBalance(money+account.getBalance());
//				System.out.println("�ԱݿϷ� �Ǿ����ϴ�");
//				selectOne(id);
//			}
//		}
//		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		
		//�ش� ���� ã��
		if(isAccount(id)) {
			updateBalance(id, money, true);
				System.out.println("�Ա� �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
		}
//		Account account = findAccount(id);
//		if(account !=null) {
//			account.setBalance(money + account.getBalance());
//			System.out.println("�Ա� �Ϸ�Ǿ����ϴ�.");
//		}
	}

	public void withdraw() {//���
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		System.out.println("��ݾ�");
		long money = stdIn.nextLong();
		
		//�ش���� ã��
		if(isAccount(id)) {
			Account account = selectOne(id);
			if(account.getBalance()<money) {
				System.out.println("�ܾ׺���");
			}
			else {
				updateBalance(id, money, false);
				System.out.println("��ݿϷ�");
			}
			return;
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}
	//�ش� ���� ã��
//		for(Account account : list) {
//			if(account.getId()==id) { //������ ���°� �ִٸ�
//				if(account.getBalance()<money) {
//					System.out.println("�ܾ� ����");
//			}
//				else {
//					account.setBalance(account.getBalance()-money);
//				}
//				return;
//			}
//		}
//		System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		
	}
	
	public void inquire() { //�ܾ���ȸ
		System.out.println("���¹�ȣ: ");
		int id = stdIn.nextInt();
		
		Account account = selectOne(id);
		//�ش� ���� ã��
//		for(Account account : list) {
//		if(account.getId()==id) { //������ ���°� �ִٸ�
//			System.out.println(account.getId() + "\t" + account.getName()+"\t" + account.getBalance());
//			return;
//		}
//	}
		if(account !=null) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}else{
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
		}
	}
	public void display() {  //���
	
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
			System.out.println("���� : ");
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
				System.out.println("���¹�ȣ\t����\t�ܾ�");
				manager.inquire();
				break;
			case 5:
				System.out.println("���¹�ȣ\t����\t�ݾ�");
				manager.display();
				break;
			case 6:
				manager.disConnect();
				System.out.println("�����մϴ�");
				stdIn.close();
				return;
			default:
				System.out.println("�߸� �����̽��ϴ�. \n�ٽ� �������ּ���");
				break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("=============Menu===============");
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. �ܾ���ȸ");
		System.out.println("5. ��ü���");
		System.out.println("6. ���α׷�����");
		System.out.println();
	}
}

