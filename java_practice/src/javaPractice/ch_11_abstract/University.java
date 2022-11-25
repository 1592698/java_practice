package javaPractice.ch_11_abstract;

public class University extends Student{

	private int courses; //신청 학점
	
	public University(String name, int grade, int courses) {
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade= grade;
		this.courses = courses;
	
	}
		
	public University() {
		this("이순신",2,20);
	}


	public University(String name, int grade, int courses, String teacher) {
		// TODO Auto-generated constructor stub
		super.name=name;
		super.grade=grade;
		this.courses=courses;
		super.teacher=teacher;
	}

	public int getCourses() {
		return courses;
	}
	//overriding 메서드
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름은 >> " + name + ",학년은>>" + grade + ", 신청학점은>> " + courses;
	}
	
	//지도 교수의 이름을 구하는 메서드
//	public String getProfessor() {
//		return "이순신 교수님";
//	}


	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "담당 교수님 :" + teacher;
	}


	
}
