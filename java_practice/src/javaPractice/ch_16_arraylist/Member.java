package javaPractice.ch_16_arraylist;

public class Member {

	private int memberID; //ȸ�����̵�
	private String memberName; //ȸ���̸�
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName=memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberID+ "�Դϴ�.";
	}
}