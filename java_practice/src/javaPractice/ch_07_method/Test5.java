package javaPractice.ch_07_method;

public class Test5 {

	
	//�Լ��� int a�� void main�� int a�� ���� ������ �޶� �Ȱ��� �����ص� �ٸ�
	//int a�� �Լ� ȣ���ϰ� ���� �����
	
	/*�Ű� ������ �ִ� �޼ҵ�
	 * �Ű� ������ �޼��� ȣ��� �޸𸮿� �����ǰ� , ȣ�� �� ���� �� �Ҹ� */
	
	public void print(int a) {
		System.out.println("�����" + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		int b = 22;
		int result = 0;
		
		//����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		
		Test5 method = new Test5();
		method.print(10);
		method.print(b);
		method.print(result);
		
	}

}
