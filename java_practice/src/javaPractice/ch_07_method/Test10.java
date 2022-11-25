package javaPractice.ch_07_method;

public class Test10 {

	public void setAddress(String addr) {
		addr = "경기도 수원시 장안구";	
	}
	public static void main(String[] args) {

		String address = "서울시 강남구 논현동";
		
		Test10 st = new Test10();
		System.out.println("메소드 호출 전");
		System.out.println("address: " + address); //address: 서울시 강남구 논현동
		
		st.setAddress(address);
		
		System.out.println("메소드 호출 후");
		System.out.println("address: " + address); //address: 서울시 강남구 논현동
	}

}
