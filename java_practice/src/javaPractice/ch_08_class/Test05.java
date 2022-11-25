package javaPractice.ch_08_class;


public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t; //TV 인스턴스를 참조하기 위한 변수 t를 선언
		
		t = new Tv(); 
		t.channel =7; 
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다"); 
	}

}
