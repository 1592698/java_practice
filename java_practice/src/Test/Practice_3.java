package Test;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*������ �Է� �� ������, ����ڰ� �Է��� ������ �հ踦 
		 * ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���
		 * while���� ���, break ������� �� ��
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		//while���� ������ 1) ó���� ���� �Ǿ���ϰ�,
		//2) �տ� ������ ��ġ�� �ʾƾ���
		while ( num >= 0 ) {
			sum += num;
			System.out.println("������ �Է��ϼ���");
			 num = scanner.nextInt(); //���� �Է�
		}
		System.out.println("�հ�" + sum);
	
	}

}
