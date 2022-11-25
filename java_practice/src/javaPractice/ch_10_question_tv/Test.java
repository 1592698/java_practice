package javaPractice.ch_10_question_tv;

import java.util.ArrayList;

public class Test {


	int money = 1000; //�����ݾ�
	int bonusPoint = 0; // ���ʽ� ����

	// ȯ�� ����� �߰��ϱ� ���� �迭 ArrayList�� ����Ǵ� ������ Ÿ�� ����
	ArrayList item = new ArrayList(); //������ ��ǰ�� �����ϴµ� ���� ArrayList ��ü
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����ؼ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		
		// ȯ�� ����� �߰��ϱ� ���� �迭 ArrayList�� ����Ǵ� ������ Ÿ�� ����
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p) { // ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) { // ��ǰ�� ArrayList���� �����Ѵ�.
			money +=p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+ "��/�� ��ǰ�ϼ̽��ϴ�");
		}
		else { //���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�");
		}
	}
	
	// �߰��� ��ǰ ���� ��� �޼ҵ�
	void summary() { // ������ ��ǰ�� ���� ������ ����ؼ� ������
		int sum= 0;
		String itemList ="";
		
		if(item.isEmpty()) {// Vector�� ����ִ��� Ȯ����
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		// Vector�� i��°�� �ִ� ��ü�� ����
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum+=p.price;
			itemList +=(i==0) ? "" + p: "," + p;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�� ���Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}

}
