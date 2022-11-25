package javaPractice.ch_08_class.student;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Student studentAhn = new Student();
	studentAhn.studentName = "¾È½Â¿¬";
	
	System.out.println(studentAhn.studentName); //¾È½Â¿¬  1¹ø ¹æ¹ý
	System.out.println(studentAhn.getStudentName()); //¾È½Â¿¬  2¹ø ¹æ¹ý
	}

}
