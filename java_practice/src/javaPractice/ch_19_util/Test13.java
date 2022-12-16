package javaPractice.ch_19_util;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Test13 {

	public static void main(String[] args) {

		/*
		 * with() 메서드는 TemporalAdjusters 타입을 인자로 받으면 특정 날짜를 리턴
		 * firstDayOfYear() : 년도의 첫 번째 일
		 * lastDayOfYear() : 년도의 마지막 일
		 * firstDayOfMonth() : 달의 첫 번째 일
		 * lastDayOfMonth() : 달의 마지막 일
		 * firstInMonth(DayofWeek dayOfWeek) : 달의 첫 번째 요일
		 * lastInMonth(DayOfWeek dayOfWeek) : 달의 마지막 요일
		 * next(DayOfWeek dayOfWeek) : 돌아오는 요일
		 * nextOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 돌아오는 요일
		 * previous(DayOfWeek dayOfWeek) : 지난 요일
		 * previousOrSame(DayOfWeek dayOfWeek) : 오늘을 포함한 지난 요일*/
		
		LocalDateTime ldt = LocalDateTime.now( );
		System.out.println(ldt);
		LocalDateTime new_ldt;
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear( )); //년도의 첫 번째 일
		System.out.println("올해의 첫 번째 날 : " + new_ldt); 
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear( ));// 년도의 마지막 일
		System.out.println("올해의 마지막 날 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth( )); //달의 첫 번째 일
		System.out.println("이번 달의 첫번째 날 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth( )); //달의 마지막 일
		System.out.println("이번달의 마지막 날 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); //달의 첫 번째 요일
		System.out.println("이번달의 첫 월요일 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("이번달의 마지막 일요일 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("돌아오는 금요일 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("오늘을 포함한 다음 금요일 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + new_ldt);
		
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("오늘을 포함한 지난 월요일 : " + new_ldt);
	}

}
