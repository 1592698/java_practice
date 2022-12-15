package student_db;

public class Subject {

	private int code;
	private String subjectName;
	
	private boolean[] classCheck = {false, false, false,false}; //���� ��û�� �ϸ� true�� ����
	private int[] classScore= {0,0,0,0}; //�� ���� ����
	Subject(){
	}
	public Subject(int code, String subjectName){
		this.code = code;
		this.subjectName = subjectName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public boolean[] getClassCheck() {
		return classCheck;
	}
	public void setClassCheck(int index, boolean check) {
		this.classCheck[index]=check; 
	}
	public int[] getClassScore() {
		return classScore;
	}
	public void setClassScore(int index, int score) {
		this.classScore[index] = score;
	}
}
