package javaPractice.ch_16_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Test02{

public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add ("Java");
		set.add ("JDBC");
		set.add ("Servlet/JSP");
		set.add ("Java"); //Java�� �� ���� �����
		set.add ("iBATIS");
		
		int size = set.size(); //����� ��ü �� ���
		System.out.println("�� ��ü�� : " + size); //�� ��ü�� : 4
		System.out.println("foreach������ ��� ����");
		
		for(String s: set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while (iterator.hasNext()) {// ��ü ����ŭ ����
			String element = iterator.next(); //1���� ��ü�� ���� ��
			System.out.println("\t" + element);
		}
		set.remove("JDBC"); //1���� ��ü ����
		set.remove("iBATIS"); //1���� ��ü ����
		
		System.out.println("�� ��ü�� : " + set.size()); //�� ��ü�� : 2
		
		System.out.println("foreach ������ ��� ����");
		for(String s: set) {
			System.out.println("\t"+s);
		}
		System.out.println();
		
		set.clear(); //��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("�������");
		}
}
}