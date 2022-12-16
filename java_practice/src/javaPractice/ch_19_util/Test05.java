 package javaPractice.ch_19_util;

import java.util.Calendar;

public class Test05 {
   public static String getDayToStr(int day) {
      String[] days = { "일", "월", "화", "수", "목", "금", "토" };
      return days [day -1];
   }
   
   public static void main(String[] args) {
      Calendar now = Calendar.getInstance();
      int year = now.get(Calendar.YEAR);
      int month = now.get(Calendar.MONTH)+1;
      int day = now.get(Calendar.DATE);
      
      String strWeek = getDayToStr(now.get(Calendar.DAY_OF_WEEK));
         //스위치문으로 많이 작성함
      String strAmPm = null;
      
      int hour = now.get(Calendar.HOUR_OF_DAY);
      int minute = now.get(Calendar.MINUTE);
      int second = now.get(Calendar.SECOND);
      
      int amPm = now.get(Calendar.AM_PM);
      if(amPm == Calendar.AM) {
         strAmPm = "오전";
      } else {
         strAmPm = "오후";
      }
      
      System.out.print(year + "년 ");
       System.out.print(month + "월 ");
       System.out.print(day + "일 ");
       System.out.print(strWeek + "요일 ");
       System.out.print(strAmPm + " ");
       System.out.print(hour + "시 ");
       System.out.print(minute + "분 ");
       System.out.print(second + "초 ");

   }

}