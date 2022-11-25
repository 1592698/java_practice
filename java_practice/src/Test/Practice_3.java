package Test;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*음수가 입력 될 때까지, 사용자가 입력한 정수의 합계를 
		 * 계산하여 출력하는 프로그램을 작성하세요
		 * while문을 사용, break 사용하지 말 것
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		//while문의 조건이 1) 처음에 참이 되어야하고,
		//2) 합에 영향을 미치지 않아야함
		while ( num >= 0 ) {
			sum += num;
			System.out.println("정수를 입력하세요");
			 num = scanner.nextInt(); //정수 입력
		}
		System.out.println("합계" + sum);
	
	}

}
