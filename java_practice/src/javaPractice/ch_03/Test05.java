package javaPractice.ch_03;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*������ ���� �ڸ� ���ϴ� ������ �ڵ�.
		 * ���� value�� ���� 356�̶�� 300�� ���ü� �ֵ���
		 * �ڵ� �ۼ�. ��� �����ڸ� ���
		 */
		
		int value = 356;
		System.out.println((int)(value*0.01)*100); //300
		System.out.println(value - (value % 100)); //300
		System.out.println((value / 100) * 100); //300

	}

}
