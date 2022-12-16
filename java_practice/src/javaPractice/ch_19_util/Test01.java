package javaPractice.ch_19_util;

/*시간 처리
 * 자바에는 시간에 대해 처리할 수 있도록 클래스 제공
 * 시간을 다루는 자료형의 값은 long이며, java.util.Calender클래스와
 * java.util.Data, SimpleDataFormat이 있음*/
public class Test01 {
	public static void main(String[] args) {

		/*System.currentTimeMillis() : 현재 운영체제의 시각을 long타입으로 반환
		 * 반환한 시간은 1970년 1월 1일을 기준으로 했을 때 
		 * 현재까지의 시간이며 1/1000초 단위까지 환산해서 보여줌
		 * 메서드가 실행되는 순간의 운영체제 시각을 반환하기 때문에 이용을 하면 작업소요시간을 측정*/
		
		long start = System.currentTimeMillis(); //작업을 시작하기 전의 시간 반환
		System.out.println("시작시간 : "+ start);
		int a = 0;
		for(int i=1; i<100000000; i++) {
			a++;
		}
		
		long end = System.currentTimeMillis(); //작업이 끝난 후의 시간 반환
		System.out.println("종료시간: " + end);
		System.out.println("걸린 작업 시간 : " + (end - start));
		
		
		/*
		 * 시작시간 : 1671151523236
			종료시간: 1671151523238
			걸린 작업 시간 : 2
			
			*/	
	}

}
