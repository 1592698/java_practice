package javaPractice.ch_09_constructor;

public class Test09 {
	/*�л��� ��Ÿ���� Ŭ���� Student�� �����
	 * �л��� �̸�(name)�� �й�(rollno), ����(age)�� ������
	 * �й��� private�� �����Ѵ�*/
	public static void main(String[] args) {
		Student student =new Student("kim","0001",20);
		/*�л��� �̸�: Kim
		 * �л��� �й�: 0001
		 * �л��� ����: 20
		 * Student ��ü�� �����Ǿ����ϴ�*/
	}
}
class Student{
	public String name;
	private String rollno;
	public int age;
	
	public Student(String name, String rollno, int age) {
	this.name=name;
	this.rollno=rollno;
	this.age=age;
	
	System.out.println("�л��� �̸�: " + name + " \n�л��� �й�: " +rollno+" \n�л��� ����: " +age +"\nStudent��ü�� �����Ǿ����ϴ�");
	}
}
