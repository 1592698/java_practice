package javaPractice.ch_15;

import java.util.ArrayList;

/*
 * 타입 불일치에 의한 캐스팅의 불편과 잘못된 캐스팅으로 인한 위험을 제거하기 위해
 * 자바5에서 등장한 개념이 제너릭.
 * 제네릭은 클래스를 인수화하여 임의의 타입에 의해 동작하는 일반적인 알고맂브을 구현
 * 
 * 저장할려는 자료형이 제네릭으로 지정된 자료형이 아니면 컴파일 에러가 남
 * 커파일 중에 실수를 미리 알 수 있다는 것은 중요한 장점이며 코드의 잔정성 및 생산성 향상에 큰 기여
 * 
 * 제니릭의 장점
 * 1)컴파일 시 타입을 체크할 수 있다
 * 2) 캐스팅 할 필요가 없어 편의성과 안전성이 향상된다*/
public class Test16 {

	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		//리스트에는 정수형만 저장 가능하고 다른 자료형을 저장하면 컴파일에서 에러처리
//		arNum.add("문자열");
		int value = arNum.get(0);
		System.out.println(value);
	}

}
