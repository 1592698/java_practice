package javaPractice.ch_10_inheritance;

class Tv{
	boolean power; //전원상태(on/ off)
	int channel; //채널
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}

class CaptionTv extends Tv{
	boolean caption; //캡션 상태(on/ off)
	void displayCaption(String text) {
		if(caption) {//캡션 상태가 on(true)일 때만 text를 보여준다
			System.out.println(text);
		}
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; //조상 클래스로부터 상속받은 멤버
		ctv.channelUp(); //조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello world"); //boolean초기값은 false이기때문에 이 문장은 실행되지않음
		ctv.caption = true; //캡션 기능을 켠다
		ctv.displayCaption("Hello world"); //캡션을 화면에 보여준다 실행됨
	}
}
