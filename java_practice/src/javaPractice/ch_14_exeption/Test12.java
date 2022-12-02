package javaPractice.ch_14_exeption;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;


public class Test12 {

	public static void main(String[] args) {

		PrintStream ps = null; //���� error.log�� ����� �غ�
		FileOutputStream fos = null; //���� ������ ����
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log"); //error.log���Ͽ� ����� �غ� �Ѵ�
			ps = new PrintStream(fos); //err�� ����� ȭ���� �ƴ�, error.log���Ϸ� �����Ѵ�
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); //���� �߻�
			System.out.println(4); //������� ����
		}
		catch (Exception ae) {
			System.err.println("===================================");
			System.err.println("���� �߻��ð� : " + new Date()); //���� �ð� ���
			ae.printStackTrace(System.err);
			ps.println("���� �޽��� : " + ae.getMessage()); //ȭ���� error.log���Ͽ� ����Ѵ�
			System.err.println("===================================");
		} //try-catch�� ��
		System.out.println(6);
	}

}
