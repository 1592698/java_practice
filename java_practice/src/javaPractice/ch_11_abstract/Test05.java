package javaPractice.ch_11_abstract;


/*
 * ������ �ʵ� num1, num2�� �ִ�
 * num1, num2�� ����� Ư�� ����� �����ϴ� int clac() �޼��带 �߻� �޼���� �����Ѵ�
 * void printResult() �޼����
 * �Ϲ� �޼���� calc() �޼��� ���� ��� ������ �޾� ����ϵ��� �̸� �����Ѵ�
 * 
 * 1.�� �䱸 ������ �����ϴ� �߻� Ŭ���� Calculator �� �ۼ��϶�
 * 2. Calculator �߻� Ŭ������ ��ӹ޴� MyCalculator Ŭ������ �����϶�*/

abstract class Calculator{
	 int num1;
	 int num2;
	
	
	abstract int calu();  
	void printResult() {
		System.out.println("calu() ������ ����� " + calu() +"�Դϴ�.");
	}
}
class MyCalculator extends Calculator{
	
	int calu() {		
		return this.num1+ this.num2;
	}
	
}
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator myCalculator = new MyCalculator();
		myCalculator.num1 = 10;
		myCalculator.num2 = 20;
		myCalculator.printResult(); // calu() ������ ����� 30�Դϴ�.
	}

}
