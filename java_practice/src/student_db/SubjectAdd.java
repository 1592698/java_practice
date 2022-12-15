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
//	//해당 과목찾기
//	private Subject findBookTraverse(int code) {
//		for(Subject subject : list) {
//			if(subject.getCode()==code) { //동일한게 있따면
//				return subject;
//			}
//		}
//		return null;
//	}
//	
//	private boolean isSubejct(int code) {
//		//계좌 중복조회이기때문에 account을 리턴하지 말고 bool값을 리턴
//		return (findBookTraverse(code)==null) ? false: true;
//	}
//	
//	
//	public void addSubject() {
//		Subject subject = new Subject();
//		
//		System.out.println("추가할 과목을 입력해주세요.");
//		System.out.println("과목코드 : ");
//		int sub = scanner.nextInt();
//		
//		
//		if(isSubejct(sub)) {
//			System.out.println("수강과목이 존재 합니다");
//		}
//		else {
//			subject.setCode(sub);
//			
//			System.out.println("수강 과목 이름 : ");
//			subject.setSubject(scanner.next());
//			list.add(subject);
//			
//			System.out.println("과목이 등록되었습니당");
//			
//		}
//	}
//}
