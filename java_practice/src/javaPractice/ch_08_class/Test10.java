package javaPractice.ch_08_class;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void turnOnOff() {
		// isPowerOn의 값을 true를 false로, false를 true 로 변경
		isPowerOn =!isPowerOn;
	}
	void volumeUp() {
		// volume의 값을 MAX_VOLUME보다 낮을 경우에는 1을 증가

		
		volume = (MAX_VOLUME > volume)? volume +1 : volume; 
	}
	void volumeDown() {
		// volume의 값을 MIN_VOLUME보다 높을 경우에는 1을 감소

		volume = (MIN_VOLUME < volume)? volume -1 : volume; 	
	}
	void channelUp() {
		//channel의 값을 1증가
		//MAX_CHANNEL 보다 올라갈수 없음

		channel = (MAX_CHANNEL == channel) ?  MAX_CHANNEL : channel +1;
	}
	void channelDown() {
		//channel의 값을 1감소
		//MIN_CHANNEL 보다 내려갈수 없음

		channel = (MIN_CHANNEL == channel) ?  MIN_CHANNEL : channel -1;
	}
}
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: " + t.channel + ", vol: "+t.volume); //CH: 100, vol:0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH: " + t.channel + ", vol: "+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: " + t.channel + ", vol: "+t.volume);
	}

}
