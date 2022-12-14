package javaPractice.ch_18_pattern;

import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_09_constructor.Account_test;

class AccountManager{


	private ArrayList<Account> list;
	private Scanner stdIn;
	
	public AccountManager() {
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
	private boolean isAccount(int id) {
		//���� �ߺ���ȸ�̱⶧���� account�� �������� ���� bool���� ����
		return (findAccountTraverse(id)==null) ? false: true;
	}
	//���� ��ȸ 
	   private int accountInput() {
	      System.out.print("���� ��ȣ : ");
	      int id = stdIn.nextInt();
	      return id;
	   }
	   //���¹�ȣ ���� �޽���   
	   public void accountErr() {
	      System.out.println("�ش� ���� ��ȣ�� �������� �ʽ��ϴ�.");
	   }

	   public void accountInfo() { //���
		   System.out.println(list.toString()+"\t");
	   }
	
   public void makeAccount() {
	      //���� ����
	      Account account = new Account();
	      
	      int id = accountInput();
	      if(isAccount(id)) {
	         System.out.println("���¹�ȣ �ߺ�");         
	      }
	      else {
	         account.setId(id);
	         
	         System.out.print("�̸� : ");
	         account.setName(stdIn.next());
	         
	         System.out.print("�Աݾ� : ");
	         account.setBalance(stdIn.nextLong());
	         
	         list.add(account);
	         
	         System.out.println("���°� �����Ǿ����ϴ�.");
	         System.out.println(list.toString()+"\t");   
	      }
	            
	   }
	public void deposit() {//�Ա�
		
		int id = accountInput();
		System.out.print("�Աݾ� : ");
	     long money = stdIn.nextLong();

	   //�ش� ���� ã��
	      for (Account account : list) {
	         if(account.getId()==id) {   //������ ���°� ������
	            account.setBalance(money + account.getBalance());
	            System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	            return;
	         }
	      }
	      accountErr();
	   }

		
//		System.out.print("�Աݾ� : ");
//	      long money = stdIn.nextLong();
//	      //�ش� ���� ã��
//	      for (Account account : list) {
//	         if(account.getId()==id) {   //������ ���°� ������
//	            account.setBalance(money + account.getBalance());
//	            System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
//	            return;
//	         }
//	      }
//	      accountErr();
	

	public void withdraw() {//���
		int id = accountInput();
	      
	      System.out.print("��ݾ� : ");
	      long money = stdIn.nextLong();
	      
	      for (Account account : list) {
	         if(account.getId() == id) {
	            if(account.getBalance() < money) {
	               System.out.println("�ܾ��� �����մϴ�.");
	            }
	            else {
	               account.setBalance(account.getBalance() - money);
	               System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	            }
	            return;
	         }
	      }
	      accountErr();
	}
	
	public void inquire() { //�ܾ���ȸ
		//�ܾ� ��ȸ
	      int id = accountInput();
	      
	      Account account = findAccount(id);
	      if(account !=null) {
	    	  System.out.println(account.getBalance());
	      }
	    }

	public void display() {  //���
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName()+"\t" + account.getBalance());
		}
	}
}
public class AccountView2 {

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

