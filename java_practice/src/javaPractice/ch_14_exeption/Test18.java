package javaPractice.ch_14_exeption;

import java.util.Scanner;

class ExceptionOccur {
	private static final Scanner in = new Scanner(System.in);
	private int kor;
	
	//예외 던지기 예
	
	public void input() throws IndexOutOfBoundsException {
		System.out.print("국어 점수 = ");
		kor = in.nextInt();
		if(kor<0 || kor>100) {
			throw new IndexOutOfBoundsException("0~100점만 입력가능");
		}
	}
	public void output() {
		System.out.printf("국어 점수는 %d점입니다. \n", kor);
	}
}
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionOccur expExceptionOccur = new ExceptionOccur();
		try {
			expExceptionOccur.input();
			expExceptionOccur.output();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("0~100점만 입력가능");
		}
	}

}
