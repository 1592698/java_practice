package javaPractice.ch_12_interface;


interface Buy {
	void buy();

	default void order() {
		System.out.println("���� �ֹ�");
	}
}
interface Sell{
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
class Customer implements Buy, Sell{
	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}
	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	//����Ʈ �޼��尡 �ߺ��� �Ǿ����� �� �������̽��� �����ϴ� CustomerŬ�������� ������ �ؾ���
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
}
/*
 * �� Ŭ������ ���� �������̽��� �����ϴ� ���
 * �� Ŭ������ ���� Ŭ������ ��� ������ �޼��� ȣ���� ��ȣ������ ������ �߻��� �� ����
 * ������ �������̽��� �� Ŭ������ ���� �������̽��� ���� �� �� ����
 * �������̽��� ���� �ڵ峪 ��� ������ ������ �ʱ� ������ �������� ���ÿ� ������ �� ����
 * �� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷�����Ƿ�
 * ��޼��带 ȣ���ؾ� �ϴ��� ��ȣ���� ������
 * */
public class Test06 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		//Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� ����ȯ
		//buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); //�� �Ǹ��ֹ�
		
		//Customer Ŭ�������� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ
		//seller�� Sell �������̽��� �޼��常 ȣ�� ����
		Sell seller = (Sell)customer; //(Sell) ��������
		seller.sell();
		buyer.order(); //�� �Ǹ� �ֹ�
		
		if(seller instanceof Customer) {
			//seller�� ���� Ŭ���� ���� Customer�� �ٽ� �� ��ȯ
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order(); //�� �Ǹ� �ֹ�
	}
}
