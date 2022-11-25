package javaPractice.ch_09_constructor;

public class Test10 {
	/*
	 * �ٸ� ������
	 * �뷡 �� ���� ��Ÿ���� Ŭ���� Song�� �ۼ��϶�
	 * this()�� ����϶�
	 * Song Ŭ������ ������ ���� ���� �ȴ�
	 * # �ʵ�
	 * title : �뷡�� ����
	 * artist : ����
	 * length : ���Ǳ���(����: ��) */
	

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

		this.title=title; //this(title); �ص��� �̹� title �����س���
		this.artist=artist;
	}
	public Song(String title, String artist, int length) {
		
		this.title=title;
		this.artist=artist;
		this.length=length;
		//this(title, artist);�ص���
	}

	public String toString() {
		return "Song-title = " + title + ", artist = " +artist + ", length = " + length;
	}
}
//�Ȱ��� �Լ� ������ �������̵� ��ȯ�� ���� return�ʿ����
//