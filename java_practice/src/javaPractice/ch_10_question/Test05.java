package javaPractice.ch_10_question;


class Score {
	private int kor, math, eng, com;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		
		if(kor >=0 && kor<=100) {
			System.out.println("국어점수는 " + (this.kor = kor));
			
		}
		else System.out.println("값이 잘못됨");
	}
	

}
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score score = new Score();
		//score.kor = -500; 오류 : 외부에서 접근 불가
		score.setKor(80); //정수를 저장하는데 잘못된 값 (음수)가 입력됨
	}

}
