package javaPractice.ch_02;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte kor, math, eng;
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		System.out.println("����: " + sum); //����: 241
		
		int avg_01 = sum / 3;
		System.out.println("���: " + avg_01); //���: 80
		
		double avg_02 = sum / 3; // ���� / ����
		System.out.println("���: " + avg_02); //���: 80.0 -> ���� �������� ���� ���� ���� �Ŀ� �Ǽ��� ����
		
		double avg_03 = (double)sum / 3; // �Ǽ� / ����
		System.out.println("���: " + avg_03); //���: 80.33333333333333
		
		double avg_04 = sum / 3.0 ; // ���� / �Ǽ�
		System.out.println("���: " + avg_04); //���: 80.33333333333333
		
		double avg_05 = (double)sum / 3.0; // �Ǽ� / �Ǽ�
		System.out.println("���: " + avg_05); //���: 80.33333333333333
	}

}
