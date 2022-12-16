package javaPractice.ch_19_util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test10 {

	public static void main(String[] args) {

		/*�ð��� ���ϰ� ���� �޼��带 Ȯ���ϴ� �ڵ�
		 * minusHours(long) �ð� ����,
		 * minusMinutes(long) �� ����,
		 * minusSeconds(long) �� ����,
		 * minusNanos(long) ������ ����
		 * 
		 * plusHours(long) �ð� ���ϱ�,
		 * plusMinutes(long) �� ���ϱ�,
		 * plusSeconds(long) �� ���ϱ�,
		 * plusNanos(long) ������ ���ϱ�*/
		
		LocalDateTime localDateTime = LocalDateTime.now(); //����ð�
		System.out.println("���� �ð� : " + localDateTime);
		//���� �ð� : 2022-12-16T14:12:00.731641500
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(5).plusMinutes(30).minusSeconds(4);
		//5�ð��� ����, 30���� ���ϰ�, 4�ʸ� ��
		System.out.println("���� �ð� : " + localDateTime1);
		//���� �ð� : 2022-12-16T09:46:56.731641500
		
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		//ld2 ������ 24�ð��� ��.
		System.out.println("�ڵ� ���� �ð� : " + localDateTime2);
		//�ڵ� ���� �ð� : 2022-12-15T09:46:56.731641500
	}

}
