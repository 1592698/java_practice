package javaPractice.ch_19_util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Date와 SimpleDateFormat 클래스를 이요해서
 *오늘의 날짜를 아래와 같이 출력하는 프로그램을 작성해 보세요
 *
 *실행결과 :
 *2022년 08월 22일 월요일 18시 09분 */
public class Test07 {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(new Date()));
	
	//2022년 12월 16일 금요일 12시 16분

	}

}
