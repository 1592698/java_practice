package Test;

import java.util.Random;
import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int nextInt(int n) //int ������ 0~�Ű��������� ������ �����մϴ�
		Random random = new Random();
		answer = random.nextInt(999)+1;
		
		���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ����� ����
		1) 1���� 1000������ ���� �ϳ��� �����Ѵ�
		2) ����ڰ� ���� �����Ͽ� �Է��Ѵ�
		3) ������ �ƴ� ��� ������ �Է��� ������ ū�� Ȥ�� ������ �˷��ش�
		4) ������ ���, ���� �޽��� �� �õ� Ƚ�� ����Ұ�
		
		������ �����Ͽ� ���ÿ� : 500
		������ ������ �����ϴ�.
		
		�����մϴ� �õ�Ƚ�� = 8��
		*
		*/
		Scanner scanner = new Scanner(System.in);
		int answer; //������ �Է��� ����

		boolean run = true;
		int count =0;
		
		Random random = new Random();
		answer = random.nextInt(999)+1;
		int num; //������� ������ �Է¹��� ����
		while(run) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
			num = scanner.nextInt();
			count++;
			
			if(num<answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
			else if (num>answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
		
			else {
				System.out.println("�����Դϴ�. " + count + "�� ���� �õ���");
				run=false;
			}
		}
	}

}
