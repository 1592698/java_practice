package javaPractice.ch_19_util;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		//���Ϸκ��� �Է¹޴� ���α׷�
		//FileInputStream Ŭ������ ���� ������ ó���ϰ� �̸� Scanner Ŭ������ ���� ���
		
		try {
			FileInputStream fs = new FileInputStream("./sample_file/sample.txt");
			Scanner scanner = new Scanner(fs);
			while(scanner.hasNext()) { //���� �����ϸ� ����ؼ� �ݺ�
				System.out.println(scanner.nextLine());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
