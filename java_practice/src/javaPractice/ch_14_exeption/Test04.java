package javaPractice.ch_14_exeption;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;
		int b=2;
		try { 
			System.out.println("�ܺη� ����");
			int c = b/a;
			System.out.println("��������");
		}
		catch (ArithmeticException e) {
			System.out.println("������ �߻�");
		}
		finally {
			System.out.println("��������");
		}
		System.out.println("���⵵ ����˴ϴ�");
	}

}
