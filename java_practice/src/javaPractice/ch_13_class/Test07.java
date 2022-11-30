package javaPractice.ch_13_class;

/* ���� Ŭ������ ����� static���� �����Ǿ����� ���� Ŭ������ �ݵ�� static���� �����ؾ���*/

/*MyOuter3.Inner.getUserInfo()�� ȣ���ؼ� �Ʒ� ������ ��µǵ��� main()�޼��� �ۼ�
 * �������� >> �ּҴ� : ������ ������, ��ȭ��ȣ 010-1111-2222*/

class MyOuter3{
	private String name;
	private int age;
	
	public MyOuter3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name;}
	public int getAge() { return age;}
	
	static class Inner{
		private String address;
		static String tel = "010-1111-2222";
		
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
			//static ���� Ŭ�������� �ܺ� Ŭ������ ��� ������ ������ �Ұ����ϴ�.
			//return name + " " + age;
			return "�ּҴ� : " + address + ", ��ȭ��ȣ�� : "+ tel;
		}
	} //end Inner_class
}//end Outer_class

public class Test07 {                                                     

	public static void main(String[] args) {
		
		MyOuter3.Inner inner = new MyOuter3.Inner("������ ������");
		
		
		System.out.println("��������>> "+ inner.getUserInfo());
	}

}