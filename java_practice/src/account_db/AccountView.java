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
	
	//디비 관련 시작
	public void disConnect() {
		accountDAO.disConnect();
	}
	
	
	public void makeAccount() { //계좌 개설
		Account account = new Account();
		
		System.out.println("계좌번호 : ");
		account.setId(stdIn.nextInt());
		
		System.out.println("이름 : ");
		account.setName(stdIn.next());
		
		System.out.println("입금액 : ");
		account.setBalance(stdIn.nextLong());
		
//		list.add(account);
		if(accountDAO.insertAccount(account)) {
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
		if(accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
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
		if(accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id);
			if(account.getBalance()<money) {
				System.out.println("잔액부족");
			}
			else {
				accountDAO.updateBalance(id, money, false);
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
		
		Account account = accountDAO.selectOne(id);
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

