package javaPractice.ch_08_class;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� channe1���� " + t1.channel + "�Դϴ�"); //0
		System.out.println("t2�� channe2���� " + t2.channel + "�Դϴ�"); //0
		
		t1.channel =7;
		System.out.println("t1�� channe1���� 7�� �����Ͽ���");
		
		System.out.println("t1�� channe1���� " + t1.channel + "�Դϴ�"); //7
		System.out.println("t2�� channe1���� " + t2.channel + "�Դϴ�"); //0
		
		
	}

}
