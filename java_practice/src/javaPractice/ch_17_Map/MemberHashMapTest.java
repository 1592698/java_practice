package javaPractice.ch_17_Map;


public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001,"이이이");
		Member memberSon = new Member(1002,"손손손");
		Member memberPark = new Member(1003,"박박박");
		Member memberRu = new Member(1004,"루루루");
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberRu);
		
		memberHashMap.showAllMember();
		
		
		memberHashMap.removeMember(1004); //회원 아이디 (key값) 가 1004인 회원 삭제
		memberHashMap.showAllMember();
	}

}
