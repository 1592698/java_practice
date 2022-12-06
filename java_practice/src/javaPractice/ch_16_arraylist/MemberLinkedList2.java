package javaPractice.ch_16_arraylist;

import java.util.LinkedList;





public class MemberLinkedList2 {

	private LinkedList<Member> linkedlist; //ArrayList 선언
	
	public MemberLinkedList2() {
		linkedlist = new LinkedList<Member>(); //Member형으로 선언한 LinkedList 생성
	}
	public void addMember(Member member) {
		linkedlist.add(member); //회원을 추가
	}
	public boolean removeMember(int memberID) {
		//방법 1
		for(int i=0; i<linkedlist.size(); i++) {
			Member member = linkedlist.get(i); //get() 메서드로 회원을 순차적으로 가져옴
			if(member.getMemberID()==memberID) { //회원 아이디와 매개변수가 일치하면
				linkedlist.remove(i); //해당 회원을 삭제
				return true;
			}
		}
		
		//방법2
//		for(Member member : linkedlist) {
//			if(member.getMemberID()==memberID) { //회원 아이디와 매개변수가 일치하면
//				linkedlist.remove(member); //해당회원을 삭제
//				return true;
//			}
//		}
	
		System.out.println(memberID + "가 존재하지 않습니다."); //반복문을 돌려서 해당 아이디를 찾지 못한 경우
		return false;
	}
	public void showAllMember() { //전체 회원을 출력하는 메서드
		for(Member member : linkedlist) {
			System.out.println(member);
		}
		System.out.println();
	}
}
