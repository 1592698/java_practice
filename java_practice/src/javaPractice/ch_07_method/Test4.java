package javaPractice.ch_07_method;

public class Test4 {

	/*�Ű������� ���� Ÿ���� ���� �޼ҵ�*/
	public void print() {
		System.out.println("�޼��带 ȣ���Ѵ�.");
		//return Ÿ���� ������ return�� ����� �� ����
		//�ٸ� return ������ ���� ����� ��
		//return�� �ǹ̴� �� �κп��� �޼��� ������ �����ϰ� �����Ѵٴ� �ǹ�
		return; //��ȯ�� �� �� �ְ�, ���ᵵ �� �� ����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int result = 0;
		
		//����� �޼��尡 �ִ�  Ŭ������ �ν��Ͻ� ����
		Test4 mothod = new Test4();
		mothod.print();
		mothod.print();
		mothod.print();
		
		
	}

}
