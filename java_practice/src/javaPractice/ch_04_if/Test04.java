package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.println("���̵� �Է��� �ּ���:");
		id = input.nextLine();
		
		if ( id.equals("java")) {
			System.out.println("���̵� ��ġ");
			System.out.println("��й�ȣ �Է��� �ּ���:");
			password = input.nextLine();
			
			if ( password.equals("abc123")) {
				System.out.println("��й�ȣ ��ġ");
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ ����ġ");
			}		
		}
		else { 
			System.out.println("���̵� ����ġ");
		}
		input.close();
	}

}
