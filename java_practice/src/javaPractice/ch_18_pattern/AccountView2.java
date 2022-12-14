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
	private boolean isAccount(int id) {
		//계좌 중복조회이기때문에 account을 리턴하지 말고 bool값을 리턴
		return (findAccountTraverse(id)==null) ? false: true;
	}
	//계좌 조회 
	   private int accountInput() {
	      System.out.print("계좌 번호 : ");
	      int id = stdIn.nextInt();
	      return id;
	   }
	   //계좌번호 없음 메시지   
	   public void accountErr() {
	      System.out.println("해당 계좌 번호가 존재하지 않습니다.");
	   }

	   public void accountInfo() { //출력
		   System.out.println(list.toString()+"\t");
	   }
	
   public void makeAccount() {
	      //계좌 개설
	      Account account = new Account();
	      
	      int id = accountInput();
	      if(isAccount(id)) {
	         System.out.println("계좌번호 중복");         
	      }
	      else {
	         account.setId(id);
	         
	         System.out.print("이름 : ");
	         account.setName(stdIn.next());
	         
	         System.out.print("입금액 : ");
	         account.setBalance(stdIn.nextLong());
	         
	         list.add(account);
	         
	         System.out.println("계좌가 개설되었습니다.");
	         System.out.println(list.toString()+"\t");   
	      }
	            
	   }
	public void deposit() {//입금
		
		int id = accountInput();
		System.out.print("입금액 : ");
	     long money = stdIn.nextLong();

	   //해당 계좌 찾기
	      for (Account account : list) {
	         if(account.getId()==id) {   //동일한 계좌가 있으면
	            account.setBalance(money + account.getBalance());
	            System.out.println("입금이 완료되었습니다.");
	            return;
	         }
	      }
	      accountErr();
	   }

		
//		System.out.print("입금액 : ");
//	      long money = stdIn.nextLong();
//	      //해당 계좌 찾기
//	      for (Account account : list) {
//	         if(account.getId()==id) {   //동일한 계좌가 있으면
//	            account.setBalance(money + account.getBalance());
//	            System.out.println("입금이 완료되었습니다.");
//	            return;
//	         }
//	      }
//	      accountErr();
	

	public void withdraw() {//출금
		int id = accountInput();
	      
	      System.out.print("출금액 : ");
	      long money = stdIn.nextLong();
	      
	      for (Account account : list) {
	         if(account.getId() == id) {
	            if(account.getBalance() < money) {
	               System.out.println("잔액이 부족합니다.");
	            }
	            else {
	               account.setBalance(account.getBalance() - money);
	               System.out.println("출금이 완료되었습니다.");
	            }
	            return;
	         }
	      }
	      accountErr();
	}
	
	public void inquire() { //잔액조회
		//잔액 조회
	      int id = accountInput();
	      
	      Account account = findAccount(id);
	      if(account !=null) {
	    	  System.out.println(account.getBalance());
	      }
	    }

	public void display() {  //출력
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

