package javaPractice.ch_05_for;

import java.util.Scanner;

public class Test12_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ �Էµ� ������,
		//����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷� �ۼ�
		//while�� ���, break�����������
		Scanner scanner = new Scanner(System.in);
		int num=0;
		int sum =0;

		while(num>=0) {
			sum +=num;
			System.out.println("���� �Է��ϼ���: ");
			num = scanner.nextInt();
		}System.out.println("����: " +sum);
		
}
}