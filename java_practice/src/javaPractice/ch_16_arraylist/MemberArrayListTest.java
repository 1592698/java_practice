package javaPractice.ch_16_arraylist;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		MemberLinkedList2 memberLinkedList2 = new MemberLinkedList2();
		
		
		//새로운 회원 인스턴스 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		/*
		 * 이지원회원님의 아이디는 1001입니다.
			손민국회원님의 아이디는 1002입니다.
			박서원회원님의 아이디는 1003입니다.
			홍길동회원님의 아이디는 1004입니다.*/
		
		//ArrayList에 회원 추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		memberArrayList.showAllMember(); //전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberID()); //홍길동 회원 삭제
		memberArrayList.showAllMember();
		
		/*
		 * 이지원회원님의 아이디는 1001입니다.
			손민국회원님의 아이디는 1002입니다.
			박서원회원님의 아이디는 1003입니다.*/
		
		//리스트링크
		
		System.out.println("리스트 링크 시작");
		
		memberLinkedList2.addMember(memberLee);
		memberLinkedList2.addMember(memberSon);
		memberLinkedList2.addMember(memberPark);
		memberLinkedList2.addMember(memberHong);
		
		memberLinkedList2.showAllMember();
		
		memberLinkedList2.removeMember(memberHong.getMemberID());
		memberLinkedList2.showAllMember();
	}

}
