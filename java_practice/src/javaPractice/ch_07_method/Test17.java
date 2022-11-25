package javaPractice.ch_07_method;

public class Test17 {

	/*메서드 내에서의 메서드 호출
	 * 메서드에서 다른 메서드 호출하면 메서드는 동작을 멈추고,
	 * 다른 메소드가 종료될때까지 기다림
	 * */
	public static void main(String[] args) {

		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음");
		secondMethod();
		System.out.println("firstMethod()이 끝났음");
	}
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음");
		System.out.println("secondMethod()이 끝났음");
	}

}
