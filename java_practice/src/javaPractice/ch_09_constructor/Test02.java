package javaPractice.ch_09_constructor;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car("blue"); 
		
		System.out.println("c1의 color=" + car1.color + ", getType = "
				+ car1.gearType + ", door =" + car1.door);
		//c1의 color=white, getType = auto, door =4
		System.out.println("c2의 color=" + car2.color + ", getType = "
				+ car2.gearType + ", door =" + car2.door);
		//c2의 color=blue, getType = auto, door =4
		
		
	}

}
