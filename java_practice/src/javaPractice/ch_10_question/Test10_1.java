package javaPractice.ch_10_question;

public class Test10_1 {
	//p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��
	static void intro(Test10_pet p) {
		p.introduce();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Test10_pet[] a = {
			new Test10_pet("Kurt", "����"),
			new Test10_RobotPet("R202", "��ũ"),
			new Test10_pet("���̸�", "����"),
		};
	
	for(Test10_pet p : a) {
		intro(p); //p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��
		System.out.println( );
	}
	}

}
