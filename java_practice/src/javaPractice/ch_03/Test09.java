package javaPractice.ch_03;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*비교 연산자 */
		double a = 3.14;
		double b = 5.14;
		System.out.println( a == b); //false
		System.out.println( a != b); //true
		
		//문자열의 경우 equals() 메소드를 이용해서 값을 비교
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!")); //false
		System.out.println(c1.equals("Hello JAVA!")); //true
		
		// ==은 객체의 주소값 비교
		System.out.println(c1 == "Hello java!"); //false
		System.out.println(c1 == "Hello JAVA!"); //true
		
		
	}

}
