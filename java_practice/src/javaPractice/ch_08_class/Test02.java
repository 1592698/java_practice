package javaPractice.ch_08_class;



public class Test02 {
	//���� �������� ������� class ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar; //Ŭ������ ��ü�� ������ �� �ִ� �������� ����
		mycar = new Car(); //Ŭ������ ��ü�� �����ϰ� ��ü�� �ּҸ� ���������� ����
		//Car = mycar = new Car(); �Ȱ���
		
		System.out.println("�õ� ó�� �ʱ�ȭ : " + mycar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ : " + mycar.color);
		System.out.println("������ �� �ʱ�ȭ : " + mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ : " + mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ : " + mycar.wiperOn);
		
		mycar.power(); //�õ� �޼��� ����
		System.out.println("�õ� �޼��� ���� : " + mycar.powerOn);
		mycar.power(); //�õ� �޼��� ����
		System.out.println("�õ� �޼��� �ٽ� ���� : " +mycar.powerOn);
		
		mycar.color = "black"; //���� ������ black ����
		System.out.println("���� ���� ���� : " + mycar.color);
	}

}
