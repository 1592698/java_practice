package javaPractice.ch_15;

public class Test13 {

	public static void main(String[] args) {
		/*문자열 앞뒤 공백 잘라내기
		 * trim() 메서드는 문자열 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴
		 * */
		
		String tel1 = "    02";
		String tel2 = "123   ";
		String tel3 = "     1234      ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
