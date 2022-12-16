package javaPractice.ch_19_util;

import java.util.Calendar;

public class Test04 {

	/*set()���� ��¥ �����ϱ�
	 * set()�޼���� Calendar �ν��Ͻ��� ���� ���� �� �� ���
	 * �ΰ��� �Ķ���͸� �ʿ�� �ϸ� ù ��° �Ķ���ʹ� �ٲ�� �� �׸�,
	 * �� ��° �Ķ���ʹ� �ٲ� ���� ����
	 * set(�ٲ�� �� �׸�, �ٲ� ��);
	 * set(��, ��, ��);
	 * 
	 * D-day�� ���ϴ� �ڵ�*/
	public static void main(String[] args) {
	Calendar today = Calendar.getInstance(); //���� ��¥�� ��Ÿ���� �񱳷� �� �� ����ϴ� ��ü
	Calendar endOfYear = Calendar.getInstance();  //���� ��¥�� ������ ��ü
	Calendar christmas = Calendar.getInstance(); //ũ�������� ��¥�� ������ ��ü
	
	endOfYear.set(Calendar.MONTH, 11); //endOfYear ��ü�� ���� 12���� ����
	endOfYear.set(Calendar.DATE, 11); //endOfYear ��ü�� ���� 12���� ����
	long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis(); //�������� ���� �ʸ� ��
	System.out.println("�������� ���� �� : " + diff / (24 * 60*60*1000) + "��");//�������� ��������� �ʸ� �Ϸ� ��ȯ
	//�������� ���� �� : -4��
	christmas.set(2022,11,25); //2022�� 12�� 25��. ���� -1�� �Է�
	diff= christmas.getTimeInMillis() - today.getTimeInMillis(); //ũ������������ ���� �ʸ� ��
	System.out.println("ũ������������ ���� �� : " + diff /(24 * 60 * 60 * 1000) + "��");
	//ũ������������ ��������� �ʸ� �Ϸ� ��ȯ
	//ũ������������ ���� �� : 9��
	}
}