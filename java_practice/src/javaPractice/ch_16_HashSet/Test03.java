package javaPractice.ch_16_HashSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


//Member ��ü�� �ߺ� ���� �����ϴ� HashSet
//hashCode()�� equals() �޼ҵ带 ������ ���� ������ ����� ��ü�� 2��
class MemberShip{
	//hashCode()�� equals() �޼��� ������
	
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		//name�� age���� ������ ������ hashcode ��ȯ
		return name.hashCode()+ age; //String�� hashCode() �̿�
	}

	
	@Override
	public boolean equals(Object obj) {//name�� age���� ������ true ����
		//name�� age���� ������ true ��ȯ
		if(obj instanceof MemberShip) {
			MemberShip memberShip = (MemberShip) obj;
			return memberShip.name.equals(name)&& (memberShip.age == age); 
		}
		else {
			return false;
		}
	}
}

public class Test03 {
	public static void main(String[] args) {

		Set<MemberShip> set = new HashSet<MemberShip>();
		
		//�ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new MemberShip("ȫ�浿", 30));
		set.add(new MemberShip("ȫ�浿", 30));
		
		System.out.println("�� ��ü�� : " + set.size());//1
	}
}