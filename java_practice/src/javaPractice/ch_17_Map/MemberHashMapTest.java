package javaPractice.ch_17_Map;


public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�ռռ�");
		Member memberPark = new Member(1003,"�ڹڹ�");
		Member memberRu = new Member(1004,"����");
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberRu);
		
		memberHashMap.showAllMember();
		
		
		memberHashMap.removeMember(1004); //ȸ�� ���̵� (key��) �� 1004�� ȸ�� ����
		memberHashMap.showAllMember();
	}

}
