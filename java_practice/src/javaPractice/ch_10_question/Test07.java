package javaPractice.ch_10_question;

class Parent {
	int x =100;
	
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	
}
public class Test07 {
	public static void main(String[] args) {

		Parent parent = new Child();
		Child child = new Child();
		
		System.out.println("p.x = " + parent.x); // p.x = 100
		parent.method(); //Parent Method
		System.out.println("c.x = " + child.x) ; //c.x = 100
		child.method(); //Parent Method
	}
}
