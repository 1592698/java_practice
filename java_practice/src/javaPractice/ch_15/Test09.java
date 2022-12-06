package javaPractice.ch_15;


/*long currentTimeMillis()
 * 시스템의 현재 시간 조사
 * 조사되는 값은 우리가 흔히 쓰는 시간 포맷이 아니라
 * 1970년 1월 1일 자정을 기준으로 경과한 에폭 타임 Epoch time 이며, 단위는 1/1000초
 * 시간 단위가 정밀해 리턴 타입은 long
 * 
 * 경과시간이어서 시간 조사용으로 사용하기보다는, 연산이 용이해 두 실행 지점 간의 측정에 주로 사용*/
public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start= System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			System.out.println(i+"번째 줄");
		}
		long end =System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + "초 걸림");
	}

}
