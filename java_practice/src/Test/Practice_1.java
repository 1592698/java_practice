package Test;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue���� ������ �ݺ��� �پ�Ѱ� �ݺ��� ����
		//�ݺ��� ����Ǵٰ� continue���� ������ �ݺ����� ���� ������ ���� �����ݺ��� ��� ����
		
		int money = 10000;
		System.out.println("���� ��������"+money);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�󸶸� ����ϰڽ��ϱ�?");
			int spendMoney = scanner.nextInt(); //���� �Է¹���
			
			if(!(spendMoney > 0 && spendMoney <= money)) {
				//���� ���� ������ ũ�ų� ���� �Է��ϸ� �ٽ� �Է� �䱸
			//if ( i< 0 || i>money){
				System.out.println("�ٽ� �Է����ּ���(��� ������ Ʋ�Ƚ��ϴ�).");
				continue; //������ �ݺ��� ����� �ٽ� �ݺ� ����
			}
			
			money -=spendMoney;
			System.out.println("����" + money +"���� ���ҽ��ϴ�");
			//���� ���� �� ���
			if (money ==0) {
				break;
			}
		}
		System.out.println("��� ���� ����մϴ�. ����");
		scanner.close();
		
	}

}
