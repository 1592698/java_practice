package javaPractice.ch_08_class;


 class Printer2{
	
	static void println(int a){
		System.out.println(a);
	}
	
	static void println(boolean b) {
		System.out.println(b);
	}
	static void println(double c) {
		System.out.println(c);
	}
	static void println(String d) {
		System.out.println(d);
	}
}
public class Test16 {

	/*
	 * 이전 문제에서 Printer 클래스 생성하고 println()메서드를 생성했다
	 * Printer 객체를 생성하지 않고 아래와 같이 호출 함수 있도록 Printer 클래스를 수정하라*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printer2 printer = new Printer2();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
