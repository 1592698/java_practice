package javaPractice.ch_07_method;

public class Test13 {

	/*매소드 오버로딩
	 * c, 파이썬 없음. 매개변수의 타입 혹은 개수가 다르면 같은 이름을 가진 메소드를 재정의 할 수 있음
	 * c++, 파이썬에 있는 기본값 기능은 자바에 없음
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGreet(); //안녕하세요
		printGreet("안녕~!"); //안녕~!
		printGreet("한수", "잘 지내셨나요?"); //한수님! 잘 지내셨나요?
		printGreet(3); //안녕하세요. 3번째 보는거네요.
		
	}
	
	public static void printGreet() {
		System.out.println("printGreet() 메소드가 실행합니다.");
		System.out.println("안녕하세요");
	}
	public static void printGreet(String greeting) {
		//같은 이름의 메소드가 있으나 매개변수가 없음
		System.out.println("printGreet(String greeting) 메소드가 실행됩니다.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) {
		//매개변수가 문자열인 메소드가 있으나 개수가 다름
		System.out.println("pringGreet(String name, String greeting) 메소드가 실행됩니다");
		System.out.println(name + "님! " + greeting);
	}
	public static void printGreet(int cnt) {
		//매개변수가 하나인 메소드가 있으나 데이터 타입이 다름
	System.out.println("printGreet(int cnt) 메소드가 실행됩니다");
		System.out.println("안녕하세요." + cnt + "번째 보는거네요.");
	}
}
