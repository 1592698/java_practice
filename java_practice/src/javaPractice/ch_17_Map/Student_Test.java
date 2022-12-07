package javaPractice.ch_17_Map;

import java.util.HashMap;
import java.util.Map;

class Student { //학번과 키가 같다면 동일한 키로 인식
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
		
		//학번과 이름이 동일한 Student를 키로 저장
		map.put(new Student(1, "김수현"), 95);
		map.put(new Student(1, "김수현"), 95);
		map.put(new Student(1, "남주혁"), 95);
		
		System.out.println("총 Entry 수 : " + map.size()); 
		//저장된 총 Map.Entry 수 얻기
	}

}
