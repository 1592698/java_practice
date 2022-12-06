package javaPractice.ch_15;

/*GennericTypeTest
 * 제너릭(Generic): 일반화, 범용화라는 의미로.
 * 클래스나 메서드에서 사용하느 필드나 매개변수의 자료형(클래스형)을 호출하는 쪽에서 지정핟록 하는 기능*/

class CommonData<T> { 
	//일반적인 방식으로는 클래스에서 미리 데이터 타입을 지정해야 하지만 제네릭을 사용하면 호출하는 쪽에서 데이터 타입을 지정
	private T data; //데이터 타입으로 T를 지정. Type의 약자. 클래스 선언에서 <>사이에 다른 문자를 넣어도 됨
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data= data;
	}
}
public class Test18 {

	public static void main(String[] args) {
		CommonData<String> stringCommonData = new CommonData<String>();
		//호출 하는 쪽에서 타입을 지정
		CommonData<Integer> integerCommonData = new CommonData<>();
		//선언하면서 타입을 지정하면 생성자에게는 타입을 생략 가능
		
		stringCommonData.setData("abc");
		integerCommonData.setData(100);
		System.out.println("StringCommonData : " + stringCommonData.getData());
		//StringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());
		//integerCommonData : 100
	}

}
