package student_db;

public class Student {

	private int studentNumber; //�й�
	private String name; //�̸�
	private int phoneNumber; //��ȭ ��ȣ
	private String memo; //�޸�
	private int code; //���� �ڵ�
	
	public Student() {
		
	}
	public Student(int studentNumber,String name,int phoneNumber,String memo,int code) {
		this.studentNumber=studentNumber;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.memo=memo;
		this.code=code;
	}
	public Student(int studentNumber) {
		this.studentNumber=studentNumber;
	}
	public Student(int studentNumber, String name, int phoneNumber, String memo) {
		this.studentNumber=studentNumber;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.memo=memo;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "Person [�й�=" + studentNumber + ", �̸�=" + name + ", ��ȣ=" + phoneNumber + ", �޸�="
				+ memo + "]";
	}
	public void setClassCheck(int index, boolean check) {
		// TODO Auto-generated method stub
		
	}
	public void setClassScore(int index, int i) {
		// TODO Auto-generated method stub
		
	}
	public boolean[] getClassCheck() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
