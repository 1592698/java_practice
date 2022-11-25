package javaPractice.ch_09_constructor;

public class Test10 {
	/*
	 * 다른 생성자
	 * 노래 한 곡을 나타내는 클래스 Song을 작성하라
	 * this()를 사용하라
	 * Song 클래스는 다음과 같이 정의 된다
	 * # 필드
	 * title : 노래의 제목
	 * artist : 가수
	 * length : 곡의길이(단위: 초) */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song song1 = new Song("Outward Bound", "Nana", 100);
		Song song2 = new Song("Jambalya", "Carpenters");
		Song song3 = new Song("Yesterday");
		Song song4 = new Song();
		
		System.out.println(song1); //Song[title = 'Outward Bound'
		System.out.println(song2);
		System.out.println(song3);
		System.out.println(song4);
	}

}
class Song{

	private String title;
	private String artist;
	private int length;
	

	public Song() {
	
	}
	public Song(String title) {
	
		this.title=title;
	}
	public Song(String title, String artist) {

		this.title=title; //this(title); 해도됨 이미 title 선언해놔서
		this.artist=artist;
	}
	public Song(String title, String artist, int length) {
		
		this.title=title;
		this.artist=artist;
		this.length=length;
		//this(title, artist);해도됨
	}

	public String toString() {
		return "Song-title = " + title + ", artist = " +artist + ", length = " + length;
	}
}
//똑같은 함수 있으면 오버라이딩 반환값 없음 return필요없음
//