package javaPractice.ch_10_polymorphism;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop~~~~~!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*�������� ����ȯ
		 * �ڽ� Ÿ�Կ��� �θ� Ÿ�����δ� �ڵ� ����ȯ������ �θ𿡼� �ڽ�Ÿ�����δ� ����� ����ȯ*/		
		
		Car car;
		FireEngine fe = new FireEngine(); //��ü ����
		FireEngine fe2;
		
		fe.water();
		car = fe; //car = (Car)fe; ���� ����ȯ�� ������ ���� / car(��������) ��ӹ޾ұ⋚�� ���� (fe)�ڽĿ��� (car)�θ������� ������ ����
		//car.water(); /CarŸ���� ���������δ� water()�� ȣ�� �� �� ���� ��ü�� water�� ������  car ������Ÿ�Կ� water�� ��� �ȵ� 
		
		fe2 = (FireEngine)car; //�θ�Ÿ�Կ��� �ڽ�Ÿ������ ���Ե� ���� ����ȯ�� ������� 
		fe2.water();
	}

}
