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
	 * Printer ��ü�� �����ϰ� println() �޼��带 ȣ���ؼ� �Ű����� �ֿܼ� ����Ϸ��� �Ѵ�
	 * println() �޼����� �Ű�������  int, boolean, double, String ���� �� �� �ִ�
	 * Printer Ŭ�������� println() �޼��带 �����϶�*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
	}

}
