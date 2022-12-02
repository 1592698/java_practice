package javaPractice.ch_14_exeption;
//�α��� ������ Ʋ����츦 ����� ���� ���ܸ� Ŭ������ ����� ����(����ó��) �� ��

import java.util.Scanner;

class LoginUncertainException extends Exception{
	public LoginUncertainException(String message) {
		super(message);
		}
		/*���ܰ� �߻��� �ÿ� �α׷� ����� �ڵ�*/
		public LoginUncertainException(String message, String memberID, String password) {
			super(message);
			updateLog(memberID, password);
		}
		public void updateLog(String memberID, String password) {
			
		}
}

public class Test17 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin(String memberID, String password) throws LoginUncertainException {
		if(this.memberID.equals(memberID)&& this.password.equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�");
			return true;
		}
		else {
			throw new LoginUncertainException ("�α��� ������ ��Ȯ���� �ʽ��ϴ�");
		}
	}
public void login() {
		String memberID, password;
		boolean answer;
		System.out.println("�α��� ������ �Է��� �ּ���");
		do {
			System.out.println("���̵� �Է��� �ּ��� >>>");
			memberID=stdIn.nextLine();
			System.out.println("��й�ȣ�� �Է��� �ּ��� >>>");
			password = stdIn.nextLine();
			
			try {
				answer = confirmLogin(memberID, password);
			} catch(LoginUncertainException e) {
				System.out.println(e.getMessage());
				answer =false;
			}
		}
		while(!answer);
	}
	public static void main(String[] args) {
		Test17 ex = new Test17();
		ex.login();
	}
}
