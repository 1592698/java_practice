package javaPractice.ch_17_Map;

import java.util.HashMap;
import java.util.Map;

class Student { //�й��� Ű�� ���ٸ� ������ Ű�� �ν�
	public int no;
	public String name;
	
	public Student (int no, String name) {
		this.no=no;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return no + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return(no == student.no) && (name.equals(student.name));
		}
		else {
			return false;
		}
	}
}
public class Student_Test {
	public static void main(String[] args) {
		Map<Student, Integer> map =new HashMap<Student, Integer>();
		
		//�й��� �̸��� ������ Student�� Ű�� ����
		map.put(new Student(1, "�����"), 95);
		map.put(new Student(1, "�����"), 95);
		map.put(new Student(1, "������"), 95);
		
		System.out.println("�� Entry �� : " + map.size()); 
		//����� �� Map.Entry �� ���
	}

}
