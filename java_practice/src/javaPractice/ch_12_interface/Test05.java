//package javaPractice.ch_12_interface;
//
//interface Buy {
//	void buy();
//	void info();
//}
//interface Sell{
//	void sell();
//	void info();
//}
//class Customer implements Buy, Sell{
//	@Override
//	public void sell() {
//		System.out.println("�Ǹ��ϱ�");
//	}
//	@Override
//	public void buy() {
//		System.out.println("�����ϱ�");
//	}
//
//	//�� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص�
//	//������ Ŭ�������� �̷�����Ƿ�, � �޼ҵ带 ȣ���ؾ��ϴ��� ��ȣ���� ����
//	@Override
//	public void info() {
//		System.out.println("Customer �Դϴ�");
//	}
//}
///*
// * �� Ŭ������ ���� �������̽��� �����ϴ� ���
// * �� Ŭ������ ���� Ŭ������ ��� ������ �޼��� ȣ���� ��ȣ������ ������ �߻��� �� ����
// * ������ �������̽��� �� Ŭ������ ���� �������̽��� ���� �� �� ����
// * �������̽��� ���� �ڵ峪 ��� ������ ������ �ʱ� ������ �������� ���ÿ� ������ �� ����
// * �� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷�����Ƿ�
// * ��޼��带 ȣ���ؾ� �ϴ��� ��ȣ���� ������
// * */
//public class Test05 {
//
//	public static void main(String[] args) {
//		Customer customer = new Customer();
//		
//		//Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� ����ȯ
//		//buyer�� Buy �������̽��� �޼��常 ȣ�� ����
//		Buy buyer = customer;
//		buyer.buy();
//		//buyer.sell();
//		
//		//Customer Ŭ�������� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ
//		//seller�� Sell �������̽��� �޼��常 ȣ�� ����
//		Sell seller = (Sell)customer; //(Sell) ��������
//		seller.sell();
//		//seller.buy();
//		
//		if(seller instanceof Customer) {
//			//seller�� ���� Ŭ���� ���� Customer�� �ٽ� �� ��ȯ
//			Customer customer2 = (Customer)seller;
//			customer2.buy();
//			customer2.sell();
//		}
//	}
//}
