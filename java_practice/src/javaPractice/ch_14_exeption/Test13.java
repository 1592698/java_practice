package javaPractice.ch_14_exeption;


import java.util.Scanner;

public class Test13 {

	private static final Scanner in =new Scanner(System.in);
	
	public static void input() {
		int age= 0;
		
		try {
			System.out.println("���� = ");
			age=Integer.parseInt(in.nextLine());
		}
		catch(NumberFormatException ex) {
			System.out.println("���� �߻� = " + ex.getMessage());
			return;
		}
		finally {
			System.out.printf("���� =%d\n", age);
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Method Start!");
		input();
		System.out.println("Main Method End!!");
	}

}