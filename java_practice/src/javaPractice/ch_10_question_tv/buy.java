package javaPractice.ch_10_question_tv;

public class buy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test b = new Test();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
		System.out.println();
		b.refund(com);
		b.summary();
		
		System.out.println("���� ���� ���� " + b.money +" �����Դϴ�");
		System.out.println("���� ���ʽ������� " + b.bonusPoint +" ���Դϴ�");
		
	}

}
