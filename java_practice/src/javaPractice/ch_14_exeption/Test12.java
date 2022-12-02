package javaPractice.ch_14_exeption;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;


public class Test12 {

	public static void main(String[] args) {

		PrintStream ps = null; //파일 error.log에 출력할 준비
		FileOutputStream fos = null; //파일 저장을 위해
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log"); //error.log파일에 출력할 준비를 한다
			ps = new PrintStream(fos); //err의 출력을 화면이 아닌, error.log파일로 변경한다
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); //예외 발생
			System.out.println(4); //실행되지 않음
		}
		catch (Exception ae) {
			System.err.println("===================================");
			System.err.println("예외 발생시간 : " + new Date()); //현재 시간 출력
			ae.printStackTrace(System.err);
			ps.println("예외 메시지 : " + ae.getMessage()); //화면대신 error.log파일에 출력한다
			System.err.println("===================================");
		} //try-catch의 끝
		System.out.println(6);
	}

}
