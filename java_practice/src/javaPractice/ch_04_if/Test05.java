package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ǥ���մϴ�. \n�� ���Դϱ�? : ");
		int month = stdIn.nextInt();
		
		if(month >= 3 && month <= 5) { //3,4,5
			System.out.println("�̰��� ���Դϴ�.");
		}
		else if(month >= 6 && month <= 8) { //6,7,8
			System.out.println("�̰��� �����Դϴ�.");
		}
		else if(month >= 9 && month <= 11) { //9,10,11
			System.out.println("�̰��� �����Դϴ�.");
		}
		else{ //12,1,2
			System.out.println("�̰��� �ܿ��Դϴ�.");
		}
		
		
		
	}

}
