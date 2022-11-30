package javaPractice.ch_13_class;

class OuterClass{
	int a =3;
	static int b =4;
	
	class Inner { // 인스턴스 내부 클래스
		int c =5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner { //static 내부 클래스
		int d =6;
		static int stat =10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		//외부 클래스 사용
		OuterClass oc = new OuterClass();
		
	}

}
