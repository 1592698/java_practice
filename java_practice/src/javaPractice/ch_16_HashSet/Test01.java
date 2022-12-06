package javaPractice.ch_16_HashSet;

import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("최현석"));
		hashSet.add(new String("박지훈"));
		hashSet.add(new String("김준규"));
		hashSet.add(new String("박정우"));
		hashSet.add(new String("박정우"));
		
		
		//중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관 없음
		System.out.println(hashSet);
		
		//[박지훈, 최현석, 김준규, 박정우]
	}

}
