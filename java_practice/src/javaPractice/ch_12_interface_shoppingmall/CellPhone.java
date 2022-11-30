package javaPractice.ch_12_interface_shoppingmall;

//Product 추상 클래스를 상속받아 구현한 CellPhone 클래스
public class CellPhone extends Product {
	String carrier;
	
	public CellPhone(String pname, int price, String carrier, String brand, String productCode) {
		this.pname=pname;
		this.price=price;
		this.carrier=carrier;
		this.brand = brand; //제조사 추가 코드
		this.productCode=productCode;
	}

	@Override
	public void printExtra() {
		System.out.print("통신사: "+carrier +",");
		System.out.print(" 제조사: "+brand +",");
		System.out.println(" 제품 코드: " + productCode);
	}
	
}
