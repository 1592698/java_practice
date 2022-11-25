package Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int account = 10000; //프로그램 시작시 계좌 잔액
		int deposit; //입금 금액
		int withdraw; //출금 금액
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("입금 금액을 입력해주십시요");
		deposit = scanner.nextInt(); //입금액을 입력 받는다
		account += deposit; //계좌잔액에 입금액을 더한다
		System.out.println("입금하신 금액은 : "  + deposit + "원이고, 잔액은 : " + account +"원입니다.");
		
		while ( true ) {
			System.out.println("출금금액을 입력해주십시요");
			withdraw = scanner.nextInt(); //출금액을 입력 받는다
			
			if( withdraw == 0) { //출금액이 0이라면
				System.out.println("0원을 입력하셨습니다. 확인하시고 다시 입력해 주십시요.");
			}	
			else if ( withdraw <= account && account != 0 ) { //출금액이 계좌잔액보다 이하이고 계좌잔액이 0이 아닐 때 
				account -= withdraw; //계좌잔액에 출금액을 뺀다
				System.out.println(withdraw + "원을 출금처리했고 잔액은 " +account+ "원입니다.");
					if(account == 0){ //계좌잔액이 0일 때 
						System.out.println("잔액이 0원이어서 거래가 종료됩니다. 감사합니다.");
						break;
					}
			}
			else if ( withdraw > account ) { //출금액이 계좌잔액보다 클 경우
				System.out.println("잔액은 " + account +"원인데 출금액 " + withdraw + "원이 더 커서 출금이 안됩니다.");
			} 	
		}
	}

}
