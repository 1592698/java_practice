package javaPractice.ch_14_exeption;

public class Test09 {

	//������ ���Ḧ �ϴµ�, try~ catch�� �̿��ؼ�
	//���ܸ� �����ϰ� ó���ϵ��� �ڵ带 ������ ��
	public static void main(String[] args) {

		
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = i;
		}
		try {
			for(int i=0; i<11; i++) {
				System.out.println(arr[i]);
			}
			
		}
		catch(IndexOutOfBoundsException  e) {
			System.out.println(e.getMessage());
			System.out.println("����");
		}
		
	}

}
