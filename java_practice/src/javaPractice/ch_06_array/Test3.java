package javaPractice.ch_06_array;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//길이가 5인 배열 생성, 배열 길이 생략
		int[] a =new int[] {10,20,4,25,28};
		
		//길이가 7인 배열 생성, new int []생략 가능
		int[] b= {1,2,3,4,5,6,7};
		
		//for 문으로 배열 초기화
		int[] c = new int[10];
		for(int i=0; i<c.length; i++) {
			c[i]=i;
		}
		
		//for문을 이용한 출력
		System.out.println(c.length);
		for(int i=0; i< c.length; i++) {
			System.out.print(c[i]);
		}
		
		//foreach 문을 이용한 출력
		System.out.println();
		for(int d: c) {
			System.out.print(d);
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		//Array.toString 메소드 사용

		
	}

}
