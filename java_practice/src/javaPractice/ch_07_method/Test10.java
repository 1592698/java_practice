package javaPractice.ch_07_method;

public class Test10 {

	public void setAddress(String addr) {
		addr = "��⵵ ������ ��ȱ�";	
	}
	public static void main(String[] args) {

		String address = "����� ������ ������";
		
		Test10 st = new Test10();
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println("address: " + address); //address: ����� ������ ������
		
		st.setAddress(address);
		
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println("address: " + address); //address: ����� ������ ������
	}

}
