package javaPractice.ch_09_constructor;

import java.util.Scanner;

public class Account_test {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("선택 > ");
			
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
			System.out.println("프로그램 종료");
		}
	}
	//계좌생성
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------");
		
		System.out.println("계좌 번호 : ");
		String ano =scanner.next();
		
		System.out.println("계좌주 : ");
		String owner = scanner.next();
		
		System.out.println("초기입금액: ");
		int balance=scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("결과: 계좌가 생성됐습니다~~!");
				break;
			}
		}
	}
	//계좌목록보기
	private static void accountList() {
		System.out.println("★★★★★★★★★계좌 목록보기★★★★★★★★★");
		System.out.println("");
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			
			if(account !=null) {
				System.out.print("계좌번호: " + account.getAno());
				System.out.print(" 이름: " + account.getOwner());
				System.out.println(" 잔액: " + account.getBalance());
				System.out.println("-------------------------------------");
				System.out.println("");
			}
		}
		
	}
	//예금하기
	private static void deposit() {
		
		System.out.println("계좌 번호 :");
		String ano = scanner.next();
		System.out.println("예금액 :");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다");
			return;

		}else {
			account.addBalance(balance);
			System.out.println("결과 : 입금이 성공되었습니다~");
			System.out.println("잔액 : " + account.getBalance());
			
		}	
	}

	//출금하기
	private static void widthdraw() {
		System.out.println("---------출금--------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("출금액 : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다");
			return;
		}else if(account.getBalance()<balance) {
			System.out.println("결과: 잔액보다 출금액이 커서 출금에 실패했습니다.");
			
		}
		
		else {
		account.subBalance(balance);
		System.out.println("결과 : 출금이 성공됐습니다~~~");
		System.out.println("잔액 : " + account.getBalance());
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static  Account findAccount(String ano) {
		
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				String dbAno=accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}else { //null값이 저장된 경우에는 더 이상 출력 할 필요가 ㄴ
				break;
			}
		}
		return account;
	}
		
}
