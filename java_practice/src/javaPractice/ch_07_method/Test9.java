package javaPractice.ch_07_method;

import java.security.PublicKey;

public class Test9 {

	/*참조에 의한 호출 방식
	 * 매개변수의 타입이 참조형 타입일 때 사용
	 * 참조에 의한 호출은 메소드 호출 시 참조 데이터의 위치가 매개변수에 전달
	 * 
	 * 값에 의한 호출은 메모리에 동일한 값을 복사 후 사용
	 * 참조에 의한 호출은 메모리의 주소를 넘기기 때문에 값을 복사하지 않음
	 * */
	public void increase(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] refArray = {100,800,1000};
		Test9 ref = new Test9();
		
		System.out.println("메소드 호출 전");
		for(int i=0;i< refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);

			
		}
		

	
	}

}
