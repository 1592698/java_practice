package javaPractice.ch_03;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*��������
		 * 2�� �������̰�, ���� boolean ���̰� ����� boolean
		 */
		
		int a = 10;
		System.out.println(5 < a && a <25); //true -> true && true
		System.out.println((5 < a && a <25) && a % 2 == 0 ); //true -> true && true
		
		a = 4;
		System.out.println((5 < a && a < 15) && a % 2 == 0); //false
		System.out.println((5 < a && a < 15) || a % 2 == 0); //true
	}

}
