package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ�:");
		int age; //1) ������ ����
		age = input.nextInt();
		
		//2)���ڿ��� �Է� ���� �Ŀ� ����ȭ
		//String tmp;
		//tmp = input.nextLine();
		//age = Integer.parseInt(tmp);
		
//		if ( age > 19 ) { //20~
//			System.out.println("�����Դϴ�.");
//			System.out.println("���ο���� ����˴ϴ�.");
//			
//		}
//		else if ( age > 13) { // 14~19
//			System.out.println("û�ҳ��Դϴ�.");
//			System.out.println("û�ҳ����� ����˴ϴ�.");
//		}
//		else if ( age > 8) { //8~13
//			System.out.println("����Դϴ�.");
//			System.out.println("��̿���� ����˴ϴ�.");
//		}
//		else  {
//			System.out.println("�����Դϴ�.");
//			System.out.println("���ƿ���� ����˴ϴ�.");
//		}
//		System.out.println("������ ������ �ּ���");
		

		if ( age <=8 ) { //20~
			System.out.println("�����Դϴ�.");
			System.out.println("���ƿ���� ����˴ϴ�.");
			
		}
		else if ( age <= 13) { 
			System.out.println("����Դϴ�.");
			System.out.println("��̿���� ����˴ϴ�.");
		}
		else if ( age <= 20) { 
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ����� ����˴ϴ�.");
		}
		else  {
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���");
	}

}
