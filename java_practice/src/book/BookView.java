package book;

import java.util.ArrayList;
import java.util.Scanner;

class BookRentalService {

	Scanner scanner = new Scanner(System.in);
	private ArrayList<Book> list;
	
	public BookRentalService() {
		list = new ArrayList<Book>();
		scanner = new Scanner(System.in);
	}
	
	//해당 책찾기
	private Book findBookTraverse(int code) {
		for(Book book : list) {
			if(book.getCode()==code) { //동일한 계좌가 있다면
				return book;
			}
		}
		return null;
	}
	
	private Book findBook(int code) { 
		//대여, 반납 책 찾는거
		Book book =findBookTraverse(code);
		if(book == null) {
			System.out.println("책을 찾을 수 없습니다");
		}
		return book;
	}

	private boolean isBook(int code) {
		//계좌 중복조회이기때문에 account을 리턴하지 말고 bool값을 리턴
		return (findBookTraverse(code)==null) ? false: true;
	}
	
	//책 조회 
	   private int bookInput() {
	      System.out.print("책 코드 : ");
	      int code = scanner.nextInt();
	      return code;
	   }
	
	   //책 없음 메시지   
	   public void accountErr() {
	      System.out.println("해당 책이 존재하지 않습니다.");
	   }

	   public void accountInfo() { //출력
		   System.out.println(list.toString()+"\t");
	   }
	   
	//책 등록
	public void registration() {
		Book book = new Book();
		
		int code = bookInput();
		if(isBook(code)) {
			System.out.println("책 코드 중복 (존재합니다)");
		}
		else {
			book.setCode(code);

			System.out.print("책 제목 : ");
			book.setName(scanner.next());
			
			System.out.print("작가 이름 : ");
			book.setAutor(scanner.next());
			
			System.out.print("책 재고 숫자 : ");
			book.setCnt(scanner.nextInt());
			
			 list.add(book);
			 
			 System.out.println("책이 등록되었습니다.");
			 System.out.println(list.toString()+ "\t");
		}
	}
	
	//책 검색
	 public void search() {
		
		System.out.println("검색할 책의 제목을 입력해주세요");
		System.out.print("제목 : ");
		String name = scanner.next();
		
		ArrayList<Book> searchlist = new ArrayList<>();
		
		for(Book book : list) {
			if(book.getName().contains(name)) {
				searchlist.add(book);
			}
		}
		if(searchlist.size()<1) {
			System.out.println("검색된 책이 없습니다");
		}
		else {
			System.out.println("검색한 책의 정보는 아래와 같습니다.");
			for(Book book : searchlist) {
				System.out.println(book);
			}
		}
	}
	
	//책 대여
	public void rental() {
		int code = bookInput();
		
		System.out.println("책 대여 권수 : ");
		int a = scanner.nextInt(); //대여할 책 개수
		
		//해당 책 찾기
		for(Book book : list) {
			if(book.getCode()==code) {
				if(book.getCnt() < a) {
		               System.out.println("재고가 1권이라서 대여할 수 없습니다.");
		         }
				else {
					book.setCnt(book.getCnt()-a);
					System.out.println(a + "권이 대여되었습니다.");
				}
				return;
			}
		}
		   accountErr();
	}
	
	//책 반납
	public void bookReturn() {
		int code = bookInput();
		System.out.print("책 반납 개수 : ");
	    int a = scanner.nextInt(); //반납할 책 개수

   //해당 책 찾기
      for (Book book : list) {
         if(book.getCode()==code) {   //동일한 계좌가 있으면
        	 book.setCnt(a + book.getCnt());
            System.out.println(a + "권을 반납했습니다.");
            return;
         }
      }
      accountErr();
   }

//책 전체 출력
	public void display() {  //출력
		for(Book book : list) {
			System.out.println(book.getCode() + "\t" + book.getName()+"\t" + book.getAutor()+"\t"+ book.getCnt());
		}
	}
}
public class BookView {
	public static void main(String[] args) {

		BookRentalService service = new BookRentalService();
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


