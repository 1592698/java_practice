package javaPractice.ch_09_constructor;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car(car1); //c1�� ���纻 c2�� �����Ѵ�
		
		System.out.println("c1�� color=" + car1.color + ", getType = "
				+ car1.gearType + ", door =" + car1.door);
		//c1�� color=white, getType = auto, door =4
		System.out.println("c2�� color=" + car2.color + ", getType = "
				+ car2.gearType + ", door =" + car2.door);
		//c2�� color=blue, getType = auto, door =4
		
		car1.door=100; //c1�� �ν��Ͻ����� door�� ���������Ѵ�
		System.out.println("c1.door=100; ���� �� ");
		System.out.println("c1�� color=" + car1.color + ", getType = "
				+ car1.gearType + ", door =" + car1.door);
		//c1�� color=white, getType = auto, door =100
		System.out.println("c2�� color=" + car2.color + ", getType = "
				+ car2.gearType + ", door =" + car2.door);
		//c2�� color=white, getType = auto, door =4
	}

}
