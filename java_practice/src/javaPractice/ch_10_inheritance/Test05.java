package javaPractice.ch_10_inheritance;

class Parent2{
	int x=10 ;
}

class Child2 extends Parent2{
	int x = 20;
	void method() {
		int x = 30; //��������
		System.out.println("x = " + x); //x = 30 �����Ȱ� ��� ���� ����� ������ ������ �� ��������
		System.out.println("this.x = " + this.x); //this.x = 20 ��ü ����
		System.out.println("super.x = " + super.x); //super.x = 10 ��ӹ޾Ҵ� �θ� Ŭ������ x
	}
}

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2 c2 = new Child2();
		c2.method();
		
		//x = 10;
	}

}


