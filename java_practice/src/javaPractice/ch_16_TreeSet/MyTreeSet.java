package javaPractice.ch_16_TreeSet;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) { //TreeSet �׽�Ʈ �ϱ�
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("������");
		treeSet.add("������");
		treeSet.add("�����");
		treeSet.add("���ر�");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
		
		/*������������ ������ �Ǿ� ���
		 * �����
			���ر�
			������
			������
		 * */
		
	}

}
