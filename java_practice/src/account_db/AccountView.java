package account_db;

import java.util.ArrayList;
import java.util.Scanner;


class AccountManager{

	private ArrayList<Account> list;
	private Scanner stdIn;
	private AccountDAO accountDAO;
	
	public AccountManager() {
		accountDAO = new AccountDAO();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	//��� ���� ����
	public void disConnect() {
		accountDAO.disConnect();
	}
	
	
	public void makeAccount() { //���� ����
		Account account = new Account();
		
		System.out.println("���¹�ȣ : ");
		account.setId(stdIn.nextInt());
		
		System.out.println("�̸� : ");
		account.setName(stdIn.next());
		
		System.out.println("�Աݾ� : ");
		account.setBalance(stdIn.nextLong());
		
//		list.add(account);
		if(accountDAO.insertAccount(account)) {
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
		if(accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
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
		if(accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id);
			if(account.getBalance()<money) {
				System.out.println("�ܾ׺���");
			}
			else {
				accountDAO.updateBalance(id, money, false);
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
		
		Account account = accountDAO.selectOne(id);
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
	
		ArrayList<Account>list = accountDAO.selectAll();
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

