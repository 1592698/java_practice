package javaPractice.ch_08_class;

class Cars {
	static int wheel =4; //클래스 변수
	int speed; //인스턴스 변수
}
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*인스턴수 변수는 각각의 인스턴스마다 고유의 저장 공간을 가지고 있기 때문에 별개의 조정이 가능
		 * 클래스 변수는 1)하나의 저장 공간을 모든 인스턴스가 함께 공유하기 때문에
		 * 하나의 참조변수로 값을 변경하더라도 모든 인스턴스의 값이 변하게 됨
		 * 2)인스턴스 생성전에 접근가능하기 때문에 클래스 이름으로 접근이 됨*/
		
		System.out.println(Cars.wheel); //클래스 변수 접근 가능
		//System.out.println(Cars.speed); //인스턴스 변수 접근 불가
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed); //인스턴스 생성 후에는 접근 가능
		
		Cars myCar2 = new Cars();
		
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed : " +myCar1.speed); //0
		System.out.println("myCar2.speed : " +myCar2.speed); //0 
		System.out.println("myCar1.wheel : " +myCar1.wheel);//4
		System.out.println("myCar2.wheel : " +myCar2.wheel);//0
		
		myCar2.speed = 100;
		myCar1.wheel=5; //static이라서
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed : " +myCar1.speed); //0
		System.out.println("myCar2.speed : " +myCar2.speed); //100 
		System.out.println("myCar1.wheel : " +myCar1.wheel);//5static이라서
		System.out.println("myCar2.wheel : " +myCar2.wheel);//5static이라서
	}

}
