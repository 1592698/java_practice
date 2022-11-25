package javaPractice.ch_10_overriding;

class MyParent{
	void pDisplay() {
		System.out.println("Super: Parent's Display");
	}
}
class MyChild extends MyParent{

	@Override
	public void pDisplay() {
		super.pDisplay();
		System.out.println("Sub Class: Parent's Display");
	}

	public void cDisplay() {
		System.out.println("Sub Class: Child's Display");
	}
	
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild c = new MyChild();
		c.pDisplay(); //�����ǵ� ���� Ŭ������ �޼��带 ȣ���Ѵ�
		
		/*
		 * Super: Parent's Display
		 * Sub Class : Parent's Display*/
	}

}
