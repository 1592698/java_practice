package javaPractice.ch_19_util;
import java.util.Calendar;
import java.util.GregorianCalendar;

// java.util.Calendar : ��¥�� �ٷ�� Ŭ����
// Calendar�� �߻� Ŭ�����̱� ������ ���� ��ü�� �������� ���ϰ�,
// getInstance() �޼��带 ���ؼ� GregorianCalendar �ν��Ͻ��� �����ؾ���.
// �� ����� �̱��� ���� Singleton Pattern �̶�� �ϴµ�,
// �̱��� ������ ��ü�� ����� �� ���� �ν��Ͻ��� �����ؼ� ����ϴ� ���� �ƴ϶� �ϳ��� �ν��Ͻ����� ������ ����ϴ� ���.
// Calendar Ŭ������ �̱��� �������� ������� ��ǥ���� Ŭ����

// �̱��� ������ ������� �ʴ� ������δ� ���� GregorianCalendar �ν��Ͻ��� ����
public class Test02 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance(); // �̱��� ����
	      Calendar b = new GregorianCalendar(); // GregorianCalendar �ν��Ͻ��� ����
	      
	      // ������ ��� ���� ����.
	      System.out.println(a.toString());
	      System.out.println(b.toString());
	      
	      /*
	       * 
	       * java.util.GregorianCalendar[time=1671153120306,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",offset=32400000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=350,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=12,SECOND=0,MILLISECOND=306,ZONE_OFFSET=32400000,DST_OFFSET=0]
java.util.GregorianCalendar[time=1671153120323,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",offset=32400000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=350,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=12,SECOND=0,MILLISECOND=323,ZONE_OFFSET=32400000,DST_OFFSET=0]
*/
	}

}
