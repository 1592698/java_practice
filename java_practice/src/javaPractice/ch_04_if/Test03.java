package javaPractice.ch_04_if;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력하시오:");
		int age; //1) 정수로 받음
		age = input.nextInt();
		
		//2)문자열로 입력 받은 후에 정수화
		//String tmp;
		//tmp = input.nextLine();
		//age = Integer.parseInt(tmp);
		
//		if ( age > 19 ) { //20~
//			System.out.println("성인입니다.");
//			System.out.println("성인요금이 적용됩니다.");
//			
//		}
//		else if ( age > 13) { // 14~19
//			System.out.println("청소년입니다.");
//			System.out.println("청소년요금이 적용됩니다.");
//		}
//		else if ( age > 8) { //8~13
//			System.out.println("어린이입니다.");
//			System.out.println("어린이요금이 적용됩니다.");
//		}
//		else  {
//			System.out.println("유아입니다.");
//			System.out.println("유아요금이 적용됩니다.");
//		}
//		System.out.println("결제를 진행해 주세요");
		

		if ( age <=8 ) { //20~
			System.out.println("유아입니다.");
			System.out.println("유아요금이 적용됩니다.");
			
		}
		else if ( age <= 13) { 
			System.out.println("어린이입니다.");
			System.out.println("어린이요금이 적용됩니다.");
		}
		else if ( age <= 20) { 
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		else  {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요");
	}

}
