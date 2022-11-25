package Test;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ������ ���������� ����
		 * 1) ���� ���� ���� ���� ������ 1,2,3,���� �����Ѵ�
		 * 2) ��ǻ�Ͱ� ������ ���������� �����͸� �����
		 * �ټ����� ������ ������ �� �ִ� �迭�� ����� 1,2,3 �����͸� ���� �ʱ�ȭ�Ѵ�
		 * 3)������ �� 5ȸ �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ������Ѵ�
		 * 4)����Ƚ�� / �� Ƚ���� �Բ� �Է� �޼����� ����Ѵ�
		 * 5) Ű����� 1,2,3 �� �ϳ��� �Է��ϰ�, ��ǻ�Ϳ� Ű����� �Է��� ���� ���Ͽ� ���� �̰�����˷��ش�
		 * 6) ��� ��쿡�� Ƚ���� �������� �ʴ´�
		 * 7) ������ �����ϸ� ���� �̰���� �˷��ش�*/
		
		
		Random random= new Random();
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];
		String[] gameIntems = {"����","����","��"}; //����� ���� ���ڿ�
		int[] result = new int[2]; //���� ����� ����, ������ �Ǽ��� �ƴ϶� ���� �̰���� ����. 0: ����ڰ� �̱�
		String[] resultStrs = {"����ڰ� �̱�", "���� �̱�"}; //����� ���� ���ڿ�
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i]=random.nextInt(3)+1; //1~3���� �����ϰ� ���� ��ȯ
		}
		System.out.println(Arrays.toString(numbers)); //{3,3,2,2,3}
		
		//3) ������ �� 5�� �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ°����� �Ѵ�
		//4) ���� Ƚ�� / ��Ƚ���� �Բ� �Է� �޽����� ����Ѵ�
		for(int i=0, answer; i<numbers.length; i++) {
			System.out.print((i+1)+"/"+numbers.length +"�Դϴ�. ����(1), ����(2), ��(3) >>>>> ");
			answer=scanner.nextInt();
			System.out.print(gameIntems[answer-1] +"�Է��ϼ̰�, ���� " + gameIntems[numbers[i]-1] + " -----");

			if(answer==numbers[i]) {//�����
				System.out.println("�����ϴ�");
				i--; //i���� �ٲ����ʰ�
			} else if((answer +1)%3 ==numbers[i] %3) { //����ڰ� ���°��
				result[1]++;
				System.out.println("���� �̱�");
				
			}
			else {
				result[0]++;
				System.out.println("����ڰ� �̱�");
			}
		}
		int max = result[0];
		int maxIndex = 0;
		for(int i=0; i<resultStrs.length; i++) {
			if(max < result[i]) {
				max = result[i];
				maxIndex = i;
			}
		}
		System.out.println("���Ӱ���� " + resultStrs[maxIndex]);
		
	}

}
