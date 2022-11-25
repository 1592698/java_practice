package javaPractice.ch_08_class.student;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*멤버 변수로 접근하는 방법은 1)바로접근 2) 메서드를 통한 접근이 가능
		 * 일반적으로는 메서드를 통한 접근을 사용*/
		
		Student student1 = new Student();
		//student1.StudentName("안연수");
		student1.setStudentName("안연수");
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		//student2.StudentName("홍길동");
		student2.setStudentName("홍길동");
		System.out.println(student2.getStudentName());
	}

}
