package javaPractice.ch_05_for;

public class Test8_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for문이 정해진 횟수만큼 바복한다면,
		 * while문은 조건식이 true일 경우 계속 반복.
		 * 조건식에는 비교 또는 논리 연산식이 주로 오는데,
		 * 조건식이 false가 되면 반복 행위를 멈추고 
		 * while문을 종료
		 */
		
		//1부터 10까지의 출력
		int i =1;
		while( i<=10) {
			System.out.println(i);
			i++;
		}
	}

}
