package javaPractice.ch_09_constructor;


class User2 {
	private String name;
	private int age;
	
	User2(String name, int age){ // �Ű������� ���� ������
		this.name= name;
		this.age= age;
	}
	
	public int getAge() { 
		//private�� �Ժη� ������ ���� �Ϸ��� �޼��带 ���ؼ� �ؾ��� 
		//�޼��嵵 private�ɾ�δ°� ���� ���� Ŭ������������ ���Ǳ⶧�� �ٱ��ʿ��� ��� ���� public�̸� ���� ����
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
}
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	User2 user1 = new User2("ö��", 20); //�ν��Ͻ� ����
	User2 user2 = new User2("����", 19); //�ν��Ͻ� ����
	
	//user2.age = 99; //�����߻�. ������ ���� �Ұ�
	
	user2.setAge(20);
	System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
	}

}
