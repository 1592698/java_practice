package javaPractice.ch_14_exeption;

/*����� ���� ���ܸ����*/

class MyScore{
	private int score;
	public void setScore(int s) throws MyException{
		if(s<0)
			throw new MyException("������ ������ �� �� �����ϴ�");
		else {
			this.score=s;
		}
	}
}
class MyException extends Exception {

	public MyException(String string) {
		super(string);
	}

}

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyScore obj = new MyScore();
		try { 
			obj.setScore(-10);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
