package javaPractice.ch_16_arraylist;

import java.util.LinkedList;





public class MemberLinkedList2 {

	private LinkedList<Member> linkedlist; //ArrayList ����
	
	public MemberLinkedList2() {
		linkedlist = new LinkedList<Member>(); //Member������ ������ LinkedList ����
	}
	public void addMember(Member member) {
		linkedlist.add(member); //ȸ���� �߰�
	}
	public boolean removeMember(int memberID) {
		//��� 1
		for(int i=0; i<linkedlist.size(); i++) {
			Member member = linkedlist.get(i); //get() �޼���� ȸ���� ���������� ������
			if(member.getMemberID()==memberID) { //ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
				linkedlist.remove(i); //�ش� ȸ���� ����
				return true;
			}
		}
		
		//���2
//		for(Member member : linkedlist) {
//			if(member.getMemberID()==memberID) { //ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
//				linkedlist.remove(member); //�ش�ȸ���� ����
//				return true;
//			}
//		}
	
		System.out.println(memberID + "�� �������� �ʽ��ϴ�."); //�ݺ����� ������ �ش� ���̵� ã�� ���� ���
		return false;
	}
	public void showAllMember() { //��ü ȸ���� ����ϴ� �޼���
		for(Member member : linkedlist) {
			System.out.println(member);
		}
		System.out.println();
	}
}
