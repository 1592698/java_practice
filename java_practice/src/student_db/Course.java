package student_db;

public class Course {

	private int code;
	private int studentNumber;
	private int score;
	
	
	public Course(int code, int studentNumber) {
		this.code=code;
		this.studentNumber=studentNumber;
	}
	
	public Course(int code, int studentNuber, int score) {
		this.code=code;
		this.studentNumber= studentNuber;
		this.score=score;
	}
	public Course() {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
