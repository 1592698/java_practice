package javaPractice.ch_07_method;

public class Test8 {

	/*�޼ҵ� ȣ�� ���
	 * 1) ���� ���� ȣ��
	 * ���� ���� �޼ҵ� ȣ�� ����� �޼ҵ� ȣ�� �ÿ� ���� ����Ǿ� ����
	 * �޼ҵ��� �Ű����� Ÿ���� �⺻�� �������϶� ���� ���� ȣ���� ��
	 * */
	
	/*�޼ҵ� increase() ȣ�� �ÿ� n�̶�� �Ű������� �޸𸮿� �����Ǿ�
	 * var1�� ���� 100�� ���� �Ǿ� ó��
	 * �޼ҵ� ������ ����Ǹ� �Ű����� n�� �޸𸮿��� �Ҹ�
	 * �� ó�� ���� ���� ȣ���� ȣ��� �Ű������� ���޵Ǵ� ���� ����Ǿ� ����
	 * ���� var1�� ���� ������ ����
	 */
	
	public int increase(int n ) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {

		int var1 = 100;
		Test8 val = new Test8();
		int result = val.increase(var1);
		System.out.println("var1 : " + var1 + ", result : " + result);
	}

}
