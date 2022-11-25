package javaPractice.ch_09_constructor;

public class Test09 {
	/*학생을 나타내는 클래스 Student를 만든다
	 * 학생은 이름(name)과 학번(rollno), 나이(age)를 가진다
	 * 학번은 private로 선언한다*/
	public static void main(String[] args) {
		Student student =new Student("kim","0001",20);
		/*학생의 이름: Kim
		 * 학생의 학번: 0001
		 * 학생의 나이: 20
		 * Student 객체가 생성되었습니다*/
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
	
	System.out.println("학생의 이름: " + name + " \n학생의 학번: " +rollno+" \n학생의 나이: " +age +"\nStudent객체가 생성되었습니다");
	}
}
