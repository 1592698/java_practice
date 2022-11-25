package javaPractice.ch_06_array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		int sum;
		
		System.out.print("1번째 숫자 입력 : ");
		numbers[0] = sc.nextInt();
		System.out.print("1번째 숫자 입력 : ");
		numbers[1] = sc.nextInt();
		System.out.print("1번째 숫자 입력 : ");
		numbers[2] = sc.nextInt();
		System.out.print("1번째 숫자 입력 : ");
		numbers[3] = sc.nextInt();

		sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
		
		System.out.print("합계 " + sum);
		
		/*for문 방식 
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		int sum=0;
		
		for(int i =0; i<numbers.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
			numbers[i] = sc.nextInt();
		}
		
		sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
		
		System.out.print("합계 " + sum); */
		
	}

}



