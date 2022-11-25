package javaPractice.ch_03;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*534자루의 연필을 30명의 학생들에게 똑같은 개수로 
		 * 나누어 줄 때 학생당 몇 개를 가질수 있고, 
		 * 최종적으로 몇 개가 남는지 구하는 코드
		 * 대신에 알맞은 코드를 작성하시오
		 */
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent); //17
		
		//남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft); //24
	}

}
