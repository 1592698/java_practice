package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ڿ��� �Է¹��� ������ �������, 0����, 
		//�������� �˷��ִ� �ڵ带 �ϼ��ϼ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		
		if( a < 0) {
			System.out.print("�����Դϴ�.");
		}
		else if ( a == 0 ) {
			System.out.print("0 �Դϴ�.");
		}
		else {
			System.out.print("����Դϴ�.");
		}
	
	}

}
