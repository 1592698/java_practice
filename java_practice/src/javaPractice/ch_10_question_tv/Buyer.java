package javaPractice.ch_10_question_tv;

public class Buyer { //��, ������ ��� ���
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ� ����

	/*����
	 * ������ ��ǰ�� �����ϴ� ��� �߰�
	 * ������ ��ǰ�� ���� ������ ����ؼ� �����ִ� ��� �߰�*/
	
	//�߰� �ڵ� ����
	Product[] item = new Product[10]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i=0; //Product�迭�� ���� ī����
	
	
	
	void buy(Product p) { //�θ� Ŭ���� Ÿ������ �Ű����� ����
		//�θ� Ŭ������ �ʵ� ���, price, bonusPoint
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
		return;
		}
		money -=p.price; //���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint;  //��ǰ�� ���ʽ� ������ �߰��Ѵ�
		item[i++] = p; //�߰��ڵ�		
		System.out.println(p+"��/�� �����ϼ̽��ϴ�");
	}
	
	
	void summary() { //������ ��ǰ�� ���� ������ ����ؼ� �����ش�
		int sum =0; //������ ��ǰ�� �����հ�
		String itemList = ""; //������ ��ǰ���
//��� 1	
//		for(int i=0; i<item.length; i++) {
//			if(item[i]==null) 
//				break;
//			
//				sum +=item[i].price;
//				itemList+=(item[i]+ ", ");			
//		}
//��� 2		
//		for(Product p : item) {
//			if(p == null) {
//				break;
//			}
//				sum +=p.price;
//				itemList += p + ", ";
//		}
//��� 3
		for(int i=0; i<this.i; i++) {
			sum +=item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
