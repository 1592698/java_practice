package javaPractice.ch_14_test;

public class Cart {
	
	ShopProduct p;
	int productID, cnt;
	String productName;
	int price;
	
	Cart(int productID, int cnt){
	
		this.productID=productID; //상품 코드
		this.cnt=cnt; //구매개수
	}
	
	 Cart(int productID, int cnt, String productName) {
		
		p = new ShopProduct();
		this.productID=productID;
		this.cnt=cnt;
		this.productName=productName;  //상품이름
	}
	 
	 public String toString() {
		 
		return  "상품번호: "+ productID + ", 개수: " + cnt +", 상품이름: "+ p.products[productID-1].getProductName()
				+"\n개별 총 가격 : " + (cnt *p.products[productID-1].getPrice()) ;
	 }
	 
	 
}
