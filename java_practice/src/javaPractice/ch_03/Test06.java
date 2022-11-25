package javaPractice.ch_03;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*콘솔에서 입력을 받을 때는 Scanner클래스 사용 */
		
		Scanner sc = new Scanner(System.in);
		int x,y,sum;
		
		System.out.print("첫 번째 숫자 입력: "); //줄을 바꾸지 않는다 println은 줄을 바꿔버림
		x = sc.nextInt(); //정수입력
		
		System.out.print("두 번쨰 숫자 입력: ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum);// 합을 출력한다
	}

}
