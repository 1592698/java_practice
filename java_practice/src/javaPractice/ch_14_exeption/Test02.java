package javaPractice.ch_14_exeption;

public class Test02 {

	public static void main(String[] args) {

		int num =10;
		int num2= 10;
		
		try {
		System.out.println("** ���� ���� 0���� ������ ���� **");
		//�������� ���� ����
		System.out.println("10/0=" + (num / num2));
		System.out.println("try/catch ���� �� ���� ����");
	} catch(Exception e) { //ExceptionŬ���� e ��ü
		System.out.println(e);
		System.out.println("0���� ���� �� �����ϴ�");
	}
		System.out.println("���α׷��� ���� �����մϴ�");
	}
}
