package javaPractice.ch_16_TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"이이이");
		Member memberSon = new Member(1002,"손손손");
		Member memberPark = new Member(1003,"박박박");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍홍홍"); //1003 아이디 중복 회원 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
