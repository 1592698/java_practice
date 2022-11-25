package Test;

import java.util.Random;
import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int nextInt(int n) //int 사팁의 0~매개값까지의 난수를 리턴합니다
		Random random = new Random();
		answer = random.nextInt(999)+1;
		
		프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임
		1) 1부터 1000사이의 정수 하나를 생성한다
		2) 사용자가 답을 추측하여 입력한다
		3) 정답이 아닐 경우 정답이 입력한 값보다 큰지 혹은 작은지 알려준다
		4) 정답일 경우, 성공 메시지 및 시도 횟수 출력할것
		
		정답을 추측하여 보시오 : 500
		제시한 정수가 높습니다.
		
		축하합니다 시도횟수 = 8번
		*
		*/
		Scanner scanner = new Scanner(System.in);
		int answer; //정답을 입력할 변수

		boolean run = true;
		int count =0;
		
		Random random = new Random();
		answer = random.nextInt(999)+1;
		int num; //사용자의 추측을 입력받을 변수
		while(run) {
			System.out.println("숫자를 입력하시오");
			num = scanner.nextInt();
			count++;
			
			if(num<answer) {
				System.out.println("더 높은 값을 입력하세요");
			}
			else if (num>answer) {
				System.out.println("더 낮은 값을 입력하세요");
			}
		
			else {
				System.out.println("정답입니다. " + count + "번 만에 시도함");
				run=false;
			}
		}
	}

}
