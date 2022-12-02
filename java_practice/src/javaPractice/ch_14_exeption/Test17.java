package javaPractice.ch_14_exeption;
//로그인 정보가 틀린경우를 사용자 정의 예외를 클래스를 만들고 적용(예외처리) 할 것

import java.util.Scanner;

class LoginUncertainException extends Exception{
	public LoginUncertainException(String message) {
		super(message);
		}
		/*예외가 발생할 시에 로그로 남기는 코드*/
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
			System.out.println("로그인 되었습니다");
			return true;
		}
		else {
			throw new LoginUncertainException ("로그인 정보가 정확하지 않습니다");
		}
	}
public void login() {
		String memberID, password;
		boolean answer;
		System.out.println("로그인 정보를 입력해 주세요");
		do {
			System.out.println("아이디를 입력해 주세요 >>>");
			memberID=stdIn.nextLine();
			System.out.println("비밀번호를 입력해 주세요 >>>");
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
