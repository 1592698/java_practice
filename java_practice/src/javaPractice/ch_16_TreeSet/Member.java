package javaPractice.ch_16_TreeSet;

public class Member implements Comparable<Member>{

	private int memberId; //회원아이디
	private String memberName; //회원이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName=memberName;
	}
	public int getMemberID() {
		return memberId;
	}
	public void setMemberID(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId+ "입니다.";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId==member.memberId){
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Member member) {

		/*비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬.
		 * 메서드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우에는 음수를 리턴하고
		 * 크기가 동일하다면 0, 클경우에는 양수를 리턴.
		 * return(this.memberId-member.memberId); //memberId가 정수이기때문에 오름차순으로 정렬*/
		return (this.memberId - member.memberId) * (-1);
		//내림차순으로 정렬하기 위해 반환 값을 음수로 만듦
	}
	
	
}
