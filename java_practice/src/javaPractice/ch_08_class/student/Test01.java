package javaPractice.ch_08_class.student;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Student studentAhn = new Student();
	studentAhn.studentName = "�Ƚ¿�";
	
	System.out.println(studentAhn.studentName); //�Ƚ¿�  1�� ���
	System.out.println(studentAhn.getStudentName()); //�Ƚ¿�  2�� ���
	}

}
