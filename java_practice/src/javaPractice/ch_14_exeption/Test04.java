package javaPractice.ch_14_exeption;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;
		int b=2;
		try { 
			System.out.println("외부로 연결");
			int c = b/a;
			System.out.println("연결해제");
		}
		catch (ArithmeticException e) {
			System.out.println("오류가 발생");
		}
		finally {
			System.out.println("연결해제");
		}
		System.out.println("여기도 수행됩니다");
	}

}
