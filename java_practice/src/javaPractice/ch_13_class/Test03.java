package javaPractice.ch_13_class;

public class Test03 {

	public static void main(String[] args) {

		//외부 클래스 사용
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = " + oc.a);//3
		
		//static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = " + OuterClass.b); //4
		//System.out.println("OuterClass의 b값 = " + OuterClass.StaticInner.d); //접근불가
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat); //10
		OuterClass.StaticInner.staticMethod(); //<Static Inner> //클래스명으로 접근가능
		
		System.out.println("\n====== inner 클래스 접근하기 ======");
		OuterClass oc2 = new OuterClass(); //외부 클래스의 객체 생성 후 사용
		OuterClass.Inner inner = oc2.new Inner(); //인스턴스 내부 클래스의 객체 생성
		
		System.out.println("Inner의 c값 = " + inner.c); //5
		inner.innerMethod(); //<Inner Class>
		
		System.out.println("\n===== static inner 클래스 접근하기 ====");
		OuterClass.StaticInner si = new OuterClass.StaticInner(); //static 내부 클래스의 객체 생성
		System.out.println("StaticInner의 d값 = " + si.d);//6
		si.staticMethod(); //<Static Inner> 의 클래스, 객체 모두를 사용해 접근 가능
	}

}
