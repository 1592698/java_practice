package javaPractice.ch_07_method;

public class Test13 {

	/*�żҵ� �����ε�
	 * c, ���̽� ����. �Ű������� Ÿ�� Ȥ�� ������ �ٸ��� ���� �̸��� ���� �޼ҵ带 ������ �� �� ����
	 * c++, ���̽㿡 �ִ� �⺻�� ����� �ڹٿ� ����
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGreet(); //�ȳ��ϼ���
		printGreet("�ȳ�~!"); //�ȳ�~!
		printGreet("�Ѽ�", "�� �����̳���?"); //�Ѽ���! �� �����̳���?
		printGreet(3); //�ȳ��ϼ���. 3��° ���°ų׿�.
		
	}
	
	public static void printGreet() {
		System.out.println("printGreet() �޼ҵ尡 �����մϴ�.");
		System.out.println("�ȳ��ϼ���");
	}
	public static void printGreet(String greeting) {
		//���� �̸��� �޼ҵ尡 ������ �Ű������� ����
		System.out.println("printGreet(String greeting) �޼ҵ尡 ����˴ϴ�.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) {
		//�Ű������� ���ڿ��� �޼ҵ尡 ������ ������ �ٸ�
		System.out.println("pringGreet(String name, String greeting) �޼ҵ尡 ����˴ϴ�");
		System.out.println(name + "��! " + greeting);
	}
	public static void printGreet(int cnt) {
		//�Ű������� �ϳ��� �޼ҵ尡 ������ ������ Ÿ���� �ٸ�
	System.out.println("printGreet(int cnt) �޼ҵ尡 ����˴ϴ�");
		System.out.println("�ȳ��ϼ���." + cnt + "��° ���°ų׿�.");
	}
}
