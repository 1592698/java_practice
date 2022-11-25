package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test_1_method {
	//매소드
	static int max ( int a, int b, int c) { //a,b,c의 최대값을 반환
		int max = a;
		if( b > max) max =b;
		if( c > max) max=c;
		return max;
	}

	public static void main(String[] args) {
		//3명의 신장, 체중, 나이의 최대값을 구해서 표시
		
		Scanner stdIn = new Scanner(System.in);
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("[" + (i+1) + "]");
			System.out.println("신장: "); height[i]=stdIn.nextInt();
			System.out.println("체중: "); weight[i]=stdIn.nextInt();
			System.out.println("나이: "); age[i]=stdIn.nextInt();
		}
		// 최대값을 구한다
		int maxHeight = max(height[0], height[1], height[2]);
		int maxWeight = max(weight[0], weight[1], weight[2]);
		int maxAge = max(age[0], age[1], age[2]);
		
		System.out.println("신장의 최대값은 " + maxHeight + " 입니다");
		System.out.println("체중의 최대값은 " + maxWeight + " 입니다");
		System.out.println("나이의 최대값은 " + maxAge + " 입니다");
	}

}
