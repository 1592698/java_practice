package javaPractice.ch_07_method;

public class Test5 {

	
	//함수에 int a랑 void main에 int a는 각각 영역이 달라서 똑같이 선언해도 다름
	//int a는 함수 호출하고 나면 사라짐
	
	/*매개 변수가 있는 메소드
	 * 매게 변수는 메서드 호출시 메모리에 생성되고 , 호출 후 복귀 시 소멸 */
	
	public void print(int a) {
		System.out.println("결과값" + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		int b = 22;
		int result = 0;
		
		//사용할 메소드가 있는 클래스의 인스턴스 선언
		
		Test5 method = new Test5();
		method.print(10);
		method.print(b);
		method.print(result);
		
	}

}
