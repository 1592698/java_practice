package javaPractice.ch_13_class;

/*로컬 내부 클래스의 정의
 * 외부 클래스의 메서드 내에서 정의된 클래스
 * 메서드 호출 시 생성되고 복귀하면 소멸
 * 
 
 * -> 매서드의 지역변수는 스택메모리에서 실행되므로 호출 후 복귀하면 소멸
 * 하지만 지역내부 클래스의 객체는 힙에서 실행이 되므로 메서드가 호출이 끝나고 복귀하더라도 살아있음
 * 로컬 내부 클래스는 프로그래밍에서 거의 사용하지 않음. 이런 내부 클래스가 있다는 정도만 알아두는 정도*/

class OutClass_03{
	/**/
	//Runnable 인터페이스를 구현하는 클래스를 지역 내부 클래스로 만든 예제
	
	int outNum =100;
	static int sNum =200;
	
	Runnable getRunnable(int i) { //반환형이 Runnable인 메서드
		int num =100;
		/* Runnable 인터페이스는 자바에서 스레드를 만들 때 사용하는 인터페이스로 java.lang 패키지에 선언되어 있으며 
		 * 반드시 run()메서드를 구현해야함*/
	
		class MyRunnable implements Runnable{
			int localNum =10;

			@Override
			public void run() {
				/* 지역 내부 클래스가 선언된 메서드의 지역변수는 사용하지 못함 */
				//num =200; //에러 남 지역변수는 상수로 바뀜. 값은 변경은 못해도 보는 것은 가능
				//메서드에 선언되있어서 메서드가 실행하고 나면 사라짐
				//i =100; //에러 남 매개변수 역시 지역변수처럼 상수로 바뀜. 값은 변경은 못해도 보는 것은 가능
				System.out.println("i = " + i); //값은 변경은 못해도 보는 것은 가능
				System.out.println("num = " + num); //값은 변경은 못해도 보는 것은 가능
				System.out.println("localNum = " + localNum); //같은공간이라서 ㄱㅊ
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + OutClass_03.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass_03 out = new OutClass_03();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
