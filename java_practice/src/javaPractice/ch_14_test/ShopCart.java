package javaPractice.ch_14_test;

import java.util.Scanner;
/*
 * 6. ShopCart Ŭ������ ���� ������ ��ǰ�ڵ带 �������� ��ǰ�� �����ϰ�, 
 * �߰��� ��ǰ�� ���� ������ �Է��� �޾�
"Y"�� �Է��ϸ� �߰��� ��ٱ��Ͽ� ��ǰ�� ���, 
"N"�� �Է��ϸ� ���ݱ��� ������ ��ǰ�� ��ǰ�ڵ�� ������ ����մϴ�.
(��ǰ �̸��� ������ ������� �ʽ��ϴ�.)
��ٱ��Ͽ� ���� ������ �ִ� ������ 10���Դϴ�. */

public class ShopCart {
	
	ShopProduct spc; 
	Cart[] carts = new Cart[10]; 
	int count=0;
	int productID; int cnt; int price;
	String productName;
	int sum=0;

	public void printCart() {
		for (int i = 0; i < carts.length; i++) {
	
			if(carts[i]!=null) {
				System.out.println(carts[i]);
				sum += cnt *spc.products[productID-1].getPrice();
			}
		}
		System.out.println("�� �ݾ� >>>>>>" + sum);
	}
	
		/*for(Cart cart:carts) {
			System.out.println(1);
			if(cart !=null) {
				System.out.println(cart);
			}
		}*/
//	private String findName(int productID) {
//		ShopProduct spr = new ShopProduct();
//		String productName=spr.products[productID-1].getProductName();
//		for(Product p : spr.products) {
//			if(productID == p.getProductID()) {
//				productName= p.getProductName();
//			}
//		}
//		return productName;
//	}
	public void selectProduct() {
		spc = new ShopProduct();
		while(true) {

		System.out.println("������ ��ȣ�� �Է��� �ֽʽÿ�.>>");
		Scanner scanner = new Scanner(System.in);
		productID = Integer.parseInt(scanner.nextLine());
		System.out.println("��ǰ�� ���� ������ �Է��� �ֽʽÿ�.>>");
		cnt = Integer.parseInt(scanner.nextLine());
		
//		String productName = findName(productID);
		
		//spc.products[productID-1].equals(null)
		
		//��ٱ��� ��ǰ �߰��� ���� ��ǰ ��ȣ�� �ִ� ��� ���Է� �޴� ��
		boolean ck=false;
		for (int i = 0; i < spc.products.length; i++) {
			if(spc.products[i].getProductID()==productID) {
				ck=true;
				carts[count]=new Cart(productID, cnt, productName); //�迭�� ��ǰ����
				count++; //�迭 index��ȣ ��
				 cnt++;
				break;
			}
			
		}
		if(!ck) {
			System.out.println("���� ��ǰ ��ȣ�Դϴ� �ٽ� �Է����ּ���.");
			continue;
		}
		else {
		System.out.println("�������� ��ǰ�� �� ���� �Ͻðڽ��ϱ�?");
		System.out.println("�� ���Ÿ� ���Ͻø� Y, �׸� �����ϽǷ��� N�� �Է��� �ֽʽÿ�.>>>");
		String bb =scanner.nextLine();
		
			if(bb.equals("Y")) {
				continue; //Y��� while�� ����
			}
			else if(bb.equals("N")){ //N��� while�� �극��ũ
				break;
			}
		}
//			if(spc.products[productID-1].getPrice()==productID) {
//			++cnt;
//		}
		}
	}
	
	

}
