package javaPractice.ch_10_question;


public class Test10_pet {
	private String name; //�ֿϵ����� �̸�
	private String masterName; //������ �̸�
	
	public Test10_pet(String name, String masterName) {
		this.name= name; //�ֿϵ����� �̸�
		this.masterName = masterName; //������ �̸�
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	public void introduce() { //�ڱ�Ұ�
		System.out.print("�� �̸��� " + name + "�Դϴ�.");
		System.out.print("  ���δ��� " + masterName + "�Դϴ�.");
	}
	
}
