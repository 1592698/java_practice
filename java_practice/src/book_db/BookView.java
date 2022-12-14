package book_db;

import java.util.Scanner;

public class BookView {
	public static void main(String[] args) {

		BookManager service = new BookManager();
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


