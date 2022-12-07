package javaPractice.ch_16_HashSet;

public class Member {

	private int memberId; //ȸ�����̵�
	private String memberName; //ȸ���̸�
	
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
		return memberName + "ȸ������ ���̵�� " + memberId+ "�Դϴ�.";
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
	
	
	
}
