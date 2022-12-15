package student_db;

public class Subject {

	private int code;
	private String subjectName;
	
	private boolean[] classCheck = {false, false, false,false}; //수강 신청을 하면 true로 변경
	private int[] classScore= {0,0,0,0}; //각 과목 정리
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
