package javaPractice.ch_07_method;

public class Test16 {

	/*�������� ������ �Ϲ� ���ڸ� ȥ�� ���
	 * ���� ������
	 * 1. ���� ���� ���ڰ� ���� �����ʿ� �־����
	 * 2. ���ÿ� 2���� �������� ���� ����� �ȵ�*/
	
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		test("���缮", 98,85,88);
		test("������", 90,95,92);
		test("������", 88,98,95);
		
	}

}
