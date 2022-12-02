package javaPractice.ch_14_exeption;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int hashCode() : 메모리에 생성된 인스턴스의 주소값을 가지고 일련번호를 만들어 반환하는 메서드
		 * equals(Object obj)의 판단 기준은 해시 코드 값이고 이 값은 hashCode()에서 가지고 옴
		 * 객체의 해시 코드 값을 반환
		 * 
		 * 자바에서는 인스턴스를 힙 메모리에 생성하여 관리할 때 해시 알고리즘을 사용
		 * Object 클래스의 toString() 메서드 원형을 다시 살펴 보면 
		 * getClass().getName() + "@" + Integer.toHexString(hashCode())
		 * 즉, 우리가 참조변수를 출력 할 때 본 16진수 숫자 값이 '해시 코드값'이고,
		 * 이 값은 자바가상머신이 힙 메모리에 저장한 '인스턴스 주소 값'.
		 * 그래서 자바에서는 두 인스턴스가 같다면 hashCode()에서 반환하는 해시코드 값이 같아야함*/
		
	
		Comp comp1 = new Comp("비교1");
		Comp comp2 = new Comp("비교2");
		System.out.println(comp1.hashCode()); //932583850 컴퓨터마다 값 다르게 나옴
		System.out.println(comp2.hashCode()); //212628335
		
		//String, Integer 클래스의 hashCode() 메서드 재정의
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode()); //96354. abc 문자열의 해시 코드 값 출력
		System.out.println(str2.hashCode()); //96354. abc 문자열의 해시 코드 값 출력
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode()); //100. Integr(100)의 해시 코드 값 출력
		System.out.println(i2.hashCode()); //100. Integr(100)의 해시 코드 값 출력
		
	}

}
