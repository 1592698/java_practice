package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자에게 성적을 입력받아 if문을 사용해서 
		//학점을 출력하는 코드를 완성하세요
		//입력은 0~100까지 입력이 됩니다
		//기준은 아래와 같습니다.
		// A:90~100 B:80~89 C:70~79 D:60~69 F:0~59
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력하시오 : ");
		int score = sc.nextInt();
		char grade = ' ';
		switch(score/10) {

		case 10: case 9:
			grade ='A';
			break;
		case 8:
			grade ='B';
			break;
		case 7:
			grade ='C';
			break;
		case 6:
			grade ='D';
			break;
		default:
			grade ='F';
			break;
		}
		System.out.println("학점은 : " + grade);
		sc.close();
				
	}

}
