package javaPractice.ch_12_interface_shoppingmall;


//Product 클래스를 상속받는 클래스로, 스마트TV의 제품 정보를 등록하는 데 필요
public class SmartTv extends Product{
	String resolution; //해상도
	
	public SmartTv(String pname, int price, String resolution, int inch, String productCode) {
		//생성자로, 상품이름과 가격, 해상도 정보를 받아서 처리
		
		
		
		this.pname = pname;
		this.price=price;
		this.resolution=resolution;
		this.inch=inch; //inch수 추가
		this.productCode=productCode;
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		//추상 클래스에 정의된 추상 메서드를 오버라이딩
		//추가 정보인 해상도 정보를 출력
		
		System.out.print(" 해상도: " +resolution +",");
		System.out.print(" 인치: " +inch +","); //인치수 추가코드
		System.out.println(" 제품 코드: " + productCode);
		
	}
	

}
