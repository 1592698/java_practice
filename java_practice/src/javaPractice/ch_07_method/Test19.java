package javaPractice.ch_07_method;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		/*���Ϻ��� ������ �����ﰢ���� ǥ���ϼ���
		 * ���� ��µǴ� �κ��� putStars() �޼ҵ带 �����ؼ� �����ϼ���
		 * �� �� : 4
		 *    *
		 *   **
		 *  ***
		 * ****   
		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int total = scanner.nextInt();
	
		for(int i =1; i <=total; i++) {
			//putStars() �޼ҵ� ȣ��
			putStars(i, total);
			System.out.println();
		}
	}

	static void putStars(int n, int total) {
		//void �޼ҵ� -> return ���� ���� �޼ҵ�
	
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
