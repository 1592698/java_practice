package javaPractice.ch_07_method;

import java.lang.reflect.Method;

public class Test6 {

	
	//매개 변수를 2개 사용하는 메소드
	
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("결과값" + c );
	}
	//매개변수를 문자열로 받는 메소드 선언
	public void print1(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수 선언
		int num1 = 11; 
		int num2 = 22;
		int result = 0;
		
		//사용할 메소드가 있는 클래스의 인스턴스 선언
		Test6 method = new Test6();
		
		//메소드 호출
		method.print(10,20);
		//method.print(10,30.0f);
		method.print(num1, num2);
		method.print1("안녕하세요");
		
		
	}

}
