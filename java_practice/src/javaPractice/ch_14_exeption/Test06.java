package javaPractice.ch_14_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path =".\\sample_file\\test2.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("파일 열기 성공");
		}catch (IOException e) {
			System.out.println("*** IOException ***");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("*** Exception ***");
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
