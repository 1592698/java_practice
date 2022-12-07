package javaPractice.ch_16_HashSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


//Member 객체를 중복 없이 저장하는 HashSet
//hashCode()와 equals() 메소드를 재정의 하지 않으면 저장된 객체가 2개
class MemberShip{
	//hashCode()와 equals() 메서드 재정의
	
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		//name과 age값이 같음녀 동일한 hashcode 반환
		return name.hashCode()+ age; //String의 hashCode() 이용
	}

	
	@Override
	public boolean equals(Object obj) {//name과 age값이 같으면 true 리턴
		//name과 age값이 같으면 true 반환
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
		
		//인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new MemberShip("홍길동", 30));
		set.add(new MemberShip("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());//1
	}
}