package Test;

public class Practice_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ʒ��� �迭�� �̿��Ͽ� �������� ������ �ϼ��� �� ���� �ο��� 3���Դϴ�
		
		String[] students = {"���ȯ","������","������","������","������",
				"�ڱ���","�ڼ���","�ڼ���","������","������",
				"���","���ϴ�","�ſ�ȭ","������","������",
				"������","������","���¹�","�̱���","�̼�ȣ",
				"�̽���","�̿���","����","������","�ֹμ�",
				"������","Ȳ����"};
		
		int numberPerTeam =3;
		int count =0;
		
		for(int i=0; i<students.length; i++) {
			
			int n = (int)(Math.random()*students.length);
			String temp = students[0];
			students[0]=students[n];
			students[n]=temp;
		}
		
		for(int i=0; i<students.length; i++) {
			
			if((i +1) % numberPerTeam ==1) {
				System.out.print(++count + "�� : ");
			}
			
			System.out.print(students[i] + " ");
			
			if((i+1) % numberPerTeam ==0) {
				System.out.println();
			}
		}
	}

}
