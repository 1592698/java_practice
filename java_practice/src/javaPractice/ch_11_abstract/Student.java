package javaPractice.ch_11_abstract;


abstract public class Student{
	public String name;
	public int grade;
	public String teacher;

	
	public Student() {
		System.out.println("Student ������ ȣ��");
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getStudInfro() {
		System.out.println("Student Ŭ������ getStudInfo()�޼ҵ� ȣ��");
		 return "�̸���:" + name + ", �г���" + grade;
	}
	//�л��� ���Ӽ������� �̸��� ���ϴ� �޼���
	abstract public String getTeacher();
	public String getProfessor() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	abstract public String getProfessor();
}




