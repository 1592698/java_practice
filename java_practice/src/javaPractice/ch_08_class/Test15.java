package javaPractice.ch_08_class;


 class Printer{
	
	void println(int a){
		System.out.println(a);
	}
	
	void println(boolean b) {
		System.out.println(b);
	}
	void println(double c) {
		System.out.println(c);
	}
	void println(String d) {
		System.out.println(d);
	}
}
public class Test15 {

	/*
	 * Printer 객체를 생성하고 println() 메서드를 호출해서 매개값을 콘솔에 출력하려고 한다
	 * println() 메서드의 매개값으로  int, boolean, double, String 값을 줄 수 있다
	 * Printer 클래스에서 println() 메서드를 선언하라*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
