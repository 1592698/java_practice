package javaPractice.ch_06_array;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*�ζ� ��ȣ ���ϱ�*/
		// 1~45������ ������ ���� 6�� ���ϸ� �ߺ��� ���ɼ��� �ִ�.
		//45���� �������� �����ϱ� ���� �迭 ����
		
		int[] ball = new int[45];
		
		//�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		for ( int i = 0; i < ball.length; i++)
			ball[i] = i + 1; //ball[0]�� 1�� ����ȴ�.
		
		//�迭�� ����� ���� �� ���̵��� ����� ū �ݺ�Ƚ���� �����Ѵ�.
		//�迭�� ù ��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		
		for ( int i = 0; i < 10000; i++) {
			int j = (int)(Math.random() * 45); //�迭 ����(0~44)�� ������ ���� ��´�.
			
			//temp: �� ���� �ٲٴµ� ����� �ӽ� ����
			int temp = ball[0];
			ball[0] = ball[j];
			ball[j]= temp;
		}
		//�迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		
		for ( int i = 0; i < 6; i++) {
			System.out.println(ball[i]);
		}
		
	}

}
