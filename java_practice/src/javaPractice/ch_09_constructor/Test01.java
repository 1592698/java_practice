package javaPractice.ch_09_constructor;

class Cellphone{
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	/*
	 * �������� Ư¡
	 * 1) Ŭ������ �̸��� ����
	 * 2) ��ȯ���� ���� 
	 * 3) �ν��Ͻ� ������ �� �ѹ��� �ڵ� ����ȴ�
	 * 
	 * �����ڸ� ���� ���� ������ void �����ڰ� �⺻���� ����
	 * �����ڸ� ���� �ϸ� �ڹٰ� ������ �Ǵ� void �����ڰ� �����
	 * void �����ڸ� ����ҷ��� ���� ���Ǹ� ���������*/
	
	Cellphone(String color, int capacity){ //�Ű������� �ִ� ������
		this.color =color;
		this.capacity = capacity;
	}
}


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cellphone myphone = new Cellphone(); //�����߻�
		Cellphone myphone = new Cellphone("silver",64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
