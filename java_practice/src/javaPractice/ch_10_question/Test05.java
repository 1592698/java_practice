package javaPractice.ch_10_question;


class Score {
	private int kor, math, eng, com;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		
		if(kor >=0 && kor<=100) {
			System.out.println("���������� " + (this.kor = kor));
			
		}
		else System.out.println("���� �߸���");
	}
	

}
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score score = new Score();
		//score.kor = -500; ���� : �ܺο��� ���� �Ұ�
		score.setKor(80); //������ �����ϴµ� �߸��� �� (����)�� �Էµ�
	}

}
