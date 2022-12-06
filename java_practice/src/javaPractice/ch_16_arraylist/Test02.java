package javaPractice.ch_16_arraylist;

import java.util.ArrayList;

/*ArrayList : 배열에서 발전된 형태
 * 요소를 추가하면 0번 인덱스부터 차례대로 저장
 * 메서드를 사용해서 원하는 위치에 요소를 추가하거나, 삭제, 반환 할 수 있음*/
public class Test02 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 타입을 지정하지 않은 형태. 초기 capa 값을 지정할 수도 있음.
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		
		System.out.println("초기상태: ");
		
		System.out.println(list1); //[A,C,E,D]
		
		System.out.println("인덱스 1 위치에 B 추가 : ");
		list1.add(1,"B"); // 인덱스 번호를 지정하고 추가하는 형태
		System.out.println(list1); //[A,B,C,E,D]
		
		System.out.println("인덱스 2 위치의 값 삭제 : ");
		list1.remove(2); //인덱스 번호를 이용해서 삭제
		System.out.println(list1); //[A,B,E,D]
		
		System.out.println("인덱스 2번 위치의 값 반환 : " + list1.get(2)); //E
	}

}
