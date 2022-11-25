package javaPractice.ch_05_for;

import java.util.Scanner;

public class Test15_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//음수가 입력될 때까지,
				//사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램 작성
				//while문 사용, break사용하지말것
				Scanner scanner = new Scanner(System.in);
				int num;
				int sum =0;

//				while(num>=0) {
//					sum +=num;
//					System.out.println("정수 입력하세요: ");
//					num = scanner.nextInt();
//				}System.out.println("총합: " +sum);
//				
				
		do {
			System.out.println("정수 입력하세요: ");
			num = scanner.nextInt();
			if(num>=0) {
			sum+=num;
			}
			
		}
		while(num>=0);
		System.out.println("총합: " +sum); 
	}

}
