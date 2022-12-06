package javaPractice.ch_15;


class MyClass02<T,V>{
	//제네릭을 사용하는 sum() 메서드 작성
	
	void sum(T a, V b) {
		System.out.println(a);
		System.out.println(b);
		
	}
}
public class Test20 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		float c = 11.1f, d=12.1f;
		
		MyClass02 mc2 = new MyClass02();
		mc2.sum(a,b);
		mc2.sum(c,d);
		
	}

}
