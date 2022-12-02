package javaPractice.ch_14_exeption;

class Book {
	int bookNumber; //책번호
	String bookTitle; //제목
	
	Book(int bookNumber, String bookTitle){ //책 번호와 제목을 매개변수로 입력받는 생성자
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	//toString() 메서드를 직접 재정의 하면 객체의 참조 변수를 이용해 원하는 문자열을 표현
	//
	@Override
	public String toString() { //toString() 메서드 재정의
		return bookTitle + "," +bookNumber;
	}
}
public class Test19 {
	//Object 클래스의 toString()메서드 이용하기
	public static void main(String[] args) {

		Book book1 = new Book(200, "개미");
		
		//String toString() : 객체를 문자열로 표현하여 반환. 재정의하여 객체에 대한 설명이나 특정 멤버 변수를 반환
		System.out.println(book1); //인스턴스 정보(클래스 이름, 주소 값)
		System.out.println(book1.toString()); //toString메서드로 인스턴스 정보(클래스 이름, 주소 값)을 보여줌
	}
}
