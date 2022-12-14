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
	
//	//��� ���� ����
//	public void disConnect() {
//		bookDAO.disConnect();
//	}
	
	public ArrayList<Book> getList() {
		return list;
	}
	
	public void setList(ArrayList<Book> list) {
		this.list = list;
	}

	//�ش� åã��
	private Book findBookTraverse(int code) {
		for(Book book : list) {
			if(bookDAO.isBook(code)) { //������ å�� �ִٸ�
				return book;
			}
		}
		return null;
	}
	

	private Book findBook(int code) { 
		//�뿩, �ݳ� å ã�°�
		Book book =findBookTraverse(code);
		if(book == null) {
			System.out.println("å�� ã�� �� �����ϴ�");
		}
		return book;
	}

	private boolean isBook(int code) {
		//���� �ߺ���ȸ�̱⶧���� account�� �������� ���� bool���� ����
		return (findBookTraverse(code)==null) ? false: true;
	}
	
	//å ��ȸ 
	   private int bookInput() {
	      System.out.print("å �ڵ� : ");
	      int code = scanner.nextInt();
	      return code;
	   }
	
	   //å ���� �޽���   
	   public void accountErr() {
	      System.out.println("�ش� å�� �������� �ʽ��ϴ�.");
	   }

	   public void accountInfo() { //���
		   System.out.println(list.toString()+"\t");
	   }
	   
	//å ���
	public void registration() {
		Book book = new Book();
		
			System.out.print("å �ڵ� : ");
			book.setCode(scanner.nextInt());

			System.out.print("å ���� : ");
			book.setName(scanner.next());
			
			System.out.print("�۰� �̸� : ");
			book.setAutor(scanner.next());
			
			System.out.print("å ��� ���� : ");
			book.setCnt(scanner.nextInt());
			
//			 list.add(book);
			 
			if(bookDAO.insertBook(book)) {
			 System.out.println("å�� ��ϵǾ����ϴ�.");
			}
			else {
				System.out.println("å ��Ͽ� �����߽��ϴ�.");
			}
	}
	//å �˻�
	 public void search() {
		
		System.out.println("�˻��� å�� ������ �Է����ּ���");
		System.out.print("���� : ");
		String name = scanner.next();

		  // �ش� å ã��
	      ArrayList<Book> searchlist = new ArrayList<>();
	      searchlist = bookDAO.searchBook(name);

	      if(searchlist.size() < 1) {
	          System.out.println("�˻��� å�� �����ϴ�.");
	       }
	       else {
	          System.out.println("�˻��� å�� �����Դϴ�.");
	          for(Book book : searchlist) {
	                System.out.println(book);   
	          }
	       }
	    }
	
	//å �뿩
	public void rental() {
		int code = bookInput();
		
		System.out.println("å �뿩 �Ǽ� : ");
		int a = scanner.nextInt(); //�뿩�� å ����
		
		//�ش� å ã��
		if(bookDAO.isBook(code)) {
			  Book book = bookDAO.selectOne(code);
				if(book.getCnt() < a) {
		               System.out.println("��� 1���̶� �뿩�� �� �����ϴ�.");
		         }
				else {
					bookDAO.updateBook(code, a, false);
					book.setCnt(book.getCnt()-a);
					System.out.println(a + "���� �뿩�Ǿ����ϴ�.");
				}
				return;
		}
		   accountErr();
	}
	
	//å �ݳ�
	public void bookReturn() {
		int code = bookInput();
		System.out.print("å �ݳ� ���� : ");
	    int a = scanner.nextInt(); //�ݳ��� å ����

	    ArrayList<Book>list = bookDAO.selectAll();
   //�ش� å ã��
      for (Book book : list) {
         if(bookDAO.isBook(code)) {   //������ ���°� ������
        	 book.setCnt(a + book.getCnt());
            System.out.println(a + "���� �ݳ��߽��ϴ�.");
            return;
         }
      }
      accountErr();
   }

//å ��ü ���
	public void display() {  //���
		
		ArrayList<Book> list = bookDAO.selectAll();
		
		for(Book book : list) {
//			System.out.println(book.getCode() + "\t" + book.getName()+"\t" + book.getAutor()+"\t"+ book.getCnt());
		System.out.println(book);
		}
	}

}
