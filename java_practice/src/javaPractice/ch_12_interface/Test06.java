package javaPractice.ch_12_interface;


interface Buy {
	void buy();

	default void order() {
		System.out.println("구매 주문");
	}
}
interface Sell{
	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
class Customer implements Buy, Sell{
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	//디폴트 메서드가 중복이 되었으니 두 인터페이스를 구현하는 Customer클래스에서 재정의 해야함
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
}
/*
 * 한 클래스가 여러 인터페이스르 구현하는 경우
 * 한 클래스가 여러 클래스를 상속 받으면 메서드 호출이 모호해지는 문제가 발생할 수 있음
 * 하지만 인터페이스는 한 클래스가 여러 인터페이스를 구현 할 수 있음
 * 인터페이스는 구현 코드나 멤버 변수를 가지지 않기 때문에 여러개를 동시에 구현할 수 있음
 * 두 인터페이스에 이름이 같은 메서드가 선언되었다고 해도 구현은 클래스에서 이루어지므로
 * 어떤메서드를 호출해야 하는지 모호하지 않은것
 * */
public class Test06 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		//Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형번환
		//buyer는 Buy 인터페이스의 메서드만 호출 가능
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); //고객 판매주문
		
		//Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입하여 형 변환
		//seller는 Sell 인터페이스의 메서드만 호출 가능
		Sell seller = (Sell)customer; //(Sell) 생략가능
		seller.sell();
		buyer.order(); //고객 판매 주문
		
		if(seller instanceof Customer) {
			//seller를 하위 클래스 형인 Customer로 다시 형 변환
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order(); //고객 판매 주문
	}
}
