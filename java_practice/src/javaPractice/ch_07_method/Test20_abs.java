package javaPractice.ch_07_method;

public class Test20_abs {

	public static int abs(int value) {
	
		return (value > 0) ? value : value * -1;
		
	}
	
	//�޼ҵ�
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 5;
		System.out.println(value + "�� ���밪 : " + abs(value)); //5
		value = -10;
		System.out.println(value + "�� ���밪 : " + abs(value)); //10
	}

}
