package javaPractice.ch_16_arraylist;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		MemberLinkedList2 memberLinkedList2 = new MemberLinkedList2();
		
		
		//���ο� ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		/*
		 * ������ȸ������ ���̵�� 1001�Դϴ�.
			�չα�ȸ������ ���̵�� 1002�Դϴ�.
			�ڼ���ȸ������ ���̵�� 1003�Դϴ�.
			ȫ�浿ȸ������ ���̵�� 1004�Դϴ�.*/
		
		//ArrayList�� ȸ�� �߰�
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		memberArrayList.showAllMember(); //��ü ȸ�� ���
		
		memberArrayList.removeMember(memberHong.getMemberID()); //ȫ�浿 ȸ�� ����
		memberArrayList.showAllMember();
		
		/*
		 * ������ȸ������ ���̵�� 1001�Դϴ�.
			�չα�ȸ������ ���̵�� 1002�Դϴ�.
			�ڼ���ȸ������ ���̵�� 1003�Դϴ�.*/
		
		//����Ʈ��ũ
		
		System.out.println("����Ʈ ��ũ ����");
		
		memberLinkedList2.addMember(memberLee);
		memberLinkedList2.addMember(memberSon);
		memberLinkedList2.addMember(memberPark);
		memberLinkedList2.addMember(memberHong);
		
		memberLinkedList2.showAllMember();
		
		memberLinkedList2.removeMember(memberHong.getMemberID());
		memberLinkedList2.showAllMember();
	}

}
