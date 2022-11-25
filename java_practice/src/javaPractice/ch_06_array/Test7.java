package javaPractice.ch_06_array;

import java.util.Arrays;



public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*로또 번호 구하기
		 * 1~45까지의 임의의 수 구하기
		 * 중복의 체크*/
		
		int range = 6 ;
		int[] numbers = new int[range];
		
		while ( range > 0 ) {
			int temp = (int)(Math.random()*45)+1; //1~45의 임의 값을 얻는다
			
			//중복확인
			boolean result = true; //중복 확인 값을 저장하기 위한 변수. 중복이면 false
			for(int n : numbers) {
				if( n == temp) { //중복이 되면 result값 변경
					System.out.println(temp + "은 중복된 값입니다.");
					result = false;
				}
			}
			if ( result ) {
				numbers[range -1] = temp;
				range--;
			}
			
		}
		System.out.println(Arrays.toString(numbers));
	}
}

