package javaPractice.ch_13_class;

class OuterClass{
	int a =3;
	static int b =4;
	
	class Inner { // �ν��Ͻ� ���� Ŭ����
		int c =5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner { //static ���� Ŭ����
		int d =6;
		static int stat =10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		//�ܺ� Ŭ���� ���
		OuterClass oc = new OuterClass();
		
	}

}
