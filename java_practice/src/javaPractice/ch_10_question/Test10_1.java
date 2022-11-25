package javaPractice.ch_10_question;

public class Test10_1 {
	//p가 참조하는 인스턴스에 자기소개를 시킨다
	static void intro(Test10_pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Test10_pet[] a = {
			new Test10_pet("Kurt", "아이"),
			new Test10_RobotPet("R202", "루크"),
			new Test10_pet("마이몰", "영진"),
		};
	
	for(Test10_pet p : a) {
		intro(p); //p가 참조하는 인스턴스에 자기소개를 시킨다
		System.out.println( );
	}
	}

}
