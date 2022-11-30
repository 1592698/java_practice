package javaPractice.ch_12_interface;

interface Calc { //�������̽� �����
	
	//�������̽����� ����� ������ ������ �������� ����� ��ȯ��
	double PI =3.14;
	int ERROR=-999999999;
	
	//�������̽����� ������ �޼���� ������ �������� �߻�޼���� ��ȯ��
	
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

	//default �ȿ� ����� �ڵ尡 ������ �޼���ȭ ��Ŵ 
	//�������̽��� ����Ʈ �޼��� ����
	default void description() {//�������̽��� ������ �����ؾ��� �� �� ����
		//����Ʈ�� ���� public�� �� 
		System.out.println("���� ���⸦ �����մϴ�");
		myMethod();
	}
	//���� �޼��� ����
	//�������̽��� �������ص� ��밡��
	static int total(int[]arr) { 
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	//������ �ڵ忡�� private�ڵ� ���� (��ӹ��� Ŭ��������)
	//static�̳� default������ ��������
	private void myMethod() { //����Ʈ �޼ҵ忡�� ���
		System.out.println("private �޼��� �Դϴ�");

	}
	
	//private �޼���� �ڵ带 ��� �����ؾ� �ϹǷ� �߻�޼��忡�� private���� ����� �� ����
	//static ������ �Բ� ��밡��
	private static void myStaticMethod() { //���� �޼��忡�� ���
		System.out.println("private static �޼��� �Դϴ�");
	}
}

abstract class Calculator implements Calc{
	//�������̽��� ������ �߻�Ŭ����
	//�߻�Ŭ������ ��� �������̽��� ��� �߻� �޼��带 �������� �ʾƵ���
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substact(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
}

class CompleteCalc extends Calculator{
	//�������̽��� ������ �߻�Ŭ������ ��ӹ��� �Ϲ� Ŭ����
	//�߻�Ŭ�������� add(), substact()�� ���������� times(), divide()�� �����ϸ��
		
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2!=0) 
			return num1/num2;
		else {
			return CompleteCalc.ERROR; //� ���� 0���� ������ ��쿡 ������ ��ȯ
		}
	}	
		public void showInfo() { //completeCalc���� �߰��� ���� �� �޼���
			System.out.println("Calc �������̽��� �����Ͽ����ϴ�");
		}
}

public class Test04 {
	public static void main(String[] args) {
		int num1= 10;
		int num2=5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}
}
	
