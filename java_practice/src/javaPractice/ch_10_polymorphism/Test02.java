package javaPractice.ch_10_polymorphism;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop~~~~~!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*다형성과 형변환
		 * 자식 타입에서 부모 타입으로는 자동 형변환되지만 부모에서 자식타입으로는 명시적 형변환*/		
		
		Car car;
		FireEngine fe = new FireEngine(); //객체 생성
		FireEngine fe2;
		
		fe.water();
		car = fe; //car = (Car)fe; 에서 형변환이 생략된 형태 / car(참조변수) 상속받았기떄메 가능 (fe)자식에서 (car)부모쪽으로 저장은 가능
		//car.water(); /Car타입의 참조변수로는 water()을 호출 할 수 없음 객체에 water는 있지만  car 데이터타입에 water가 없어서 안됨 
		
		fe2 = (FireEngine)car; //부모타입에서 자식타입으로 대입될 때는 형변환을 해줘야함 
		fe2.water();
	}

}
