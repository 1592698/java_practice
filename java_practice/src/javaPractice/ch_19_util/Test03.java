package javaPractice.ch_19_util;

import java.util.Calendar;

public class Test03 {
//get()�޼���� ������������
	public static String getDayToStr(int day) {
		String[] days = {"��","��","ȭ","��","��","��","��"};
		return days[day-1];
	}

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//Calendar Ŭ�������� �����͸� �������� get()�޼��带 ���
		//get()�޼����� ��ȯŸ���� int�̸�,
		//������ ���� ��(Month) ��ȯ�� ���� ������ 1�� ���� ���� ��ȯ
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		//���� ������ 1���� ���� ��ȯ
		int date = calendar.get(calendar.DATE);
		
		System.out.println(year + "�� " + month + "��" + date + "��"); //���� ��¥ ��ȯ
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//������ ��ȯ�ϴµ� ��ȯŸ���� ����
		//1=�Ͽ��� 2=������
		System.out.println("������" + getDayToStr(calendar.get(Calendar.DAY_OF_WEEK))+ "�����Դϴ�.");
		System.out.println("�̹� �⵵���� ������ ��ĥ°�ΰ�?");
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		//�̹��⵵�� ��ĥ����
		
		System.out.println("�̹� ���� ��ĥ���� �ִ°�?");
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
	}
}
