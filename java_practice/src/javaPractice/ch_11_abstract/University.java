package javaPractice.ch_11_abstract;

public class University extends Student{

	private int courses; //��û ����
	
	public University(String name, int grade, int courses) {
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade= grade;
		this.courses = courses;
	
	}
		
	public University() {
		this("�̼���",2,20);
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
	//overriding �޼���
	public String getStudInfo() {
		System.out.println("University Ŭ������ getStudInfo �޼ҵ� ȣ��");
		return "�̸��� >> " + name + ",�г���>>" + grade + ", ��û������>> " + courses;
	}
	
	//���� ������ �̸��� ���ϴ� �޼���
//	public String getProfessor() {
//		return "�̼��� ������";
//	}


	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "��� ������ :" + teacher;
	}


	
}
