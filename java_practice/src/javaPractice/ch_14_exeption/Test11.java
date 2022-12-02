package javaPractice.ch_14_exeption;

public class Test11 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생
			System.out.println(4); //실행되지 않는다
		}
		catch(ArithmeticException ae) {
			//참조변수 ae를 통해, 생성된 ArithmeticException 인스턴스에 접근 할 수 있다
			ae.printStackTrace();
			System.out.println("예외 메시지: " + ae.getMessage());
		} //try-catch끝
		System.out.println(6);
	}

}
