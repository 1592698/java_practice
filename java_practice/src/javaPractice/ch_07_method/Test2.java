package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test2 {

	/* 
	 * */
	
	
	/* ���� �����ڸ� ������ �������� �ʴ´ٸ� ���� �����ڰ� ���� ����,
	 * �޼ҵ�� default ���� �����ڰ� �Ǿ� �ش� ��Ű�� �������� ������ ����*/
	//�żҵ�
	static int max ( int a, int b, int c) { //a,b,c�� �ִ밪�� ��ȯ
		int max = a;
		if( b > max) max =b;
		if( c > max) max=c;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*�޼ҵ� ����� ����
		 * 1)�ڵ� �ݺ��� ���ϼ� ����
		 * ��κ��� ���α׷��� � �ڵ带 �ݺ��ؼ� ���
		 * �ݺ��Ǵ� �ڵ带 ��ġ�ϸ� ���������ϴ� ����� �ݺ��ϴ� �ڵ带 �����ϰ� ������ �ǰ�
		 * �ڵ尡 �ݺ��Ǹ� ����ϰ� ������ ������ ��
		 * �� �ڵ带 �����ϰų� ���������� �� �����κ��� �����ؾ��ϴ� ������ ����
		 * 
		 * 2) �� ���� �߻�ȭ�� �� �� ����
		 * �ķα׷� ���ο� �ִ� �ڵ带 �ϳ��ϳ� �Ű� ���ٸ� ���α׷��� ����� ���� �� ����
		 * �Լ��� Ȱ���ϸ� ���� �ڵ带 �ϳ��ϳ� �Ű澲�� �ʾƵ�, �޼ҵ� �̸������� ���ϴ� ó�� ����
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = scanner.nextInt();
		System.out.println("���� b : ");
		int b = scanner.nextInt();
		System.out.println("���� c : ");
		int c = scanner.nextInt();
		
		System.out.println("�ִ밪�� " + max(a, b, c) + " �Դϴ�.");
	}

}
