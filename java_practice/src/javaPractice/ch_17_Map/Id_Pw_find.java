package javaPractice.ch_17_Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Id_Pw_find {
	/* 아이디와 비밀번호 검사하기
	 * 아이디 비번을 입력을 받아서 map에 저장된 값과 비교를 해서 
	 * 1) 동일한 아이디 비번이 있는 경우에는 "로그인되었습니다"
	 * 2) 동일한 아이디는 있는데 비번이 틀린 경우 "비밀번호가 일치하지 않습니다"
	 * 3) 동일한 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다" 가 출력 되도록 하라*/
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); //키와 값으로 String을 사용
		
		//아이디와 비번을 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비번을 입력해 주세요");
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			System.out.println("비번 : ");
			String password = scanner.nextLine();
			System.out.println();		
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) { //키가 id인 value와 입력한 비밀번호 문자열 비교
					System.out.println("로그인 성공");
					break;
				}
				else{
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}
			else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
		}
	}
	
}
