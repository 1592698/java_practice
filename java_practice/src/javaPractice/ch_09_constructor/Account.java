package javaPractice.ch_09_constructor;

public class Account {

	//���� ������ �����ϱ� ���� Ŭ����
	//�ʵ�, ������, getter / setter �θ� ����
	
	private String ano; //���¹�ȣ
	private String owner; //������
	private int balance; //�ܾ�
	
	public Account(String ano, String owner, int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}

	public String getAno() {
	
		return ano;
	}


	public void setBalance(int balance) {
		// TODO Auto-generated method stub
		this.balance= balance;
		
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void addBalance(int money) {
		balance+=money;
	}

	public void subBalance(int money) {
		balance-=money;
	}
	public String getOwner() {

		return owner;
	}

}
