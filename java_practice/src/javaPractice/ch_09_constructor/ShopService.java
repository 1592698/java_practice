package javaPractice.ch_09_constructor;

public class ShopService {


	private static ShopService shopService = null;
	
	ShopService(){
		
	}
	static ShopService getInstance() {
		if(shopService==null) {
			shopService=new ShopService();
		}
		return shopService;
	}

}
