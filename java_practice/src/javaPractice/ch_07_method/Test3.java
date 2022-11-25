package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test3 {

	static int max(int a , int b) { //a,b의 최대값 반환
		//return이 여러번 나와도됨
		
		System.out.println("함수시작");
		if(a>b)
			return a;
		else 
			return b;
			//System.out.println("함수 종료");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = scanner.nextInt();
		System.out.println("정수 b : ");
		int b = scanner.nextInt();

		
		System.out.println("최대값은 " + max(a, b) + " 입니다.");
	}

}
