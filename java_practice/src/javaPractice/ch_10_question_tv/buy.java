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
		
		System.out.println("현재 남은 돈은 " + b.money +" 만원입니다");
		System.out.println("현재 보너스점수는 " + b.bonusPoint +" 점입니다");
		
	}

}
