package javaPractice.ch_08_class;



public class Test02 {
	//이전 예제에서 만들어진 class 사용

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar; //클래스의 객체를 참조할 수 있는 참조변수 선언
		mycar = new Car(); //클래스의 객체를 생성하고 객체의 주소를 참조변수에 저장
		//Car = mycar = new Car(); 똑같음
		
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("차의 색상 초기화 : " + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);
		
		mycar.power(); //시동 메서드 실행
		System.out.println("시동 메서드 동작 : " + mycar.powerOn);
		mycar.power(); //시동 메서드 실행
		System.out.println("시동 메서드 다시 동작 : " +mycar.powerOn);
		
		mycar.color = "black"; //색상 변수에 black 대입
		System.out.println("현재 차의 색상 : " + mycar.color);
	}

}
