package javaPractice.ch_05_for;

import java.util.Scanner;

public class Test10_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String answer = "Y"; //while�� ���� �� �� �ֵ��� ���� ���� �ʱ�ȭ
		int count = 0;
		
		/* while ( answer.equals("Y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
			answer = scanner.nextLine(); //������� ������ �޽��ϴ�.
			
			if ( answer.equals("Y")) {
				++count;
				System.out.println("������ "+count+"�� ����߽��ϴ�.");
			}
			System.out.println("�������");
		} */
		
		/* for( answer = "Y"; answer.equals("Y") || answer.equals("y"); ) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y or y)");
			answer = scanner.nextLine(); //������� ������ �޽��ϴ�.
			if( answer.equals("Y") || answer.equals("y")) {
				++count;		
				System.out.println("������ "+count+"�� ����߽��ϴ�.");
			}	
		}System.out.println("�������"); */
		
	}

}
