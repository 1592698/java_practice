package javaPractice.ch_15;

/*GenericMethodTest
 * ���ʸ� Ÿ�� �޼��� : �޼��忡 Ÿ�� �Ű������� ����Ͽ� ������ ��
 * �Ű� ������ ����ϴ� Ÿ�� �Ű������� ��ȯ�� �տ� ����*/

class GenMethod{
	public <K, V> boolean compare(K fkey, V fValue, K sKey, V sValue) {
		if(fkey.equals(sKey) && fValue.equals(sValue)) {
			return true;
		}
		return false;
	}
}
public class Test19 {

	public static void main(String[] args) {
		GenMethod genMethod = new GenMethod();
		
		//�޼����� ȣ��ÿ��� ��ü. <Ŭ��������> �޼����̸�(�Ű�������) �������� ����ϴµ�
		//<Ŭ��������>�� ��������. �����Ϸ��� �Ű������� �ʿ��� Ÿ���� �߷�
		
		boolean check = genMethod.<Integer, String> compare(1, "ȫ�浿", 1, "ȫ�浿");
		//boolean check = genMethod.compare(1, "ȫ�浿", 1, "ȫ�浿"); //�Ȱ��� �����
		
		System.out.println("check: " + check); //true

	}

}
