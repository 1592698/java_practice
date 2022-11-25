package javaPractice.ch_05_for;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while, break를 사용하여 사용자가 입력한 점수들의 평균을 내는 프로그램을 작성합니다
		//만약 사용자가 음수를 입력하면 break에 의하여 반복 루프가 종료되게 합니다
		
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum =0;
		int avg=0;
		int count=0;
		while(true) {
			System.out.println("점수를 입력하세요 : ");
			num = scanner.nextInt();
			if(num<0) {
				break;				
			}
			sum +=num;
			count++;
			avg = sum/count;
		}
			System.out.println("평균 :" + avg);


		

	}

}
