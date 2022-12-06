package javaPractice.ch_16_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	/*String ��ü�� �����ϴ� ArrayList*/
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String ��ü ����
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); //����� �� ��ü�� ���
		System.out.println("�� ��ü��: " + size);//�� ��ü�� :5 
		System.out.println();
		
		String skill = list.get(2); //2�� �ε����� ����� ��ü ���
		System.out.println("2: " + skill); //2: Database
		System.out.println();
		
		//����� ��ü ���
		for(int i=0; i<list.size(); i++) { //����� ������ŭ �ݺ�
			String str = list.get(i);
			System.out.println(i+":" + str);
		}
		/*
		 *  0:Java
			1:JDBC
			2:Database
			3:Serverlet/JSP
			4:iBATIS
			*/
		System.out.println();
		for(String str: list) { //foreach�ε� ��°���
			System.out.println(str);
		}
		System.out.println();
		list.remove(2); //2�� �ε��� Database ���� �����Ǹ� ������ ��ĭ�� ������ �ڿ��Ҹ� ŭ
		list.remove(2); //2�� �ε��� Serverlet/JSP ���� 3��->2��
		list.remove("iBATIS"); 
		
		for(int i=0; i<list.size(); i++) {//����� ������ŭ �ݺ�
			String str = list.get(i);
			System.out.println(i+":" + str);
		}
		/*
		 * 	0:Java
			1:JDBC
		 	*/
	}

}