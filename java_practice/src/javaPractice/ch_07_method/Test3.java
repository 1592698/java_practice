package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test3 {

	static int max(int a , int b) { //a,b�� �ִ밪 ��ȯ
		//return�� ������ ���͵���
		
		System.out.println("�Լ�����");
		if(a>b)
			return a;
		else 
			return b;
			//System.out.println("�Լ� ����");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = scanner.nextInt();
		System.out.println("���� b : ");
		int b = scanner.nextInt();

		
		System.out.println("�ִ밪�� " + max(a, b) + " �Դϴ�.");
	}

}
