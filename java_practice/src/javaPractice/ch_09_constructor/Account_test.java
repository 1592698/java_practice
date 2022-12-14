package javaPractice.ch_09_constructor;

import java.util.Scanner;

public class Account_test {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. ???»??? | 2. ???¸??? | 3. ???? | 4. ???? | 5. ???? ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("???? > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}
			else if(selectNo ==2) {
				accountList();
			}
			else if(selectNo ==3) {
				deposit();
			}
			else if(selectNo==4) {
				widthdraw();
			}
			else if(selectNo ==5) {
				run =false;
			}
			System.out.println("???α׷? ????");
		}
	}
	//???»???
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("???»???");
		System.out.println("--------------------");
		
		System.out.println("???? ??ȣ : ");
		String ano =scanner.next();
		
		System.out.println("?????? : ");
		String owner = scanner.next();
		
		System.out.println("?ʱ??Աݾ?: ");
		int balance=scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("????: ???°? ?????ƽ??ϴ?~~!");
				break;
			}
		}
	}
	//???¸??Ϻ???
	private static void accountList() {
		System.out.println("?ڡڡڡڡڡڡڡڡڰ??? ???Ϻ????ڡڡڡڡڡڡڡڡ?");
		System.out.println("");
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			
			if(account !=null) {
				System.out.print("???¹?ȣ: " + account.getAno());
				System.out.print(" ?̸?: " + account.getOwner());
				System.out.println(" ?ܾ?: " + account.getBalance());
				System.out.println("-------------------------------------");
				System.out.println("");
			}
		}
		
	}
	//?????ϱ?
	private static void deposit() {
		
		System.out.println("???? ??ȣ :");
		String ano = scanner.next();
		System.out.println("???ݾ? :");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("???? : ???°? ?????ϴ?");
			return;

		}else {
			account.addBalance(balance);
			System.out.println("???? : ?Ա??? ?????Ǿ????ϴ?~");
			System.out.println("?ܾ? : " + account.getBalance());
			
		}	
	}

	//?????ϱ?
	private static void widthdraw() {
		System.out.println("---------????--------");
		System.out.println("???¹?ȣ : ");
		String ano = scanner.next();
		System.out.println("???ݾ? : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("???? : ???°? ?????ϴ?");
			return;
		}else if(account.getBalance()<balance) {
			System.out.println("????: ?ܾ׺??? ???ݾ??? Ŀ?? ???ݿ? ?????߽??ϴ?.");
			
		}
		
		else {
		account.subBalance(balance);
		System.out.println("???? : ?????? ?????ƽ??ϴ?~~~");
		System.out.println("?ܾ? : " + account.getBalance());
		}
	}
	
	//Account ?迭???? ano?? ?????? Account ??ü ã??
	private static  Account findAccount(String ano) {
		
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				String dbAno=accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}else { //null???? ?????? ???쿡?? ?? ?̻? ???? ?? ?ʿ䰡 ??
				break;
			}
		}
		return account;
	}
		
}
