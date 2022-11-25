package javaPractice.ch_04_if;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일년동안 읽은 책 수에 따라 멘트를 출력합니다.
		
		int book = 15;
		book = book / 10;
		switch(book) {
		case 0: //10권 미만
			System.out.println("조금 더 노력 하세요!");
			break;
		case 1:  //10이상 20권 미만
			System.out.println("책 읽는 것을 즐기는 분이시네요");
			break;
		case 2: //20이상 30권 미만
			System.out.println("책을 사랑하시는 분이시네요!");
			break;
		default: //30권이상
			System.out.println("당신은 다독왕입니다!");
		}
		
	}

}
