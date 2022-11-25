package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해 주세요 >>> ");
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 20;
			break;
		default:
			day = 0;
			System.out.println("존재하지 않는 달 입니다");
		}
		System.out.println(month + "월은" + day + "까지 있습니다.");
		scanner.close();
	}

}
