package javaPractice.ch_03;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자로 부터 두 개의 정수를 입력받아서
		//정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를
		//계산하여 화면에 출력하는 프로그램을 작성하시오
		//큰 수와 작은 수를 구할 때는 조건 연산자 (삼항연산자)를 사용하시오\
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력: ");
		x = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		y = sc.nextInt();
		
		System.out.println("두 수의 합: " + (x + y));
		System.out.println("두 수의 차: " + (x - y));
		System.out.println("두 수의 곱: " + (x * y));
		System.out.println("두 수의 평균: " + ((x + y) / 2));
		System.out.println("큰 수는: " + (x > y ?  x : y));
		System.out.println("작은 수는: " + (x < y ?  + x : y ));
		


		
		
	}

}
