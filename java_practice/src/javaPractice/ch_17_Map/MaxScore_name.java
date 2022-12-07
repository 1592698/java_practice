package javaPractice.ch_17_Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* HashMap�� ���̵�(String) �� ����(Integer)�� ����Ǿ� ����
 * ���� ����� ���� ��� ������ ����ϰ�, �ְ� ������ �ְ� ������ ���� ���̵� ��� �� �� */
public class MaxScore_name {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null; //�ְ� ������ ���� ���̵� ����
		int maxScore = 0; //�ְ� ���� ����
		int totalScore = 0; //���� �԰� ����
		
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) { //�ݺ��ؼ� Ű�� ��� ���� Map���� ��
			String key = entrySet.next();
			int thisScore = map.get(key);

			if(thisScore>maxScore ) {
				maxScore=thisScore;
				name=key;
			}
			totalScore +=thisScore;
		}
		System.out.println("�� ���� �� : " + totalScore);
		System.out.println("��� ���� : " + totalScore/map.size());
		System.out.println("�ְ� ���� : "+ maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		/*
		 * 
		 * ��� ���� : 91
		 * �ְ� ���� : 96
		 * �ְ� ������ ���� ���̵� : blue*/
	}

}
