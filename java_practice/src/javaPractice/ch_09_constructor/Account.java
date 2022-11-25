package javaPractice.ch_09_constructor;

public class Account {

	//계좌 정보를 저장하기 위한 클래스
	//필드, 생성자, getter / setter 로만 구성
	
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //잔액
	
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
