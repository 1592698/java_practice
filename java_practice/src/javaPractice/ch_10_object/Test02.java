package javaPractice.ch_10_object;


/*static 제어자는 변수나 메서드 앞에 붙어서 이 멤버가 클래스 멤버라는 것을 의미
 * 클래스 멤버는 처음 클래스가 메모리에 로드 될 때 생성되기 때문에 인스턴스를 생성하지 않아도 사용가능*/


class StaticPractice{
	public static int number = 3;
	
	public static void say() {
		System.out.println("인스턴스 생성 없이 사용 가능합니다");
	
}
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StaticPractice.number);
		StaticPractice.say();
	}

}
