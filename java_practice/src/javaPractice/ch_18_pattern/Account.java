package javaPractice.ch_18_pattern;

/*DTO(data transfer object), VO(value object)
 * ������ ���� ���� �ʴ� ������ ������ ��ü�̸� �Ӽ��� �� �Ӽ��� �����ϱ� ����
 * getter, setter �޼ҵ常 ���� Ŭ����*/
public class Account {

	private int id; //����
	private String name; //�̸�
	private long balance; //�ܾ�
	
	public Account() {
	}

	public Account(int id, String name, long balance) {
		this.id=id;
		this.name = name;
		this.balance=balance;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}