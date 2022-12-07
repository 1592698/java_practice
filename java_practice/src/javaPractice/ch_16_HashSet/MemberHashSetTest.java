package javaPractice.ch_16_HashSet;


public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001,"이이이");
		Member memberSon = new Member(1002,"손손손");
		Member memberPark = new Member(1003,"박박박");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(memberLee); //중복된 객체 저장
		memberHashSet.showAllMember();//중복된 객체는 저장되지 않음
		
		//아이디 중복된 객체를 저장하지 않으려면 equals(), hashCode() 메서드를 오버라이딩 해야함
		
		Member memberHong = new Member(1003, "홍홍홍"); //1003 아이디 중복 회원 추가
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
