package javaPractice.ch_10_question;


public class Test10_RobotPet extends Test10_pet {
	public Test10_RobotPet(String name, String masterName) { //������
		super(name, masterName); //���� Ŭ������ ������
	}
	
	public void introduce() { //�ڱ�Ұ�
		System.out.print("���� �κ��Դϴ�, �̸��� " + getName()+ "�Դϴ�.");
		System.out.print("  ���δ���, " + getMasterName()+ "�Դϴ�.");

	}
	public void work(int sw) { //���� ���� �Ѵ�
		switch(sw) {
		case 0 : 
			System.out.println("û�Ҹ� �մϴ�");
			break;
		case 1 : 
			System.out.println("������ �մϴ�");
			break;
		case 2 : 
			System.out.println("���� �����ϴ�");
			break;
		}
	}
}

