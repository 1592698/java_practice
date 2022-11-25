package javaPractice.ch_10_inheritance;

public class Test02 {

	public static void main(String[] args) {

		Test02_GeneralChick generalChick = new Test02_GeneralChick();
		generalChick.display();
		Test02_RedChick redChick = new Test02_RedChick();
		redChick.display();
		System.out.println(redChick.x);

	}

}
