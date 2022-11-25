package javaPractice.ch_10_question;

class Parent3{
	int x =100;
	
	void method() {
		System.out.println("Parent Method");
	}
}
class Child3 extends Parent3{
	int x =200;
	
	void method() {
		System.out.println(" x = " + x); //this.x와 같다
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}
public class Test09 {
	public static void main(String[] args) {

		Parent3 parent3 = new Child3();
		Child3 child3 = new Child3();
		
		//참조 변수 우선
		System.out.println("p.x = " + parent3.x); // p.x = 100
		//오버라이딩 우선
		parent3.method(); //Child Method
		//참조 변수 우선
		System.out.println("c.x = " + child3.x) ; //c.x = 200
		//오버라이딩 우선
		child3.method(); //Child Method
	}
}
