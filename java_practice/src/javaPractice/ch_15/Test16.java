package javaPractice.ch_15;

import java.util.ArrayList;

/*
 * Ÿ�� ����ġ�� ���� ĳ������ ������ �߸��� ĳ�������� ���� ������ �����ϱ� ����
 * �ڹ�5���� ������ ������ ���ʸ�.
 * ���׸��� Ŭ������ �μ�ȭ�Ͽ� ������ Ÿ�Կ� ���� �����ϴ� �Ϲ����� �˰퐜���� ����
 * 
 * �����ҷ��� �ڷ����� ���׸����� ������ �ڷ����� �ƴϸ� ������ ������ ��
 * Ŀ���� �߿� �Ǽ��� �̸� �� �� �ִٴ� ���� �߿��� �����̸� �ڵ��� ������ �� ���꼺 ��� ū �⿩
 * 
 * ���ϸ��� ����
 * 1)������ �� Ÿ���� üũ�� �� �ִ�
 * 2) ĳ���� �� �ʿ䰡 ���� ���Ǽ��� �������� ���ȴ�*/
public class Test16 {

	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		//����Ʈ���� �������� ���� �����ϰ� �ٸ� �ڷ����� �����ϸ� �����Ͽ��� ����ó��
//		arNum.add("���ڿ�");
		int value = arNum.get(0);
		System.out.println(value);
	}

}