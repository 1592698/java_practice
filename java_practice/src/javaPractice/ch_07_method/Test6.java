package javaPractice.ch_07_method;

import java.lang.reflect.Method;

public class Test6 {

	
	//�Ű� ������ 2�� ����ϴ� �޼ҵ�
	
	public void print(int a, int b) {
		int c = a + b;
		System.out.println("�����" + c );
	}
	//�Ű������� ���ڿ��� �޴� �޼ҵ� ����
	public void print1(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ����
		int num1 = 11; 
		int num2 = 22;
		int result = 0;
		
		//����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		Test6 method = new Test6();
		
		//�޼ҵ� ȣ��
		method.print(10,20);
		//method.print(10,30.0f);
		method.print(num1, num2);
		method.print1("�ȳ��ϼ���");
		
		
	}

}
