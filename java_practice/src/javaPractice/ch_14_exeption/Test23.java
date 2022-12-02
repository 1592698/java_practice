package javaPractice.ch_14_exeption;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int hashCode() : �޸𸮿� ������ �ν��Ͻ��� �ּҰ��� ������ �Ϸù�ȣ�� ����� ��ȯ�ϴ� �޼���
		 * equals(Object obj)�� �Ǵ� ������ �ؽ� �ڵ� ���̰� �� ���� hashCode()���� ������ ��
		 * ��ü�� �ؽ� �ڵ� ���� ��ȯ
		 * 
		 * �ڹٿ����� �ν��Ͻ��� �� �޸𸮿� �����Ͽ� ������ �� �ؽ� �˰����� ���
		 * Object Ŭ������ toString() �޼��� ������ �ٽ� ���� ���� 
		 * getClass().getName() + "@" + Integer.toHexString(hashCode())
		 * ��, �츮�� ���������� ��� �� �� �� 16���� ���� ���� '�ؽ� �ڵ尪'�̰�,
		 * �� ���� �ڹٰ���ӽ��� �� �޸𸮿� ������ '�ν��Ͻ� �ּ� ��'.
		 * �׷��� �ڹٿ����� �� �ν��Ͻ��� ���ٸ� hashCode()���� ��ȯ�ϴ� �ؽ��ڵ� ���� ���ƾ���*/
		
	
		Comp comp1 = new Comp("��1");
		Comp comp2 = new Comp("��2");
		System.out.println(comp1.hashCode()); //932583850 ��ǻ�͸��� �� �ٸ��� ����
		System.out.println(comp2.hashCode()); //212628335
		
		//String, Integer Ŭ������ hashCode() �޼��� ������
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode()); //96354. abc ���ڿ��� �ؽ� �ڵ� �� ���
		System.out.println(str2.hashCode()); //96354. abc ���ڿ��� �ؽ� �ڵ� �� ���
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode()); //100. Integr(100)�� �ؽ� �ڵ� �� ���
		System.out.println(i2.hashCode()); //100. Integr(100)�� �ؽ� �ڵ� �� ���
		
	}

}
