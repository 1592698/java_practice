package javaPractice.ch_16_TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�ռռ�");
		Member memberPark = new Member(1003,"�ڹڹ�");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫȫȫ"); //1003 ���̵� �ߺ� ȸ�� �߰�
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
