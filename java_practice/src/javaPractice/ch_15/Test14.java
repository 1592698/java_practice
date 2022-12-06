package javaPractice.ch_15;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.ObjLongConsumer;

/*Student 클래스를 작성하되, Object의 equals()와 hashCode()를 재정의해서
 * Student의 학번 studentNum이 같으면 동등 객체가 될 수 있도록 해보세요.
 * Sutdnet 클래스의 필드는 다음과 같습니다.
 * hashCode()의 리턴 값은 studentNum필드 값의 해시코드를 리턴 하도록 하세요
 * 
 * 실행결과: 
 * 1번 학생의 총점 : 95*/
class Student{
	private String studentNum;
	
	public Student( String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	//코드 작성
	
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
		//Student키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
		
		
	}
}
