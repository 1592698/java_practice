package javaPractice.ch_15;

import java.util.ArrayList;

/*������ ���ʸ��� ������ ���� �迭�� ArrayList�� Ÿ�� �μ����� ����غ���
 * �ٸ� �ڷ����� ������ ���ڿ��� ���������� �� Object�� �ļ��̹Ƿ� ���忡�� ���� ����
 * ������ ��Ҹ� �������� ������ ĳ������ �ؾ���
 * */
public class Test15 {

	public static void main(String[] args) {
		ArrayList arNum = new ArrayList<>();
		arNum.add(1);
		arNum.add("���ڿ�");
		int value = (int)arNum.get(0);
		
		//int temp = (int)arNum.get(1); //������ ���ڿ��ε� ������ ����ȯ�ؼ�
		System.out.println(value);
	}

}
