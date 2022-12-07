package javaPractice.ch_16_HashSet;

import java.util.HashSet;

/*
 * 출력 결과가 다음처럼 나오도록 Group 클래스를 구현하세요
 * 400: 정약용, 100: 김유신, 200: 강감찬, 300: 이순신
 * 
 * 출력순서는 상관 없습니다.*/
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
		set.add(new Group("100", "김유신"));
		set.add(new Group("200", "강감찬"));
		set.add(new Group("300", "이순신"));
		set.add(new Group("400", "정약용"));
		set.add(new Group("100", "홍길동"));
		
		System.out.println(set);
	}

}
