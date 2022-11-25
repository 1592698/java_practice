package javaPractice.ch_03;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 5;
		System.out.println(b); //5
		b = a;
		System.out.println(b); //3
		
		System.out.println(a); //3
		
		a += 1; //a = a + 1;
		System.out.println(a); //4
		
		a /= 2; // a = a / 2;
		System.out.println(a); //2
		
		a *=a; // a = a * a
		System.out.println(a); //4
	}

}
