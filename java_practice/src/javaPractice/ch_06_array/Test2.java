package javaPractice.ch_06_array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		int sum;
		
		System.out.print("1��° ���� �Է� : ");
		numbers[0] = sc.nextInt();
		System.out.print("1��° ���� �Է� : ");
		numbers[1] = sc.nextInt();
		System.out.print("1��° ���� �Է� : ");
		numbers[2] = sc.nextInt();
		System.out.print("1��° ���� �Է� : ");
		numbers[3] = sc.nextInt();

		sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
		
		System.out.print("�հ� " + sum);
		
		/*for�� ��� 
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		int sum=0;
		
		for(int i =0; i<numbers.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i+1);
			numbers[i] = sc.nextInt();
		}
		
		sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
		
		System.out.print("�հ� " + sum); */
		
	}

}



