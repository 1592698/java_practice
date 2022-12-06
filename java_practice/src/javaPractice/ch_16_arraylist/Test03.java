package javaPractice.ch_16_arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test03 {

	/* ArrayList�� LinkedList�� ���� ���� ��
	 * ������ ���� (����������) �߰� �Ǵ� ���� �ϴ� ��� ArrayList�� ��������
	 * �߰��� �߰�, ���� �ϴ� ��쿡�� �� �� ��ũ ������ �����ϴ� LinkedList�� �� ����
	 * ArrayList�� ���� �ε������� ��� 1�� ���� �Ǵ� ���ҽ�Ű�� �ð��� �ʿ��ϹǷ� ó�� �ӵ��� ����*/
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		//1.�߰��� �߰��ϴ� ���
		System.out.println("1. �߰��� �߰� �ϴ� ���");
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime -startTime)+ " ns");
		//ArrayList �ɸ��ð�: 4834600 ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime -startTime)+ " ns");
		//LinkedList �ɸ��ð�: 1801600 ns
		
		//2. ���� ���������� �߰� �ϴ� ���
		System.out.println("2. ���� ���������� �߰��ϴ� ���");
		startTime = System.nanoTime();
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime -startTime)+ " ns");
		//ArrayList �ɸ��ð�: 11268800 ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime -startTime)+ " ns");
		//LinkedList �ɸ��ð�: 574200 ns
		
	}

}
