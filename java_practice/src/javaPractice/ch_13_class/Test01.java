package javaPractice.ch_13_class;

class A {
	class InstanceInner{} // ����Ŭ����
	static class StaticInner{} // static ���� Ŭ����. ����ƽ ������� ���٤� ����
	
	StaticInner st1 = new StaticInner();
	
	//�ν��Ͻ� ������� ���ٰ���
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		//����ƽ ����� ����ƽ ���� Ŭ������ ���� ����
		StaticInner st2 = new StaticInner();
		
		//����ƽ ����� �ν��Ͻ� ����� ���� �Ұ�
		//InstanceInner ii2 = new InstanceInner(); //���� �߻�
	}
	
	void instanceMethod() {
		//�ν��Ͻ� ����� ��� ���� ����
		
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
