package javaPractice.ch_16_HashSet;

import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("���ر�"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		
		//�ߺ��� ���ڿ��� ���ŵǰ� ��� ������ �Է� ������ ��� ����
		System.out.println(hashSet);
		
		//[������, ������, ���ر�, ������]
	}

}
