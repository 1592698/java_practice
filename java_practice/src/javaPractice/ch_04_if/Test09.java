package javaPractice.ch_04_if;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϳ⵿�� ���� å ���� ���� ��Ʈ�� ����մϴ�.
		
		int book = 15;
		book = book / 10;
		switch(book) {
		case 0: //10�� �̸�
			System.out.println("���� �� ��� �ϼ���!");
			break;
		case 1:  //10�̻� 20�� �̸�
			System.out.println("å �д� ���� ���� ���̽ó׿�");
			break;
		case 2: //20�̻� 30�� �̸�
			System.out.println("å�� ����Ͻô� ���̽ó׿�!");
			break;
		default: //30���̻�
			System.out.println("����� �ٵ����Դϴ�!");
		}
		
	}

}
