package javaPractice.ch_09_constructor;

public class ShopService_test1 {

	public static void main(String[] args) {
		
		/*ShopService ��ü�� �̱������� ������� �Ѵ�
		 * ShopService�� getInstance() �޼���� �̱����� ���� �� �ֵ���
		 * ShopService Ŭ������ �ۼ��϶�*/
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�");
		} else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�");
		}
		
	}
}




