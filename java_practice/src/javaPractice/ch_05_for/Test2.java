package javaPractice.ch_05_for;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for문 동작 시간 구하기
		프로그램의 동작 시간을 구하는 방법
		프로그램 시작 위의 부분에서 시작시간을 구하고,
		프로그램이 끝나는 부분에서 종료시간을 구한 후 
		종료시간에서 시작시간을 빼면 프로그램이 동작한 시간을 구할 수 있음.*/
		
		long startTime = System.currentTimeMillis(); //시작시간
		for(int i =0; i< 1000000000; i++) {
			; //빈문장 실행
		}
		long endTime = System.currentTimeMillis(); //종료시간
		
		System.out.println("시작시간 : " + startTime);
		System.out.println("시작시간 : " + endTime);
		System.out.println("시작시간 : " + (endTime - startTime));
		
	}

}
