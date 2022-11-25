package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test21 {

	/*login() 메소드와 logout() 메소드를 선언하려고 합니다
	 * login() 메소드를 호출 할 때는 매개값으로 id와 password를 제공하고,
	 * logout() 메소드는 id 만 매개값으로 제공합니다
	 * 
	 * 1) login() 메소드는 매개값 id 가 " admin", 매개값 password가 "1234"일 경우에만 true을 리턴하고
	 * 그 외의 값일 경우에는 false를 리턴하도록 하세요
	 * 2) logout() 메소드는 "로그아웃 되었습니다"를 출력하도록 하세요
	 * */
	 static boolean login(String id, String password) {
		
		return(id.equals("admin") && password.equals("1234")) ;
			
	
	}
	static void logout(String id) {
		
		System.out.println("로그아웃 되었습니다.");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		String id;
		String password;
		System.out.println("아이디를 입력해 주세요. >> ");
		id= scanner.nextLine();
		System.out.println("비밀번호 입력해 주세요. >> ");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		
		if(result) {
			System.out.println("로그인 되었습니다");
			logout(id);
		}
		
		else { 
			System.out.println("id 또는 password가 틀렸습니다");
		}	
	}

}
