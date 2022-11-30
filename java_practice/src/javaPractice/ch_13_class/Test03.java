package javaPractice.ch_13_class;

public class Test03 {

	public static void main(String[] args) {

		//�ܺ� Ŭ���� ���
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass�� a�� = " + oc.a);//3
		
		//static ������ Ŭ���������� ���� ����
		System.out.println("OuterClass�� b�� = " + OuterClass.b); //4
		//System.out.println("OuterClass�� b�� = " + OuterClass.StaticInner.d); //���ٺҰ�
		System.out.println("OuterClass�� StaticInner�� stat�� = " + OuterClass.StaticInner.stat); //10
		OuterClass.StaticInner.staticMethod(); //<Static Inner> //Ŭ���������� ���ٰ���
		
		System.out.println("\n====== inner Ŭ���� �����ϱ� ======");
		OuterClass oc2 = new OuterClass(); //�ܺ� Ŭ������ ��ü ���� �� ���
		OuterClass.Inner inner = oc2.new Inner(); //�ν��Ͻ� ���� Ŭ������ ��ü ����
		
		System.out.println("Inner�� c�� = " + inner.c); //5
		inner.innerMethod(); //<Inner Class>
		
		System.out.println("\n===== static inner Ŭ���� �����ϱ� ====");
		OuterClass.StaticInner si = new OuterClass.StaticInner(); //static ���� Ŭ������ ��ü ����
		System.out.println("StaticInner�� d�� = " + si.d);//6
		si.staticMethod(); //<Static Inner> �� Ŭ����, ��ü ��θ� ����� ���� ����
	}

}
