package javaPractice.ch_11_abstract;

public class Elementary extends Student {

	public Elementary(String name, int grade) {
		// TODO Auto-generated constructor stub
		super.name= name;
		super.grade=grade;
	}
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary 생성자 호출");
		super.name = name;
		super.grade = grade;
		super.teacher= teacher;
	}
	public Elementary() {
		this("이순신", 3);
		System.out.println("Elementary 생성자 호출");
	}
	
	//초등학교 담임선생님을 구하는 메서드
	public String getClassTeacher() {
		return "박길순 선생님";
	}
	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "담당 선생님 :" +teacher;
	}
}
