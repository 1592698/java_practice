package javaPractice.ch_09_constructor;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car(car1); //c1의 복사본 c2를 생성한다
		
		System.out.println("c1의 color=" + car1.color + ", getType = "
				+ car1.gearType + ", door =" + car1.door);
		//c1의 color=white, getType = auto, door =4
		System.out.println("c2의 color=" + car2.color + ", getType = "
				+ car2.gearType + ", door =" + car2.door);
		//c2의 color=blue, getType = auto, door =4
		
		car1.door=100; //c1의 인스턴스변수 door의 값을변경한다
		System.out.println("c1.door=100; 수행 후 ");
		System.out.println("c1의 color=" + car1.color + ", getType = "
				+ car1.gearType + ", door =" + car1.door);
		//c1의 color=white, getType = auto, door =100
		System.out.println("c2의 color=" + car2.color + ", getType = "
				+ car2.gearType + ", door =" + car2.door);
		//c2의 color=white, getType = auto, door =4
	}

}
