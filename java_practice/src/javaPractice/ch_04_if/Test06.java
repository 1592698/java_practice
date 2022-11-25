package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//세 정수의 최대값 구하기
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		int max = a;
		if( b > max)
			max = b;
		if( c > max)
			max = c;
		
		System.out.println("최대값은 " + max);
		
		int min = a;
		if( b < min)
			min = b;
		if( c < min)
			min = c;
		System.out.println("최소값은 " + min);
		
	}

}
