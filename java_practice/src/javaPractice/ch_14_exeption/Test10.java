package javaPractice.ch_14_exeption;

public class Test10 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		

		try {
			System.out.println("arr[2]= " + arr[2]);
			System.out.println("arr[3]= " + arr[3]); //���ܹ߻�
			System.out.println("arr ��¿Ϸ�");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("����");
		}
		System.out.println("try/catch ���� �� ���� ����");
	}

}
