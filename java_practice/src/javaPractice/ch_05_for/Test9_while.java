package javaPractice.ch_05_for;

public class Test9_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for���� while������ ����
		
		int num =0;
		int sum =0;
		
		for(num =1; num <=10; num++) {
			sum+=num;
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		
		while( num<=10) {
			sum+=num;
			num++;		
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");	
		
	}

}
