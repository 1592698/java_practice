package javaPractice.ch_10_inheritance;

class Parent{
	int x=10 ;
}

class Child extends Parent{
	
	void method() {
	
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x); //��ӹ޾Ҵ� �θ� Ŭ������ x
	}
}

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.method();
		
		//x = 10;
	}

}


