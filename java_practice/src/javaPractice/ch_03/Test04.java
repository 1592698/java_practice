package javaPractice.ch_03;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ 
		 * ������ �� �� �л��� �� ���� ������ �ְ�, 
		 * ���������� �� ���� ������ ���ϴ� �ڵ�
		 * ��ſ� �˸��� �ڵ带 �ۼ��Ͻÿ�
		 */
		int pencils = 534;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent); //17
		
		//���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft); //24
	}

}
