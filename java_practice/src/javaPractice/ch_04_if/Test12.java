package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ڿ��� ������ �Է¹޾� if���� ����ؼ� 
		//������ ����ϴ� �ڵ带 �ϼ��ϼ���
		//�Է��� 0~100���� �Է��� �˴ϴ�
		//������ �Ʒ��� �����ϴ�.
		// A:90~100 B:80~89 C:70~79 D:60~69 F:0~59
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int score = sc.nextInt();
		char grade = ' ';
		switch(score/10) {

		case 10: case 9:
			grade ='A';
			break;
		case 8:
			grade ='B';
			break;
		case 7:
			grade ='C';
			break;
		case 6:
			grade ='D';
			break;
		default:
			grade ='F';
			break;
		}
		System.out.println("������ : " + grade);
		sc.close();
				
	}

}
