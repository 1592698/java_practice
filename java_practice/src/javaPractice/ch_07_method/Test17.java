package javaPractice.ch_07_method;

public class Test17 {

	/*�޼��� �������� �޼��� ȣ��
	 * �޼��忡�� �ٸ� �޼��� ȣ���ϸ� �޼���� ������ ���߰�,
	 * �ٸ� �޼ҵ尡 ����ɶ����� ��ٸ�
	 * */
	public static void main(String[] args) {

		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������.");

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���");
		secondMethod();
		System.out.println("firstMethod()�� ������");
	}
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���");
		System.out.println("secondMethod()�� ������");
	}

}
