package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� ������ �ִ밪 ���ϱ�
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		int max = a;
		if( b > max)
			max = b;
		if( c > max)
			max = c;
		
		System.out.println("�ִ밪�� " + max);
		
		int min = a;
		if( b < min)
			min = b;
		if( c < min)
			min = c;
		System.out.println("�ּҰ��� " + min);
		
	}

}