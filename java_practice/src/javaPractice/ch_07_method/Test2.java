package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test2 {

	/* 
	 * */
	
	
	/* 접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수,
	 * 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능*/
	//매소드
	static int max ( int a, int b, int c) { //a,b,c의 최대값을 반환
		int max = a;
		if( b > max) max =b;
		if( c > max) max=c;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*메소드 사용의 장점
		 * 1)코드 반복을 줄일수 있음
		 * 대부분의 프로그램은 어떤 코드를 반복해서 사용
		 * 반복되는 코드를 방치하면 유지보수하는 사람은 반복하는 코드를 불편하게 느끼게 되고
		 * 코드가 반복되면 기억하고 불편을 느끼게 됨
		 * 또 코드를 개선하거나 유지보수할 때 여러부분을 수정해야하는 문제가 생김
		 * 
		 * 2) 더 높은 추상화를 할 수 있음
		 * 파로그램 내부에 있는 코드를 하나하나 신경 쓴다면 프로그램을 제대로 만들 수 없음
		 * 함수를 활용하면 세부 코드를 하나하나 신경쓰지 않아도, 메소드 이름만으로 원하는 처리 가능
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 a : ");
		int a = scanner.nextInt();
		System.out.println("정수 b : ");
		int b = scanner.nextInt();
		System.out.println("정수 c : ");
		int c = scanner.nextInt();
		
		System.out.println("최대값은 " + max(a, b, c) + " 입니다.");
	}

}
