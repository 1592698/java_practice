package javaPractice.ch_03;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ڷ� ���� �� ���� ������ �Է¹޾Ƽ�
		//������ ��, ������ ��, ������ ��, ������ ���, ū ��, ���� ����
		//����Ͽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//ū ���� ���� ���� ���� ���� ���� ������ (���׿�����)�� ����Ͻÿ�\
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է�: ");
		x = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		y = sc.nextInt();
		
		System.out.println("�� ���� ��: " + (x + y));
		System.out.println("�� ���� ��: " + (x - y));
		System.out.println("�� ���� ��: " + (x * y));
		System.out.println("�� ���� ���: " + ((x + y) / 2));
		System.out.println("ū ����: " + (x > y ?  x : y));
		System.out.println("���� ����: " + (x < y ?  + x : y ));
		


		
		
	}

}
