package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test21 {

	/*login() �޼ҵ�� logout() �޼ҵ带 �����Ϸ��� �մϴ�
	 * login() �޼ҵ带 ȣ�� �� ���� �Ű������� id�� password�� �����ϰ�,
	 * logout() �޼ҵ�� id �� �Ű������� �����մϴ�
	 * 
	 * 1) login() �޼ҵ�� �Ű��� id �� " admin", �Ű��� password�� "1234"�� ��쿡�� true�� �����ϰ�
	 * �� ���� ���� ��쿡�� false�� �����ϵ��� �ϼ���
	 * 2) logout() �޼ҵ�� "�α׾ƿ� �Ǿ����ϴ�"�� ����ϵ��� �ϼ���
	 * */
	 static boolean login(String id, String password) {
		
		return(id.equals("admin") && password.equals("1234")) ;
			
	
	}
	static void logout(String id) {
		
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		String id;
		String password;
		System.out.println("���̵� �Է��� �ּ���. >> ");
		id= scanner.nextLine();
		System.out.println("��й�ȣ �Է��� �ּ���. >> ");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			logout(id);
		}
		
		else { 
			System.out.println("id �Ǵ� password�� Ʋ�Ƚ��ϴ�");
		}	
	}

}
