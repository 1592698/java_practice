package Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int account = 10000; //���α׷� ���۽� ���� �ܾ�
		int deposit; //�Ա� �ݾ�
		int withdraw; //��� �ݾ�
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("�Ա� �ݾ��� �Է����ֽʽÿ�");
		deposit = scanner.nextInt(); //�Աݾ��� �Է� �޴´�
		account += deposit; //�����ܾ׿� �Աݾ��� ���Ѵ�
		System.out.println("�Ա��Ͻ� �ݾ��� : "  + deposit + "���̰�, �ܾ��� : " + account +"���Դϴ�.");
		
		while ( true ) {
			System.out.println("��ݱݾ��� �Է����ֽʽÿ�");
			withdraw = scanner.nextInt(); //��ݾ��� �Է� �޴´�
			
			if( withdraw == 0) { //��ݾ��� 0�̶��
				System.out.println("0���� �Է��ϼ̽��ϴ�. Ȯ���Ͻð� �ٽ� �Է��� �ֽʽÿ�.");
			}	
			else if ( withdraw <= account && account != 0 ) { //��ݾ��� �����ܾ׺��� �����̰� �����ܾ��� 0�� �ƴ� �� 
				account -= withdraw; //�����ܾ׿� ��ݾ��� ����
				System.out.println(withdraw + "���� ���ó���߰� �ܾ��� " +account+ "���Դϴ�.");
					if(account == 0){ //�����ܾ��� 0�� �� 
						System.out.println("�ܾ��� 0���̾ �ŷ��� ����˴ϴ�. �����մϴ�.");
						break;
					}
			}
			else if ( withdraw > account ) { //��ݾ��� �����ܾ׺��� Ŭ ���
				System.out.println("�ܾ��� " + account +"���ε� ��ݾ� " + withdraw + "���� �� Ŀ�� ����� �ȵ˴ϴ�.");
			} 	
		}
	}

}
