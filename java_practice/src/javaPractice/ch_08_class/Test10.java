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
		// isPowerOn�� ���� true�� false��, false�� true �� ����
		isPowerOn =!isPowerOn;
	}
	void volumeUp() {
		// volume�� ���� MAX_VOLUME���� ���� ��쿡�� 1�� ����

		
		volume = (MAX_VOLUME > volume)? volume +1 : volume; 
	}
	void volumeDown() {
		// volume�� ���� MIN_VOLUME���� ���� ��쿡�� 1�� ����

		volume = (MIN_VOLUME < volume)? volume -1 : volume; 	
	}
	void channelUp() {
		//channel�� ���� 1����
		//MAX_CHANNEL ���� �ö󰥼� ����

		channel = (MAX_CHANNEL == channel) ?  MAX_CHANNEL : channel +1;
	}
	void channelDown() {
		//channel�� ���� 1����
		//MIN_CHANNEL ���� �������� ����

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
