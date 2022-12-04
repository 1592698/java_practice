package javaPractice.ch_14_exeption;

import java.util.Scanner;

class ExceptionOccur {
	private static final Scanner in = new Scanner(System.in);
	private int kor;
	
	//���� ������ ��
	
	public void input() throws IndexOutOfBoundsException {
		System.out.print("���� ���� = ");
		kor = in.nextInt();
		if(kor<0 || kor>100) {
			throw new IndexOutOfBoundsException("0~100���� �Է°���");
		}
	}
	public void output() {
		System.out.printf("���� ������ %d���Դϴ�. \n", kor);
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
			System.out.println("0~100���� �Է°���");
		}
	}

}