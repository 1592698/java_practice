//package student_db;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class SubjectAdd {
//
//	Scanner scanner = new Scanner(System.in);
//	private ArrayList<Subject> list;
//	
//	
//	//�ش� ����ã��
//	private Subject findBookTraverse(int code) {
//		for(Subject subject : list) {
//			if(subject.getCode()==code) { //�����Ѱ� �ֵ���
//				return subject;
//			}
//		}
//		return null;
//	}
//	
//	private boolean isSubejct(int code) {
//		//���� �ߺ���ȸ�̱⶧���� account�� �������� ���� bool���� ����
//		return (findBookTraverse(code)==null) ? false: true;
//	}
//	
//	
//	public void addSubject() {
//		Subject subject = new Subject();
//		
//		System.out.println("�߰��� ������ �Է����ּ���.");
//		System.out.println("�����ڵ� : ");
//		int sub = scanner.nextInt();
//		
//		
//		if(isSubejct(sub)) {
//			System.out.println("���������� ���� �մϴ�");
//		}
//		else {
//			subject.setCode(sub);
//			
//			System.out.println("���� ���� �̸� : ");
//			subject.setSubject(scanner.next());
//			list.add(subject);
//			
//			System.out.println("������ ��ϵǾ����ϴ�");
//			
//		}
//	}
//}
