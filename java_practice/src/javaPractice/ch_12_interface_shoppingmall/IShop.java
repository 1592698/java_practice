package javaPractice.ch_12_interface_shoppingmall;

//쇼핑몰 규격을 정의한 인터페이스, 모든 쇼핑몰은 IShop 인터페이스를 구현해야함
public interface IShop {
	//쇼핑몰 클래스를 구현 할 때 구현해야하는 추상 메서드
	
	public abstract void setTitle(String title); //쇼핑몰 제목(이름)을 설정
	public abstract void genUser(); // 쇼핑몰을 이용 할 수 있는 예제 사용자들을 생성
	public abstract void genProduct(); //쇼핑몰을 예제 상품을 생성
	public abstract void start(); //쇼핑몰 프로그램을 실행하는 시작 메서드
	

	
	}

