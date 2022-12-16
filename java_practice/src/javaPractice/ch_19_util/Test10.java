package javaPractice.ch_19_util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test10 {

	public static void main(String[] args) {

		/*시간을 더하고 뺴는 메서드를 확인하는 코드
		 * minusHours(long) 시간 빼기,
		 * minusMinutes(long) 분 빼기,
		 * minusSeconds(long) 초 빼기,
		 * minusNanos(long) 나노초 빼기
		 * 
		 * plusHours(long) 시간 더하기,
		 * plusMinutes(long) 분 더하기,
		 * plusSeconds(long) 초 더하기,
		 * plusNanos(long) 나노초 더하기*/
		
		LocalDateTime localDateTime = LocalDateTime.now(); //현재시간
		System.out.println("현재 시간 : " + localDateTime);
		//현재 시간 : 2022-12-16T14:12:00.731641500
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(5).plusMinutes(30).minusSeconds(4);
		//5시간은 빼고, 30분은 더하고, 4초를 뺌
		System.out.println("변경 시간 : " + localDateTime1);
		//변경 시간 : 2022-12-16T09:46:56.731641500
		
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		//ld2 값에서 24시간을 뺌.
		System.out.println("자동 변경 시간 : " + localDateTime2);
		//자동 변경 시간 : 2022-12-15T09:46:56.731641500
	}

}
