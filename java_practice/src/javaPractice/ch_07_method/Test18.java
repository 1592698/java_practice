package javaPractice.ch_07_method;

public class Test18 {

	public static void main(String[] args) {

		/*�غ� 30 ���� 10�� �簢���� ���̸� ����ϼ���
		 * �� �޼ҵ� calculator()�� ȣ���ؼ� ����ϼ���
		 * �����:
		 * <����� �����մϴ�.
		 * �غ��� 30, ���̰� 10�� �簢���� ���̴� 300�Դϴ�.*/
		
		int a =30;
		int b =10;

		System.out.println("�غ��� " + a + ", ���̰� " + b + "�� �簢���� ���̴� " +calculator(a, b)+ " �Դϴ�.");
		
	}

	public static int calculator(int a, int b) {
		System.out.println("<����� �����մϴ�.");
		int area = a * b; //�غ� * ���� = �簢���� ����
		return area;
	}
}
