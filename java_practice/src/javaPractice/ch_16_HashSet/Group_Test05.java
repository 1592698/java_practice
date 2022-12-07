package javaPractice.ch_16_HashSet;

import java.util.HashSet;

/*
 * ��� ����� ����ó�� �������� Group Ŭ������ �����ϼ���
 * 400: �����, 100: ������, 200: ������, 300: �̼���
 * 
 * ��¼����� ��� �����ϴ�.*/
class Group{

	String number;
	String name;
	
	public Group(String number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.number.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Group) {
			Group group = (Group) obj;
			if(this.number.equals(group.number)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return  number + " : " + name ;
	}
}

public class Group_Test05 {

	public static void main(String[] args) {
		
		HashSet<Group> set = new HashSet<Group>();
		set.add(new Group("100", "������"));
		set.add(new Group("200", "������"));
		set.add(new Group("300", "�̼���"));
		set.add(new Group("400", "�����"));
		set.add(new Group("100", "ȫ�浿"));
		
		System.out.println(set);
	}

}
