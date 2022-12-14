package book_db;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	private ArrayList<Book> list;
	private Scanner scanner;
	private BookDAO bookDAO;
	
	public BookManager() {
		bookDAO= new BookDAO();
		list = new ArrayList<Book>();
		scanner = new Scanner(System.in);
	}
	
//	//디비 관련 시작
//	public void disConnect() {
//		bookDAO.disConnect();
//	}
	
	public ArrayList<Book> getList() {
		return list;
	}
	
	public void setList(ArrayList<Book> list) {
		this.list = list;
	}

	//해당 책찾기
	private Book findBookTraverse(int code) {
		for(Book book : list) {
			if(bookDAO.isBook(code)) { //동일한 책이 있다면
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
		
			System.out.print("책 코드 : ");
			book.setCode(scanner.nextInt());

			System.out.print("책 제목 : ");
			book.setName(scanner.next());
			
			System.out.print("작가 이름 : ");
			book.setAutor(scanner.next());
			
			System.out.print("책 재고 숫자 : ");
			book.setCnt(scanner.nextInt());
			
//			 list.add(book);
			 
			if(bookDAO.insertBook(book)) {
			 System.out.println("책이 등록되었습니다.");
			}
			else {
				System.out.println("책 등록에 실패했습니다.");
			}
	}
	//책 검색
	 public void search() {
		
		System.out.println("검색할 책의 제목을 입력해주세요");
		System.out.print("제목 : ");
		String name = scanner.next();

		  // 해당 책 찾기
	      ArrayList<Book> searchlist = new ArrayList<>();
	      searchlist = bookDAO.searchBook(name);

	      if(searchlist.size() < 1) {
	          System.out.println("검색된 책이 없습니다.");
	       }
	       else {
	          System.out.println("검색된 책의 정보입니다.");
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
		if(bookDAO.isBook(code)) {
			  Book book = bookDAO.selectOne(code);
				if(book.getCnt() < a) {
		               System.out.println("재고가 1권이라서 대여할 수 없습니다.");
		         }
				else {
					bookDAO.updateBook(code, a, false);
					book.setCnt(book.getCnt()-a);
					System.out.println(a + "권이 대여되었습니다.");
				}
				return;
		}
		   accountErr();
	}
	
	//책 반납
	public void bookReturn() {
		int code = bookInput();
		System.out.print("책 반납 개수 : ");
	    int a = scanner.nextInt(); //반납할 책 개수

	    ArrayList<Book>list = bookDAO.selectAll();
   //해당 책 찾기
      for (Book book : list) {
         if(bookDAO.isBook(code)) {   //동일한 계좌가 있으면
        	 book.setCnt(a + book.getCnt());
            System.out.println(a + "권을 반납했습니다.");
            return;
         }
      }
      accountErr();
   }

//책 전체 출력
	public void display() {  //출력
		
		ArrayList<Book> list = bookDAO.selectAll();
		
		for(Book book : list) {
//			System.out.println(book.getCode() + "\t" + book.getName()+"\t" + book.getAutor()+"\t"+ book.getCnt());
		System.out.println(book);
		}
	}

}
