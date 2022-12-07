package javaPractice.ch_16_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/*HashSet�� Student ��ü�� �����ҷ��� �Ѵ�.
 * �й��� ������ ������ Student��� �����ϰ� �ߺ� ������ ���� �ʰ� �϶�.
 * Student Ŭ������ ������*/
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
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�")); //�й��� ���Ƽ� ������� ����
		
		Iterator<Student>iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" +student.name);
		}
		
		/*
		 * 1-ȫ�浿
		 * 2-�ſ��*/
		
	}

}
