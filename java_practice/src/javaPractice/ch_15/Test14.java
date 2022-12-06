package javaPractice.ch_15;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.ObjLongConsumer;

/*Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������ؼ�
 * Student�� �й� studentNum�� ������ ���� ��ü�� �� �� �ֵ��� �غ�����.
 * Sutdnet Ŭ������ �ʵ�� ������ �����ϴ�.
 * hashCode()�� ���� ���� studentNum�ʵ� ���� �ؽ��ڵ带 ���� �ϵ��� �ϼ���
 * 
 * ������: 
 * 1�� �л��� ���� : 95*/
class Student{
	private String studentNum;
	
	public Student( String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	//�ڵ� �ۼ�
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
public class Test14 {

	public static void main(String[] args) {
		//StudentŰ�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);
		
		
	}
}
