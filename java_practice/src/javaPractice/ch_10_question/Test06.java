package javaPractice.ch_10_question;
class Score1 {
	private int kor, math, eng, com;

	public Score1(int kor, int math, int eng, int com) {
		this.kor= kor;
		this.math=math;
		this.eng = eng;
		this.com = com;
	}
	public void display() {
	
		System.out.println("국어 " + kor);
		System.out.println("수학 " + math);
		System.out.println("영어 " + eng);
		System.out.println("컴퓨터 " + com);	
	}
}
/* 점수를 입력받는 생성자를 만들고 모든 과목의 점수를 볼 수 있는 display()생성*/
public class Test06 {

	public static void main(String[] args) {

		Score1 score = new Score1(100,80,95,84);
		//s.kor;
		score.display(); // ok 외부에서 접근가능

	}

}
