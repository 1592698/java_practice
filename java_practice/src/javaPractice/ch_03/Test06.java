package javaPractice.ch_03;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*�ֿܼ��� �Է��� ���� ���� ScannerŬ���� ��� */
		
		Scanner sc = new Scanner(System.in);
		int x,y,sum;
		
		System.out.print("ù ��° ���� �Է�: "); //���� �ٲ��� �ʴ´� println�� ���� �ٲ����
		x = sc.nextInt(); //�����Է�
		
		System.out.print("�� ���� ���� �Է�: ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum);// ���� ����Ѵ�
	}

}
