package Test;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 간단한 가위바위보 게임
		 * 1) 가위 바위 보는 각각 정수형 1,2,3,으로 간주한다
		 * 2) 컴퓨터가 제시할 가위바위보 데이터를 만든다
		 * 다섯개의 정수를 지정할 수 있는 배열을 만들고 1,2,3 데이터를 섞어 초기화한다
		 * 3)게임은 총 5회 진행하며, 컴퓨터는 배열 안 데이터를 차례대로출력한다
		 * 4)현재횟수 / 총 횟수와 함께 입력 메세지를 출력한다
		 * 5) 키보드로 1,2,3 중 하나를 입력하고, 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지알려준다
		 * 6) 비긴 경우에는 횟수에 포함하지 않는다
		 * 7) 게임을 종료하면 누가 이겼는지 알려준다*/
		
		
		Random random= new Random();
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];
		String[] gameIntems = {"가위","바위","보"}; //출력을 위한 문자열
		int[] result = new int[2]; //게임 결과를 저장, 개개의 판수가 아니라 누가 이겼는지 저장. 0: 사용자가 이김
		String[] resultStrs = {"사용자가 이김", "컴이 이김"}; //출력을 위한 문자열
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=random.nextInt(3)+1; //1~3까지 랜덤하게 정수 반환
		}
		System.out.println(Arrays.toString(numbers)); //{3,3,2,2,3}
		
		//3) 게임은 총 5번 진행하며, 컴퓨터는 배열 안 데이터를 차례대로 출력하는것으로 한다
		//4) 현재 횟수 / 총횟수와 함께 입력 메시지를 출력한다
		for(int i=0, answer; i<numbers.length; i++) {
			System.out.print((i+1)+"/"+numbers.length +"입니다. 가위(1), 바위(2), 보(3) >>>>> ");
			answer=scanner.nextInt();
			System.out.print(gameIntems[answer-1] +"입력하셨고, 컴은 " + gameIntems[numbers[i]-1] + " -----");

			if(answer==numbers[i]) {//비긴경우
				System.out.println("비겼습니다");
				i--; //i값이 바뀌지않게
			} else if((answer +1)%3 ==numbers[i] %3) { //사용자가 지는경우
				result[1]++;
				System.out.println("컴이 이김");
				
			}
			else {
				result[0]++;
				System.out.println("사용자가 이김");
			}
		}
		int max = result[0];
		int maxIndex = 0;
		for(int i=0; i<resultStrs.length; i++) {
			if(max < result[i]) {
				max = result[i];
				maxIndex = i;
			}
		}
		System.out.println("게임결과는 " + resultStrs[maxIndex]);
		
	}

}
