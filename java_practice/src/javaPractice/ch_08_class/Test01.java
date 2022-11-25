package javaPractice.ch_08_class;

//void함수는 return 값 없음

class Car {
	boolean powerOn; //시동
	String color; //차량의 색상
	int wheel; //바퀴의 수
	int speed; //속력
	boolean wiperOn; //와이퍼
	
	void power() {
		powerOn = !powerOn; //시동 메서드
	}
	
	void speedUp() {
		speed++; //액셀 메서드
	}
	void speedDown() {
		speed--; //브레이크 메서드
	}
	
	void wiper() {
		wiperOn=!wiperOn; //와이퍼 메서드
	}
	
}


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
