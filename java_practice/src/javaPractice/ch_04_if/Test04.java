package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요:");
		id = input.nextLine();
		
		if ( id.equals("java")) {
			System.out.println("아이디 일치");
			System.out.println("비밀번호 입력해 주세요:");
			password = input.nextLine();
			
			if ( password.equals("abc123")) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 불일치");
			}		
		}
		else { 
			System.out.println("아이디 불일치");
		}
		input.close();
	}

}
