package javaPractice.ch_11_abstract;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 해당 소스를 추상클래스를 도입해서 오버라이딩에 강제성을 부여 할 것
		 * 객체 생성시에 담당 교수나 선생을 입력하는 생성자를 추가 할 것*/
		University university = new University("홍길동",3,22,"차범근");
		Elementary elementary = new Elementary("이순신",2,"홍명보");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		
		for(Student s : students) {
			System.out.println("학생이름: " + s.getName());
			System.out.println(s.getTeacher());
		}
		
		/*
		 * 학생 이름: 홍길동
		 * 담당 교수님 : 차범근
		 * 학생 이름 : 이순신
		 * 담당 선생님 : 홍명보
		 * */

	/*개발 관리자가 Student 상위 클래스를 만들면서 학생의담당 선생이나 교수를 구하는 메서드
	 * getTeacer()를 만들었고, 각 개발자에게 오버라이딩을 하라고 시킴
	 * 하지만 기존의 개발자가 교체되어서 해당 프로젝트에 익숙하지않은경우
	 * 관리자의 지시를 잘못이해해서 Elementary, University클래스 제직시에
	 * 기능은 유사하지만 이름이 다른 메서드를 만들게 됨
	 * 
	 * 이 후에 다른 개발자들이 만든 Student를 상속한 클래스와 통일성을 잃어버리게 됨
	 * 현재 프로그래밍 경향은 개발자가 각 기능을 알아서 구현하는 것보다는
	 * 프로젝트의 규모가 점점 커지므로 향후 유지보수나 관리를 위해서는
	 * 누구나 쉽게 소스를 이행하고, 소스의 구조를 일정하게 유지해야할 필요성이 있음
	 * 하지만 이런 방식으로 오버라이딩을 구현하면 개발자가 임의로 소스를 구현할수 없기때메
	 * 통일성을 잃어버릴수 있음*/
	}

}
