package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자에게 성적을 입력받아 if문을 사용해서 
		//학점을 출력하는 코드를 완성하세요
		//입력은 0~100까지 입력이 됩니다
		//기준은 아래와 같습니다.
		// A:90~100 B:80~89 C:70~79 D:60~69 F:0~59
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력하시오 : ");
		int a = sc.nextInt();
		
		if( a>=90 && a<=100) {
			System.out.print("학점 : A");
		}
		else if( a>=80 && a<=89) {
			System.out.print("학점 : B");
		}
		else if( a>=70 && a<=79) {
			System.out.print("학점 : C");
		}
		else if( a>=60 && a<=69) {
			System.out.print("학점 : D");
		}
		else {
			System.out.print("학점 : F");
		}
	}

}
