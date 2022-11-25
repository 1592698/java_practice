package javaPractice.ch_07_method;

public class Test18 {

	public static void main(String[] args) {

		/*밑변 30 높이 10인 사각형의 넓이를 출력하세요
		 * 단 메소드 calculator()를 호출해서 출력하세요
		 * 결과값:
		 * <계산을 시작합니다.
		 * 밑변이 30, 높이가 10인 사각형의 넓이는 300입니다.*/
		
		int a =30;
		int b =10;

		System.out.println("밑변이 " + a + ", 높이가 " + b + "인 사각형의 넓이는 " +calculator(a, b)+ " 입니다.");
		
	}

	public static int calculator(int a, int b) {
		System.out.println("<계산을 시작합니다.");
		int area = a * b; //밑변 * 높이 = 사각형의 넓이
		return area;
	}
}
