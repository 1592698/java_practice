package javaPractice.ch_14_exeption;


/*
 * Member Ŭ�������� id�� �̸�, ����ó�� �����ϴ� �ʵ尡 �ִ�.
 * Member Ŭ������ �ۼ��ϵ�, Object�� toString() �޼��带 �������ؼ� �Ʒ��� ���� �������� �ۼ��϶�
 * ������ :
 * blue: ���Ķ� */
public class Test20 {

	public static void main(String[] args) {

		Member member = new Member("blue", "���Ķ�", "010-1234-5678");
		System.out.println(member);
	}
}
class Member{
	String id;
	String name;
	String phone;
	
	 Member(String id,String name, String phone) {
		this.name=name;
		this.phone=phone;
		this.id=id;
	}

	@Override
	public String toString() {
		return id +": " +name;
	}

	
	 
}