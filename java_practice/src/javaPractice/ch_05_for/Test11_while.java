package javaPractice.ch_05_for;

public class Test11_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ø while, ������ ���
		
		int i = 2;
		while(i <=9) {
			System.out.println("*** " + i + "�� ***");
			int j = 1;
			while(j <= 9) {
				System.out.println( i +"*"+j+"="+ i*j);
				j++;
			}
			System.out.println();
			i++;
		} //end of while(i<=9)
	}

}