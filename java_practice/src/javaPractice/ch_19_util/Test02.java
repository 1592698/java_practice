package javaPractice.ch_19_util;
import java.util.Calendar;
import java.util.GregorianCalendar;

// java.util.Calendar : 날짜를 다루는 클래스
// Calendar는 추상 클래스이기 때문에 직접 객체를 생성하지 못하고,
// getInstance() 메서드를 통해서 GregorianCalendar 인스턴스를 생성해야함.
// 이 방법을 싱글턴 패턴 Singleton Pattern 이라고 하는데,
// 싱글턴 패턴은 객체를 사용할 때 각각 인스턴스를 생성해서 사용하는 것이 아니라 하나의 인스턴스만을 가지고 사용하는 방법.
// Calendar 클래스가 싱글턴 패턴으로 만들어진 대표적인 클래스

// 싱글턴 패턴을 사용하지 않는 방법으로는 직접 GregorianCalendar 인스턴스를 생성
public class Test02 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance(); // 싱글턴 패턴
	      Calendar b = new GregorianCalendar(); // GregorianCalendar 인스턴스를 생성
	      
	      // 동일한 결과 값이 나옴.
	      System.out.println(a.toString());
	      System.out.println(b.toString());
	      
	      /*
	       * 
	       * java.util.GregorianCalendar[time=1671153120306,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",offset=32400000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=350,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=12,SECOND=0,MILLISECOND=306,ZONE_OFFSET=32400000,DST_OFFSET=0]
java.util.GregorianCalendar[time=1671153120323,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",offset=32400000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=350,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=12,SECOND=0,MILLISECOND=323,ZONE_OFFSET=32400000,DST_OFFSET=0]
*/
	}

}
