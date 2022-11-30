package javaPractice.ch_14_exeption;

public class Test02 {

	public static void main(String[] args) {

		int num =10;
		int num2= 10;
		
		try {
		System.out.println("** 정수 값을 0으로 나누는 연산 **");
		//부적절한 연산 수행
		System.out.println("10/0=" + (num / num2));
		System.out.println("try/catch 구문 밖 문장 수행");
	} catch(Exception e) { //Exception클래스 e 객체
		System.out.println(e);
		System.out.println("0으로 나눌 수 없습니다");
	}
		System.out.println("프로그램을 정상 수행합니다");
	}
}
