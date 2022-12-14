package book_db;

import java.util.Scanner;

public class BookView {
	public static void main(String[] args) {

		BookManager service = new BookManager();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("선택 : ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				service.registration();
				break;
			case 2:
				service.search();
				break;
			case 3:
				service.rental();
				break;
			case 4:
				service.bookReturn();
				break;
			case 5:
				System.out.println("==========책 목록 출력하기==========");
				System.out.println("책 코드\t책 제목\t작가이름\t책 개수");
				service.display();
				break;
			case 6:
				System.out.println("종료합니다");
				scanner.close();
				return;
			default:
				System.out.println("잘못 누르셨습니다. \n다시 선택해주세요");
				break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("=============Menu===============");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 책 대여");
		System.out.println("4. 책 반납");
		System.out.println("5. 책 전체출력");
		System.out.println("6. 프로그램종료");
		System.out.println();
	}
}


