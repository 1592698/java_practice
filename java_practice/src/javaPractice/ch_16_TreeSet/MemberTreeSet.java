package javaPractice.ch_16_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet; //treeSet선언
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();//treeSet 생성
	}
	public void addMember (Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		//매개변수로 받은 회원 아이디에 해당하는 회원 삭제
		
		Iterator<Member> ir = treeSet.iterator(); //iterator를 활용해 순회함
		while(ir.hasNext()) {
			Member member = ir.next(); //회원을 하나씩 가져와서
			int tempId = member.getMemberID(); //아이디 비교
			if(tempId == memberId) { //같은 아이디인 경우
				treeSet.remove(member); //회원 삭제
				return true;
			}
		}
		System.out.println(memberId + " 가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		//전체 회원출력
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
