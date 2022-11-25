package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자에게 입력받은 정수가 양수인지, 0인지, 
		//음수인지 알려주는 코드를 완성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		if( a < 0) {
			System.out.print("음수입니다.");
		}
		else if ( a == 0 ) {
			System.out.print("0 입니다.");
		}
		else {
			System.out.print("양수입니다.");
		}
	
	}

}
