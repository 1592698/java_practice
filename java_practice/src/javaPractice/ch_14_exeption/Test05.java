package javaPractice.ch_14_exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = ".\\sample_file\\test.txt"; 
		//이스케이프 문자 \를 사용하여 \\로 나타냄
		//맥은 ".\sample_file\test.txt";
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream(path);
			System.out.println("지정한 경로에 파일이 존재합니다");
		} catch(FileNotFoundException e) {
			System.out.println("지정한 경로에 파일이 존재하지 않습니다");
		} finally {
			if(fis != null) {
				try { 
					fis.close();
				}catch (IOException e) {;}
				System.out.println("파일을 닫았습니다");
			}
			System.out.println("자원을 해제 하고 종료합니다");
		}
	}

}
