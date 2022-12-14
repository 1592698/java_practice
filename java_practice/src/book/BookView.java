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
	
	//�ش� åã��
	private Book findBookTraverse(int code) {
		for(Book book : list) {
			if(book.getCode()==code) { //������ ���°� �ִٸ�
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
		
		int code = bookInput();
		if(isBook(code)) {
			System.out.println("å �ڵ� �ߺ� (�����մϴ�)");
		}
		else {
			book.setCode(code);

			System.out.print("å ���� : ");
			book.setName(scanner.next());
			
			System.out.print("�۰� �̸� : ");
			book.setAutor(scanner.next());
			
			System.out.print("å ��� ���� : ");
			book.setCnt(scanner.nextInt());
			
			 list.add(book);
			 
			 System.out.println("å�� ��ϵǾ����ϴ�.");
			 System.out.println(list.toString()+ "\t");
		}
	}
	
	//å �˻�
	 public void search() {
		
		System.out.println("�˻��� å�� ������ �Է����ּ���");
		System.out.print("���� : ");
		String name = scanner.next();
		
		ArrayList<Book> searchlist = new ArrayList<>();
		
		for(Book book : list) {
			if(book.getName().contains(name)) {
				searchlist.add(book);
			}
		}
		if(searchlist.size()<1) {
			System.out.println("�˻��� å�� �����ϴ�");
		}
		else {
			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�.");
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
		for(Book book : list) {
			if(book.getCode()==code) {
				if(book.getCnt() < a) {
		               System.out.println("��� 1���̶� �뿩�� �� �����ϴ�.");
		         }
				else {
					book.setCnt(book.getCnt()-a);
					System.out.println(a + "���� �뿩�Ǿ����ϴ�.");
				}
				return;
			}
		}
		   accountErr();
	}
	
	//å �ݳ�
	public void bookReturn() {
		int code = bookInput();
		System.out.print("å �ݳ� ���� : ");
	    int a = scanner.nextInt(); //�ݳ��� å ����

   //�ش� å ã��
      for (Book book : list) {
         if(book.getCode()==code) {   //������ ���°� ������
        	 book.setCnt(a + book.getCnt());
            System.out.println(a + "���� �ݳ��߽��ϴ�.");
            return;
         }
      }
      accountErr();
   }

//å ��ü ���
	public void display() {  //���
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
			System.out.println("���� : ");
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
				System.out.println("==========å ��� ����ϱ�==========");
				System.out.println("å �ڵ�\tå ����\t�۰��̸�\tå ����");
				service.display();
				break;
			case 6:
				System.out.println("�����մϴ�");
				scanner.close();
				return;
			default:
				System.out.println("�߸� �����̽��ϴ�. \n�ٽ� �������ּ���");
				break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("=============Menu===============");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. å �뿩");
		System.out.println("4. å �ݳ�");
		System.out.println("5. å ��ü���");
		System.out.println("6. ���α׷�����");
		System.out.println();
	}
}


