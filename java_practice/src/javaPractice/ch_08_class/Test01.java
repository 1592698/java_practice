package javaPractice.ch_08_class;

//void�Լ��� return �� ����

class Car {
	boolean powerOn; //�õ�
	String color; //������ ����
	int wheel; //������ ��
	int speed; //�ӷ�
	boolean wiperOn; //������
	
	void power() {
		powerOn = !powerOn; //�õ� �޼���
	}
	
	void speedUp() {
		speed++; //�׼� �޼���
	}
	void speedDown() {
		speed--; //�극��ũ �޼���
	}
	
	void wiper() {
		wiperOn=!wiperOn; //������ �޼���
	}
	
}


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
