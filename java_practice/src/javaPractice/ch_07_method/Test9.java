package javaPractice.ch_07_method;

import java.security.PublicKey;

public class Test9 {

	/*������ ���� ȣ�� ���
	 * �Ű������� Ÿ���� ������ Ÿ���� �� ���
	 * ������ ���� ȣ���� �޼ҵ� ȣ�� �� ���� �������� ��ġ�� �Ű������� ����
	 * 
	 * ���� ���� ȣ���� �޸𸮿� ������ ���� ���� �� ���
	 * ������ ���� ȣ���� �޸��� �ּҸ� �ѱ�� ������ ���� �������� ����
	 * */
	public void increase(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] refArray = {100,800,1000};
		Test9 ref = new Test9();
		
		System.out.println("�޼ҵ� ȣ�� ��");
		for(int i=0;i< refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);

			
		}
		

	
	}

}
