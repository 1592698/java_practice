package javaPractice.ch_10_question;

class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}
}
class Bird extends Animal{

	 void fly() {
		System.out.println("�� �� ����");
		
	}

	 void sing() {
		System.out.println("�뷡 �θ� �� ����");
		
	}
	
}
/*������ ��Ÿ���� Animal Ŭ������ ��ӹ޾Ƽ� ���� ��Ÿ���� bird Ŭ������ �ۼ��� ����*/
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.walk(); //���� �� ����
		bird.fly(); //�� �� ����
		bird.sing(); //�뷡 �θ� �� ����
	}

}
