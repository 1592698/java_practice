package Test;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue문은 현재의 반복을 뛰어넘고 반복을 진행
		//반복이 진행되다가 continue문을 만나면 반복문의 제일 끝으로 가서 다음반복문 계속 수행
		
		int money = 10000;
		System.out.println("현재 가진돈은"+money);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("얼마를 사용하겠습니까?");
			int spendMoney = scanner.nextInt(); //정수 입력받음
			
			if(!(spendMoney > 0 && spendMoney <= money)) {
				//현재 가진 돈보다 크거나 음수 입력하면 다시 입력 요구
			//if ( i< 0 || i>money){
				System.out.println("다시 입력해주세요(사용 범위가 틀렸습니다).");
				continue; //현재의 반복을 벗어나서 다시 반복 시작
			}
			
			money -=spendMoney;
			System.out.println("이제" + money +"원이 남았습니다");
			//남은 돈의 양 출력
			if (money ==0) {
				break;
			}
		}
		System.out.println("모든 돈을 사용합니다. 종료");
		scanner.close();
		
	}

}
