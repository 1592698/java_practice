package javaPractice.ch_02;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����ڿ����� ���ڿ� �ڵ� ��ȯ
		//�����ڴ� �� ���� ���
		//�ǿ��ڰ� ������ ��쿡�� ���� ����
		//�ǿ����� �� �ϳ��� ���ڿ��̸� ������ �ǿ����ڵ� 
		//���ڿ��� �ڵ� ��ȯ�Ǿ ���ڿ� ���� ������ ����
		
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); //20
		
		//���� ���� ����
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);// 128
		//�����ڴ� ���ʿ��� �ô������� ������� ������ �Ǳ� ������
		//12+"8"�� ��
		
		String str2= 10 + "2" +8;
		System.out.println("str2 : "+str2); //1028
		
		String str3= "10"+2+8;
		System.out.println("str3 : "+ str3); //1028: "102"+8
		
		String str4= "10"+ (2+8);
		System.out.println("str4 : "+str4); // 1010: "10"+10��ȣ�� ���� ����
	}

}
