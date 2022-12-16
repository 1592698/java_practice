package javaPractice.ch_19_util;

import java.time.LocalDate;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*java.time 패키지
		 * 나중에 추가된 패키지. 기존의 Date와 Calendar를 보완.
		 * java.time : 날짜와 시간을 나타내는 LocalDate, LocalTime 등을 포함한 패키지
		 * java.time.chrono : 여러가지 달력 시스템을 사용할 수 있는 API 포함
		 * java.time.temporal : 날짜와 시간을 연산하기 위한 API 포함
		 * java.time.zone : 타임존을 지원하는 API 포함.
		 * 
		 * java.time 패키지에서 날짜와 시간을 변경 할 수 있음
		 * 클래스들은 immutable(불변한) 속성이 있기 때문에 날짜와 시간을 변경하게되면
		 * 실제로는 밴경하는것이 아니라 새로운 객체를 반환*/

		/*LocalDate 클래스
		 * 날짜 정보를 저장. 날짜 정보를 저장하는 방법은 1)현재 날짜를 지정하는 now() 메서드를 쓰는 방법과
		 * 2) 특정 날짜를 지정하는 of() 메서드를 사용하는 방법이 있음
		 * 
		 * 날짜를 더하고 뺴는 메서드를 확인한느 코드
		 * minusYears(long) 년도 빼기, minusMonth(long) 월 빼기, minusDays(long) 일 빼기,
		 * minusWeek(long) 주 뺴기, plusYears(long) 년도 더하기, plusMonths(long) 월 더하기,
		 * plusDays(long) 일 더 하기, plusWeeks(long) 주 더하기*/
		
		LocalDate ld = LocalDate.now(); //현재 날짜를 지정
		System.out.println(ld); //
		
		//2년을 빼고, 3달을 더하고, 4일을 뺌
		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(ld2);
		
		//자동변환
		LocalDate ld3 = ld2.minusDays(3); //ld2에서 3일을 뺌
		
		System.out.println(ld3);
		
		//주 더하기
		LocalDate ld4 = ld3.plusWeeks(3); //ld3에서 3주를 더함
		System.out.println(ld4);
	}

}
