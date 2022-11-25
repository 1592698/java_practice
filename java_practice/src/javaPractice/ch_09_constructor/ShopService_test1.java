package javaPractice.ch_09_constructor;

public class ShopService_test1 {

	public static void main(String[] args) {
		
		/*ShopService 객체를 싱글톤으로 만들려고 한다
		 * ShopService의 getInstance() 메서드로 싱글턴을 얻을 수 있도록
		 * ShopService 클래스를 작성하라*/
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다");
		} else {
			System.out.println("다른 ShopService 객체 입니다");
		}
		
	}
}




