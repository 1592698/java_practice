package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ڿ��� ������ �Է¹޾� if���� ����ؼ� 
		//������ ����ϴ� �ڵ带 �ϼ��ϼ���
		//�Է��� 0~100���� �Է��� �˴ϴ�
		//������ �Ʒ��� �����ϴ�.
		// A:90~100 B:80~89 C:70~79 D:60~69 F:0~59
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		
		if( a>=90 && a<=100) {
			System.out.print("���� : A");
		}
		else if( a>=80 && a<=89) {
			System.out.print("���� : B");
		}
		else if( a>=70 && a<=79) {
			System.out.print("���� : C");
		}
		else if( a>=60 && a<=69) {
			System.out.print("���� : D");
		}
		else {
			System.out.print("���� : F");
		}
	}

}
