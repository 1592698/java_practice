package javaPractice.ch_05_for;

import java.util.Scanner;

public class Test15_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//������ �Էµ� ������,
				//����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷� �ۼ�
				//while�� ���, break�����������
				Scanner scanner = new Scanner(System.in);
				int num;
				int sum =0;

//				while(num>=0) {
//					sum +=num;
//					System.out.println("���� �Է��ϼ���: ");
//					num = scanner.nextInt();
//				}System.out.println("����: " +sum);
//				
				
		do {
			System.out.println("���� �Է��ϼ���: ");
			num = scanner.nextInt();
			if(num>=0) {
			sum+=num;
			}
			
		}
		while(num>=0);
		System.out.println("����: " +sum); 
	}

}
