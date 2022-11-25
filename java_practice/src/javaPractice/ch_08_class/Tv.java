package javaPractice.ch_08_class;

public class Tv {

	//Tv 의 속성(멤버변수)
	String color; //속성
	boolean power; // 전원상태 on off
	int channel; //채널
	
	//Tv의 기능 (메소드)
	
	void power() {
		power = !power; //Tv를 켜거나 끄는 기능을 하는 메소드
	}
	void channelUp() { //Tv의 채널을 높이는 기능을 하는 메서드
		++channel; 
	}
	void channelDown() { //Tv의 채널을 낮추는 기능을 하는 메서드
		--channel;
	}
}
