package javaPractice.ch_12_interface_shoppingmall;


//���θ��� �����ϱ� ���� ��ó ���α׷�, IShop�������̽��� �����ϴ� �ٸ� ���θ� Ŭ������ 
public class ShopLauncher {

	//���α׷� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
