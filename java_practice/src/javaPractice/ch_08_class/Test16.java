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
	 * ���� �������� Printer Ŭ���� �����ϰ� println()�޼��带 �����ߴ�
	 * Printer ��ü�� �������� �ʰ� �Ʒ��� ���� ȣ�� �Լ� �ֵ��� Printer Ŭ������ �����϶�*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printer2 printer = new Printer2();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
	}

}
