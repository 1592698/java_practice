package javaPractice.ch_10_polymorphism;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*instanceof 연산자
		 * instanceof B: a는 B의 객체이다*/
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) { // fe는 FireEngine의 객체이다
			System.out.println("This is FireEngine instance.");
		}
		if(fe instanceof Car) { //fe는 Car의 객체이다
			System.out.println("This is a car instance.");
		}
		if(fe instanceof Object) { //fe 는 object의 객체이다
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		
		
		Car polyFe = new FireEngine(); //다형성 사용해서 참조 변수 만듦
		if(polyFe instanceof FireEngine) { //polyFe FireEngine의 객체이다
			System.out.println("This is a FireEngine instance.");
		}
		if(polyFe instanceof Car) { //polyFe는 Car의 객체이다.
			System.out.println("This is a an Object instance.");
		}
		if(polyFe instanceof Object) { //polyFe 는 Object의 객체이다
			System.out.println("This is Object instance");
		}
		
		
		System.out.println();
		
		Car car = new Car(); //부모 클래스로 객체 생성
		if(car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(car instanceof Car) { //car는 Car의 객체이다
			System.out.println("This is Car instance.");
		}
		if(car instanceof Object) { //car는 Object의 객체이다
			System.out.println("This is an Object instance");
		}
	}

}
