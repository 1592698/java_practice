package javaPractice.ch_10_question;

class Parent2{
	int x =100;
	
	void method() {
		System.out.println("Parent Method");
	}
}
class Child2 extends Parent2{
	int x =200;
	
	void method() {
		System.out.println("Child Method");
	}
}
public class Test08 {
	public static void main(String[] args) {

		Parent2 parent2 = new Child2();
		Child2 child2 = new Child2();
		
		//참조 변수 우선
		System.out.println("p.x = " + parent2.x); // p.x = 100
		//오버라이딩 우선
		parent2.method(); //Child Method
		//참조 변수 우선
		System.out.println("c.x = " + child2.x) ; //c.x = 200
		//오버라이딩 우선
		child2.method(); //Child Method
	}
}
