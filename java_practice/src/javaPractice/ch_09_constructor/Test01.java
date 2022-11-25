package javaPractice.ch_09_constructor;

class Cellphone{
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	/*
	 * 생성자의 특징
	 * 1) 클래스의 이름과 같다
	 * 2) 반환형이 없다 
	 * 3) 인스턴스 생성시 단 한번만 자동 실행된다
	 * 
	 * 생성자를 정의 하지 않으면 void 생성자가 기본으로 제공
	 * 생선자를 정의 하면 자바가 제공이 되는 void 생성자가 사라짐
	 * void 생성자를 사용할려면 따로 정의를 내려줘야함*/
	
	Cellphone(String color, int capacity){ //매개변수가 있는 생성자
		this.color =color;
		this.capacity = capacity;
	}
}


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cellphone myphone = new Cellphone(); //에러발생
		Cellphone myphone = new Cellphone("silver",64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
