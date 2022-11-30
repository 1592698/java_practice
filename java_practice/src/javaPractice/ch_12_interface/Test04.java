package javaPractice.ch_12_interface;

interface Calc { //인터페이스 만들기
	
	//인터페이스에서 선언된 변수는 컴파일 과정에서 상수료 변환됨
	double PI =3.14;
	int ERROR=-999999999;
	
	//인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨
	
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

	//default 안에 공통된 코드가 있으면 메서드화 시킴 
	//인터페이스에 디폴트 메서드 구현
	default void description() {//인터페이스에 있지만 구현해야지 쓸 수 있음
		//디폴트를 뺴면 public이 됨 
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
	//정적 메서드 구현
	//인터페이스로 구현안해도 사용가능
	static int total(int[]arr) { 
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	//구현한 코드에서 private코드 못씀 (상속받은 클래스에서)
	//static이나 default에서만 쓸수있음
	private void myMethod() { //디폴트 메소드에서 사용
		System.out.println("private 메서드 입니다");

	}
	
	//private 메서드는 코드를 모두 구현해야 하므로 추상메서드에는 private예약어를 사용할 수 없음
	//static 예약어는 함께 사용가능
	private static void myStaticMethod() { //정적 메서드에서 사용
		System.out.println("private static 메서드 입니다");
	}
}

abstract class Calculator implements Calc{
	//인터페이스를 구현한 추상클래스
	//추상클래스의 경우 인터페이스의 모든 추상 메서드를 구현하지 않아도됨
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substact(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
}

class CompleteCalc extends Calculator{
	//인터페이스를 구현한 추상클래스를 상속받은 일반 클래스
	//추상클래스에서 add(), substact()을 구현했으니 times(), divide()만 구현하면됨
		
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2!=0) 
			return num1/num2;
		else {
			return CompleteCalc.ERROR; //어떤 수를 0으로 나누는 경우에 오류를 반환
		}
	}	
		public void showInfo() { //completeCalc에서 추가로 정의 한 메서드
			System.out.println("Calc 인터페이스를 구현하였습니다");
		}
}

public class Test04 {
	public static void main(String[] args) {
		int num1= 10;
		int num2=5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}
}
	
