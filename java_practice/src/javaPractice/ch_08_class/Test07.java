package javaPractice.ch_08_class;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("b의 값 : " +b); //20
		
		//참조 변수의 복사
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다");
		//t1.toString()값은 javaPractice.ch_08_class.Tv@50d0686입니다
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다");
		//t2.toString()값은 javaPractice.ch_08_class.Tv@7a3d45bd입니다
		System.out.println("t1의 channel값은 " + t1.channel + "입니다"); //0
		System.out.println("t2의 channel값은 " + t2.channel + "입니다"); //0
		System.out.println();
		
		t1.channel = 7;
		System.out.println("t1의 channel1값을 7로 변경했습니다");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다"); //7
		System.out.println("t2의 channel값은 " + t2.channel + "입니다"); //0
		System.out.println();
		
		t1=t2; //t1이 저장한 주소값을 t2에 저장. 참조 변수라서 동일한 주소를 가르킴
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다");
		//t1.toString()값은 javaPractice.ch_08_class.Tv@7a3d45bd입니다
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다");
		//t2.toString()값은 javaPractice.ch_08_class.Tv@7a3d45bd입니다
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다"); //0
		System.out.println("t2의 channel값은 " + t2.channel + "입니다"); //0
		System.out.println();
		
		t1.channel =27;
		System.out.println("t1의 channel1값을 27로 변경했습니다");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다"); //27
		System.out.println("t2의 channel값은 " + t2.channel + "입니다"); //27
	}

}
