package javaPractice.ch_17_Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* HashMap에 아이디(String) 와 점수(Integer)가 저장되어 있음
 * 실행 결과와 같이 평균 점수를 출력하고, 최고 점수와 최고 점수를 받은 아이디를 출력 할 것 */
public class MaxScore_name {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore = 0; //점수 함계 저장
		
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) { //반복해서 키를 얻고 값을 Map에서 얻어냄
			String key = entrySet.next();
			int thisScore = map.get(key);

			if(thisScore>maxScore ) {
				maxScore=thisScore;
				name=key;
			}
			totalScore +=thisScore;
		}
		System.out.println("총 점수 값 : " + totalScore);
		System.out.println("평균 점수 : " + totalScore/map.size());
		System.out.println("최고 점수 : "+ maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		/*
		 * 
		 * 평균 점수 : 91
		 * 최고 점수 : 96
		 * 최고 점수를 받은 아이디 : blue*/
	}

}
