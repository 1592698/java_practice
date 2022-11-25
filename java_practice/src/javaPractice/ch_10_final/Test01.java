package javaPractice.ch_10_final;


final class FinalClass{
	final int number= 4; //상수
}

class Parents //extends FinalClass //에러발생
{
	final void finalMethod() { //오버라이딩 불가한 메서드
		System.out.println("상속 불가한 메서드");
	}
}

class Son extends Parents{
	//void finalMethod() {}//에러발생
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		//member1.number = 3; // 상수는 변경 불가
	}

}
