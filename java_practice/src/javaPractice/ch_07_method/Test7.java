package javaPractice.ch_07_method;

public class Test7 {

	public int add(int a, int b) {
		int c = a + b;
		return c;
		//return ������ ��ġ�ϴ� �����ʹ� �ݵ�� �������� ���� Ÿ�԰� ��ġ�ؾ���
		//return 3.5; ���� Ÿ�԰� �ٸ� ���������� ��ȯ�ϸ� ������ �߻�
	}
	
	public static void main(String[] args) {

		//���� ����
		int num1 = 10; 
		int num2 = 20;
		int result = 0;
		
		Test7 method = new Test7();
		result = method.add(num1, num2);
		
		System.out.println("�� ���� ���� " + result); //�޼ҵ��� ��ȯ ���� �����ؼ� ���
		System.out.println("�� ���� ���� " + method.add(num1,num2)); //�޼ҵ��� ��ȯ ���� �ٷ� ���
		
	}

}
