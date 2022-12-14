package javaPractice.ch_09_constructor;

public class Test07 {
/*
 * 클래스 작성 및 객체 생성
 * 로켓을 나타내는 Rocket 클래스를 작성하라
 * Rocket 클래스는 다음과 같은 필드와 메서드를 가진다
 * # 필드
 * x,y : 현재 로켓의 위치
 * # 메서드
 * Rocket (x,y) : 현재 로켓의 위치
 * printInfo(): 로켓 정보를 문자열로 반환하는 메서드
 * moveUp() : 로켓의 y좌표가 1만큼 증가
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
	
	Rocket(int x, int y){ // 매개변수를 가진 생성자
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
