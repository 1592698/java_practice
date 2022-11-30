package javaPractice.ch_12_interface;


interface Player{ //플레이어 인터페이스
	void play(); //재생
	void stop(); //정지
}

class VideoPlayer implements Player { //비디오 플레이어
	private int id; //제조 번호
	private static int count = 0; //현재까지 할당된 제조번호
	
	public VideoPlayer() { //생성자
		id = ++count;
	}

	@Override
	public void play() { //재생
		// TODO Auto-generated method stub
		System.out.println("비디오 재생시작!");
	}

	@Override
	public void stop() { //정지
		// TODO Auto-generated method stub
		System.out.println("비디오 재생종료!");
	}
	
	public void printInfo() { //제조번호 표시
		System.out.println("이 기계의 제조 번호는 ["+ id + "]입니다.");
	}
	
}
class CDPlayer implements Player { //CD플레이어

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD 재생시작!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD 재생종료");
	}
	
	public void cleaning() { //헤드 청소
		System.out.println("헤드를 청소했습니다.");
	}
	
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player[] a = new Player[2]; //인터페이스를 데이터 타입으로 하는 배열 생성
		a[0] = new VideoPlayer(); //비디오 플레이어
		a[1] = new CDPlayer(); //CD플레이어
		
		for(Player p:a) { //a가 가진 개수만큼 반복
			p.play(); //재생
			p.stop(); //정지
			System.out.println();
		}
		
		VideoPlayer[] b = new VideoPlayer[4];
		for(int i=0; i<b.length; i++) {
			b[i]=new VideoPlayer();
		}
		b[b.length -1].printInfo(); //이 기계의 제조번호는 [?]입니다.
	}

}

