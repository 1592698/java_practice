package javaPractice.ch_07_method;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		a = 10;
		b = 20;
		c = 40;
		System.out.println(a + ", " + b + ", " + c + " �߿� ���� ū ���� " + max(a,b,c) + "�Դϴ�" );
		System.out.println(a + ", " + b + " �߿� ���� ū ���� " + max(a,b) + "�Դϴ�");
	}
	static int max(int a , int b, int c) { //a,b,c�� �ִ밪�� ��ȯ
		int max = a;
		if(b >max)
			max = b;
		if(c > max)
			max = c;
		return max;
			
	}
	
	static int max(int a, int b) { //a,b�� �ִ밪�� ��ȯ
		int max = a;  
		if ( b> max)
			max = b;
		return max;
	}

}