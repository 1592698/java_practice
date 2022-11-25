package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		/*우하변이 직각인 직각삼각형을 표시하세요
		 * 별이 출력되는 부분은 putStars() 메소드를 정의해서 구현하세요
		 * 몇 단 : 4
		 *    *
		 *   **
		 *  ***
		 * ****   
		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println("우하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int total = scanner.nextInt();
	
		for(int i =1; i <=total; i++) {
			//putStars() 메소드 호출
			putStars(i, total);
			System.out.println();
		}
	}

	static void putStars(int n, int total) {
		//void 메소드 -> return 값이 없는 메소드
	
		  for(int i=1; i<=total; i++) 
		  {
			  if(i <=total -n) {
				  System.out.print(" ");
			  }
			  else {
				  System.out.print("*");
			  }
		  }
		}
	
}
