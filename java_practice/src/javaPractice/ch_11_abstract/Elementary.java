package javaPractice.ch_11_abstract;

public class Elementary extends Student {

	public Elementary(String name, int grade) {
		// TODO Auto-generated constructor stub
		super.name= name;
		super.grade=grade;
	}
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary ������ ȣ��");
		super.name = name;
		super.grade = grade;
		super.teacher= teacher;
	}
	public Elementary() {
		this("�̼���", 3);
		System.out.println("Elementary ������ ȣ��");
	}
	
	//�ʵ��б� ���Ӽ������� ���ϴ� �޼���
	public String getClassTeacher() {
		return "�ڱ�� ������";
	}
	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "��� ������ :" +teacher;
	}
}
