package javaPractice.ch_05_for;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while, break�� ����Ͽ� ����ڰ� �Է��� �������� ����� ���� ���α׷��� �ۼ��մϴ�
		//���� ����ڰ� ������ �Է��ϸ� break�� ���Ͽ� �ݺ� ������ ����ǰ� �մϴ�
		
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum =0;
		int avg=0;
		int count=0;
		while(true) {
			System.out.println("������ �Է��ϼ��� : ");
			num = scanner.nextInt();
			if(num<0) {
				break;				
			}
			sum +=num;
			count++;
			avg = sum/count;
		}
			System.out.println("��� :" + avg);


		

	}

}
