package javaPractice.ch_08_class;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("b�� �� : " +b); //20
		
		//���� ������ ����
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�");
		//t1.toString()���� javaPractice.ch_08_class.Tv@50d0686�Դϴ�
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�");
		//t2.toString()���� javaPractice.ch_08_class.Tv@7a3d45bd�Դϴ�
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�"); //0
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�"); //0
		System.out.println();
		
		t1.channel = 7;
		System.out.println("t1�� channel1���� 7�� �����߽��ϴ�");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�"); //7
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�"); //0
		System.out.println();
		
		t1=t2; //t1�� ������ �ּҰ��� t2�� ����. ���� ������ ������ �ּҸ� ����Ŵ
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�");
		//t1.toString()���� javaPractice.ch_08_class.Tv@7a3d45bd�Դϴ�
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�");
		//t2.toString()���� javaPractice.ch_08_class.Tv@7a3d45bd�Դϴ�
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�"); //0
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�"); //0
		System.out.println();
		
		t1.channel =27;
		System.out.println("t1�� channel1���� 27�� �����߽��ϴ�");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�"); //27
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�"); //27
	}

}
