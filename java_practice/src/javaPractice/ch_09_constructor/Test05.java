package javaPractice.ch_09_constructor;

class User1 {
	private String name;
	private int age;
	
	User1(String name, int age){ // �Ű������� ���� ������
		this.name= name;
		this.age= age;
	}
	
	public int getAge() { 
		//private�� �Ժη� ������ ���� �Ϸ��� �޼��带 ���ؼ� �ؾ��� 
		//�޼��嵵 private�ɾ�δ°� ���� ���� �ٱ��ʿ��� ��� ���� public�̸� ���� ����
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
}
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	User user1 = new User("ö��", 20); //�ν��Ͻ� ����
	User user2 = new User("����", 19); //�ν��Ͻ� ����
	
	System.out.println(user1.name + "�� ���̴�" + user1.age);
	user2.age = 1000;
	System.out.println(user2.name + "�� ���̴�" + user2.age);
	}

}
