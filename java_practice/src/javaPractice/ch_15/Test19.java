package javaPractice.ch_15;

/*GenericMethodTest
 * 제너릭 타입 메서드 : 메서드에 타입 매개변수를 사용하여 선언한 것
 * 매개 변수로 사용하는 타입 매개변수를 반환값 앞에 선언*/

class GenMethod{
	public <K, V> boolean compare(K fkey, V fValue, K sKey, V sValue) {
		if(fkey.equals(sKey) && fValue.equals(sValue)) {
			return true;
		}
		return false;
	}
}
public class Test19 {

	public static void main(String[] args) {
		GenMethod genMethod = new GenMethod();
		
		//메서드의 호출시에는 객체. <클래스형들> 메서드이름(매개변수들) 형식으로 사용하는데
		//<클래스형들>은 생략가능. 컴파일러가 매개변수로 필요한 타입을 추론
		
		boolean check = genMethod.<Integer, String> compare(1, "홍길동", 1, "홍길동");
		//boolean check = genMethod.compare(1, "홍길동", 1, "홍길동"); //똑같이 실행됨
		
		System.out.println("check: " + check); //true

	}

}
