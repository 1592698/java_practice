package javaPractice.ch_09_constructor;

public class Test07 {
/*
 * Ŭ���� �ۼ� �� ��ü ����
 * ������ ��Ÿ���� Rocket Ŭ������ �ۼ��϶�
 * Rocket Ŭ������ ������ ���� �ʵ�� �޼��带 ������
 * # �ʵ�
 * x,y : ���� ������ ��ġ
 * # �޼���
 * Rocket (x,y) : ���� ������ ��ġ
 * printInfo(): ���� ������ ���ڿ��� ��ȯ�ϴ� �޼���
 * moveUp() : ������ y��ǥ�� 1��ŭ ����
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rocket rocket = new Rocket(10,20);
		System.out.println(rocket.printInfo()); //x: 10, y:10
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo()); //x: 10, y: 22
	}
}
class Rocket{
	private int x;
	private int y;
	
	Rocket(int x, int y){ // �Ű������� ���� ������
		this.x= x;
		this.y= y;
	}
	 String printInfo() {		
		return "x: " + x + ", y: "+y;
	}
	 void moveUp() {
		 ++y;
	}
}
