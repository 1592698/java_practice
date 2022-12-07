package javaPractice.ch_16_TreeSet;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) { //TreeSet 테스트 하기
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("박지훈");
		treeSet.add("최현석");
		treeSet.add("김방전");
		treeSet.add("김준규");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
		
		/*오름차순으로 정렬이 되어 출력
		 * 김방전
			김준규
			박지훈
			최현석
		 * */
		
	}

}
