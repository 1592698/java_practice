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
	
		System.out.println("���� " + kor);
		System.out.println("���� " + math);
		System.out.println("���� " + eng);
		System.out.println("��ǻ�� " + com);	
	}
}
/* ������ �Է¹޴� �����ڸ� ����� ��� ������ ������ �� �� �ִ� display()����*/
public class Test06 {

	public static void main(String[] args) {

		Score1 score = new Score1(100,80,95,84);
		//s.kor;
		score.display(); // ok �ܺο��� ���ٰ���

	}

}
