package javaPractice.ch_03;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j = i++; ���� ��, i=" + i +", j=" +j);
		//i=6, j=5
		//����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j = i++; ���� ��, i=" + i +", j=" +j);
		//i=6, j=6
	}

}
