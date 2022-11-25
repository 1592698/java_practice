package javaPractice.ch_11_abstract;


abstract public class Student{
	public String name;
	public int grade;
	public String teacher;

	
	public Student() {
		System.out.println("Student 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getStudInfro() {
		System.out.println("Student 클래스의 getStudInfo()메소드 호출");
		 return "이름은:" + name + ", 학년은" + grade;
	}
	//학생의 담임선생님의 이름을 구하는 메서드
	abstract public String getTeacher();
	public String getProfessor() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	abstract public String getProfessor();
}




