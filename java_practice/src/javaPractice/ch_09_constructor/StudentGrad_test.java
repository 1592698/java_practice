package javaPractice.ch_09_constructor;

public class StudentGrad_test {

	/*Student Ŭ������ �����Ͻÿ�
	 * �̸� name , �� ban, ��ȣ no �� �Է¹޴� �����ڸ� ����ÿ�
	 * ���� kor, ���� eng, ���� math ������ �Է¹޴� updateRecord() �޼ҵ带 �ۼ��Ͻÿ�
	 * �л��� �̸��� ��ȯ�ϴ� getName(), �Է¹��� ������ �հ踦 ���ϴ� getTotal()
	 * ����� ���ϴ� getAverage()�� �ۼ��Ͻÿ�*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentGrade s = new StudentGrade("ȫ�浿", 1, 1);
		s.updateRecord(100,60,76);
		System.out.println(s);
		
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
	}

}

