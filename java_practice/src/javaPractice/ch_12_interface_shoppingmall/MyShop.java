package javaPractice.ch_12_interface_shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

//IShop �������̽��� ������ MyShopŬ����
public class MyShop implements IShop {
	//��� ȸ�� ���� �迭
	User[] users= new User[2];
	
	//��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	
	//��ǰ �߰��� ���� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//Ű���� �Է����� ���ڿ� �Է¹ޱ� ���� Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	
	//���õ� ����� index����
	int selUser;

	//���θ� �̸�
	String title;
	@Override
	public void setTitle(String title) { //���θ�����(�̸�) ����
		this.title =title;
	}
	/*
	 *���α׷����� ����ϱ� ���� ���� ����� ��� �޼��� */
	@Override
	public void genUser() {
		
//		User user = new User("ȫ�浿", PayType.CARD);
//		users[0] = user;
//		user = new User("���ΰ�", PayType.CASH);
//		users[1]=user;
		
		PayType[] payTypes = {PayType.CASH,PayType.CARD};
		System.out.print("����� �̸��� �Է����ּ��� : ");
			
		String userName = scan.next();
		System.out.print("���� ������ ������ �ּ���. CASH(0), CARD(1)");
		int payTypeInt = scan.nextInt();
		
		User user = new User(userName, payTypes[payTypeInt]);
		users[0]=user;
				
	}
	
	/*���α׷����� ����ϱ� ���� ���� ��ǰ ��� �޼���*/
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone("������ ��Ʈ5",1000000, "SKT", "samsung","a123");
		products[0] = cellPhone;
		cellPhone = new CellPhone("���� ������7", 9800000, "KT","apple","b333");
		products[1] = cellPhone;
		SmartTv smartTv = new SmartTv("�Ｚ 3D Smart TV", 5000000, "4K",100, "c555");
		products[2] = smartTv;
		smartTv = new SmartTv("LG Smart TV", 2500000, "Full HD",80,"d663");
		products[3] = smartTv;
	}

	/*���α׷� ���� ���� �޼���*/
	@Override
	public void start() {
		System.out.println(title + ": ����ȭ�� - ��������");
		System.out.println("=============================");
		
		int i=0;
		
		//��ϵ� ����� ���� ���
		for(User user:users) {
//			System.out.println("[" + i++ + "]" + user.getName()+"(" + user.getPayType() +")" );
//
		if(user!=null) {
			System.out.println("[" + i++ + "]" + user.getName()+"(" + user.getPayType() +")" );
			}
	
		}
		
		System.out.println("[x] �� ��");
		System.out.print("���� : ");
		String sel = scan.next();
		System.out.println("## "+ sel +"���� ##");
		
		//���õ� �޴��� ���� ó��
		switch(sel) {
		case "x":
			System.exit(0);
			break;
		default:
			selUser=Integer.parseInt(sel);
			productList();
		}
	}

	private void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("=============================");
		int i=0;
		
		//��ϵ� ��ǰ ���� ���
		for(Product product: products) {
			System.out.println("[" + i + "]");
			product.printDetail();
			i++;
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("��ǰ��ȣ ���� : ");
		String sel = scan.next();
		System.out.println("## " + sel + "���� ##");
		
		//���õ� �޴��� ���� ó��
		switch(sel) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
	}
	/* ���� ������ ���� üũ�ƿ� ó�� �޼���*/
	private void checkOut() {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("=========================");
		int total=0;
		int i=0;
		
		//��ٱ��Ͽ� ��ϵ� ��ǰ ���� ���
		for(Product p: cart) {

			System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
			total =total + p.price;
		
		}
		
		/*1.�迭 */
	
		System.out.println("==========================");
		
		//������ ������� ���� ������
		System.out.println("���� ��� : " +users[selUser].getPayType());
		
		//�հ����
		System.out.println("�հ� : "+ total + "�� �Դϴ�.");
		
		System.out.println("[p]����, [q]���� �Ϸ�");
		System.out.print("���� : ");
		String sel = scan.next();
		
		//���õ� �޴��� ���� ó��
		switch(sel) {
		case "q" : System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ� ##");
			System.exit(0);
			break;
		default: checkOut();
		}
	}
}