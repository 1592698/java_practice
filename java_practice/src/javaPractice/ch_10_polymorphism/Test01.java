package javaPractice.ch_10_polymorphism;


class A {
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A obj = new B();
		
		obj.methodA();
		//obj.methodB(); //�����߻� b �θ� ������ �ʱ⶧���� a�� �θ�������
		
		B obj1 = new B();
		obj1.methodB(); //���� ����
		
		A obj2 = obj1; //A ������ Ÿ���� obj2�� obj1 ����
		//obj2.methodB()// ���� �߻�
	}

}
