package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test_1_method {
	//�żҵ�
	static int max ( int a, int b, int c) { //a,b,c�� �ִ밪�� ��ȯ
		int max = a;
		if( b > max) max =b;
		if( c > max) max=c;
		return max;
	}

	public static void main(String[] args) {
		//3���� ����, ü��, ������ �ִ밪�� ���ؼ� ǥ��
		
		Scanner stdIn = new Scanner(System.in);
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("[" + (i+1) + "]");
			System.out.println("����: "); height[i]=stdIn.nextInt();
			System.out.println("ü��: "); weight[i]=stdIn.nextInt();
			System.out.println("����: "); age[i]=stdIn.nextInt();
		}
		// �ִ밪�� ���Ѵ�
		int maxHeight = max(height[0], height[1], height[2]);
		int maxWeight = max(weight[0], weight[1], weight[2]);
		int maxAge = max(age[0], age[1], age[2]);
		
		System.out.println("������ �ִ밪�� " + maxHeight + " �Դϴ�");
		System.out.println("ü���� �ִ밪�� " + maxWeight + " �Դϴ�");
		System.out.println("������ �ִ밪�� " + maxAge + " �Դϴ�");
	}

}
