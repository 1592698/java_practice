package javaPractice.ch_08_class;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channe1값은 " + t1.channel + "입니다"); //0
		System.out.println("t2의 channe2값은 " + t2.channel + "입니다"); //0
		
		t1.channel =7;
		System.out.println("t1의 channe1값을 7로 변경하였음");
		
		System.out.println("t1의 channe1값은 " + t1.channel + "입니다"); //7
		System.out.println("t2의 channe1값은 " + t2.channel + "입니다"); //0
		
		
	}

}
