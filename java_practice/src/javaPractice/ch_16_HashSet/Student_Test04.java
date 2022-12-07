package javaPractice.ch_16_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/*HashSet에 Student 객체를 저장할려고 한다.
 * 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않게 하라.
 * Student 클래스를 만들어라*/
class Student{

	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum=studentNum;
		this.name= name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
				return student.studentNum == studentNum;
		}
		else {
			return false;
		}
	}
}
public class Student_Test04 {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우")); //학번이 같아서 저장되지 않음
		
		Iterator<Student>iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" +student.name);
		}
		
		/*
		 * 1-홍길동
		 * 2-신용권*/
		
	}

}
