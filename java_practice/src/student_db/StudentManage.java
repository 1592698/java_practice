package student_db;


import java.util.ArrayList;
import java.util.Scanner;

import org.mariadb.jdbc.plugin.Codec;

import book_db.Book;



public class StudentManage {

	Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> list; 
//	static String[] className = {"JAVA","PYTHON","C"};
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;
	private CourseDAO courseDAO;
	public StudentManage() {
		courseDAO = new CourseDAO();
		subjectDAO = new SubjectDAO();
		studentDAO = new StudentDAO();
		list = new ArrayList<Student>();
		scanner = new Scanner(System.in);
	}
	
	private Student findStudentInform(int studentNumber) {
		for(Student student : list) {
			if(student.getStudentNumber()==studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다.");
				System.out.println("이름 : " + student.getName());
				System.out.println("전화번호 : "+student.getPhoneNumber());
				System.out.println("메모 : "+student.getMemo());
				return student;
			}
		}return null;
	}
	
	//해당 학생찾기
	private Student findStudentTraverse(int studentNumber) {
		for(Student student : list) {
			if(studentDAO.isStudent(studentNumber)) { //동일한 학번이 있다면
				return student;
			}
		}
		return null;
	}
	
	private Student findStudent(int studentNumber) { 
		//대여, 반납 책 찾는거
		Student student =findStudentTraverse(studentNumber);
		if(student == null) {
			System.out.println("학번을 찾을 수 없습니다");
		}
		return student;
	}

	private boolean isStudent(int studentNumber) {
		//계좌 중복조회이기때문에 account을 리턴하지 말고 bool값을 리턴
		return (findStudentTraverse(studentNumber)==null) ? false: true;
	}
	
	//1. 학생 추가 및 수정
	public  void addStudent() {
		Student student = new Student();
		
		System.out.println("학생의 학번을 입력하세요. >>>");
		student.setStudentNumber(scanner.nextInt()); //학번 입력받음
		

		System.out.println("이름을 입력 하세요. >>>");
		student.setName(scanner.next());
		System.out.println("전화 번호를 입력하세요. >>>");
		student.setPhoneNumber(scanner.nextInt());
		System.out.println("메모를 입력하세요. >>>");
		student.setMemo(scanner.next());
		studentDAO.insertStudent(student);
		System.out.println("학생 추가가 완료 되었습니다." +"\n" );
	}

	//2. 학생 삭제 메뉴
	public  void removeStudent() {
		Student student = new Student();
		System.out.println("학생의 학번을 입력 하세요.>>>");
		int studentNumber = scanner.nextInt(); //학번 입력받음
		
		
		 //만약 기존에 학생의 정보가 있다면
			if(studentDAO.isStudent(studentNumber)) {
				studentDAO.deleteStudent(studentNumber);
				System.out.println("학번 " + studentNumber + "의 학생의 정보가 삭제 되었습니다");
			}
	}

	//3. 수강신청 메뉴
	public  void addClass() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = scanner.nextInt(); //학번 입력받음
		     
		while(true) {
			System.out.println("메뉴를 선택하세요 : 1. 수강신청 / 2. 수강포기 / 3. 종료");
			int classMenu = scanner.nextInt();
			switch(classMenu){
				case 1:
				    printSubject();
					System.out.println("수강신청 할 과목 코드를 선택하세요 : ");
					
					int code =scanner.nextInt();
					Course course = new Course();
					course.setCode(code);
					course.setStudentNumber(studentNumber);
					courseDAO.insertCourse(course);
					
					System.out.println("학번 " + studentNumber+ " 학생이 " + code + " 과목을 수강신청완료했습니다.");
					break;
				case 2:
					System.out.println("수강 포기 할 과목코드를 선택하세요 : ");
					int code2 = scanner.nextInt();
						courseDAO.deleteCourse(code2);
						System.out.println("과목을 삭제했습니다.");
					break;
				case 3:
					return;
			}
		}
	}

	//수강신청 과목 전체목록
	private void printSubject() {
		Subject subject = new Subject();
		ArrayList<Subject> list = subjectDAO.selectAll();
		
		for(Subject subject3 : list) {
			System.out.println("과목코드 : " + subject3.getCode() + " " + "과목이름 : " + subject3.getSubjectName() );
		}
	}
	private void printCourse() {
		Course course = new Course();
		ArrayList<Course> list = courseDAO.selectAll();
		
		for(Course course2 : list) {
			System.out.println("과목코드 : " + course2.getCode() + " " + "과목이름: " + course2.getStudentNumber());
		}
		
	}
	
	private void addCourse() {

	}
	//4. 성적 입력 메뉴
	public  void setScore() {

		Course course = new Course();
		ArrayList<Course> list = courseDAO.selectAll();
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = scanner.nextInt(); //학번 입력받음
		if(!studentDAO.isStudent(studentNumber)) {//만약 기존에 학생의 정보가 없으면
			System.out.println("Error : 학생이 존재하지 않습니다.!!!");
			return; //메소드 종료
		}
		
		for(Course course2 : list) {
			if(studentNumber==course2.getStudentNumber())
				System.out.println("과목코드 : " + course2.getCode() + " " + "과목이름: " + course2.getStudentNumber());
		}
		while(true) {
//			System.out.println("성적입력할 과");
			int classMenu = scanner.nextInt();
			System.out.println("0번 종료");
			if(classMenu ==0) {//종료 체크
				break; //while문 종료
			}
			if(courseDAO.isCourse(classMenu)) { //미신청 체크
				System.out.println("과목은 미신청 과목입니다!");
				continue; //미신청이기때문에 처음으로 돌아간다
			}
			System.out.println("성적을 입력하세요 >>>");
			int score = scanner.nextInt();
			System.out.println("성적이 입력되었습니다.");
			if(score <0 || score>100) { //성적이 0-100까지인지 체크
				System.out.println("Error: 성적은 0부터 100사이에 숫자만 입력해 주세요");
				continue; //처음으로 돌아감
				
			}
			//정상적인 과목과 성적이 입력된 경우
			Student student = new Student();
//			course.setScore(score); //해당학생의 Score를 업데이트 한다
			
			courseDAO.updateScore(classMenu, studentNumber,score);
			System.out.println(); //출력
			return;
		}
		
	}

	//5. 학생 정보 조회 메뉴
	public  void infromStudent() {
		System.out.println("메뉴를 선택 해 주세요. 1. 특정학생만 / 2. 전체 학생");
		int menu =scanner.nextInt();
		
		switch(menu) {
		case 1: //특정학생의 성적정보
			One();
			break;
		case 2: //전체 학생의 성적 정보
			All();
			break;
		}
	}
	
	
	//6. 수강과목 관리 메뉴
	public  void subjectManage() {
		Subject subject =new Subject();
		
		while(true) {
			System.out.println("메뉴를 선택하세요 : 1. 수강과목 등록 / 2. 수강과목 삭제 / 3. 수강과목 조회 / 4. 메인메뉴로");
			int classMenu = scanner.nextInt();
			switch (classMenu) {
			case 1:
				System.out.print("과목코드 : ");
				subject.setCode(scanner.nextInt());
				System.out.print("과목 이름 : ");
				subject.setSubjectName(scanner.next());

				if(subjectDAO.insertSubject(subject)) {
					System.out.println("과목 등록에 성공했습니다.");
				}
				else{
					System.out.println("과목이 존재합니다. 등록에 실패했습니다");
				}
				System.out.println();
				break;
			case 2:
				
				System.out.print("과목코드 : ");
				int code= scanner.nextInt();
				if(subjectDAO.deleteSubject(code)) 
						{
					System.out.println("과목을 삭제했습니다.");
				}
				break;
			case 3:
				System.out.println("수강과목 관리 전체 항목");
				
				printCourse();
//				ArrayList<Subject> list = subjectDAO.selectAll();
//			      for (Subject subject3 : list) {
//			         printSubject(subject3);
//			      }
				break;
			case 4:
				return;
			}
		}
	}  
	
	
	 void One() {
		System.out.println("학생의 학번을 입력하세요.");
		int studentNumber = scanner.nextInt(); //학번 입력받음
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent==null) { //만약 기존에 학생의 정보가 없다면
			System.out.println("Error: 학생이 존재하지 않습니다.!!!");
			return;//메소드 종류
		}
		System.out.println("학번 : " + newStudent.getStudentNumber());
		System.out.println("이름 : " + newStudent.getName());
		System.out.println("전화번호 : " + newStudent.getPhoneNumber());
		System.out.println("메모 : " + newStudent.getMemo());
		System.out.println("현재 수강중인 과목과 성적 >>>");
//		boolean[] classCheck = newStudent.getClassCheck();
//		int[] classScore = newStudent.getClassScore();
//		for(int i=0; i<classCheck.length; i++) {
//			if(classCheck[i]) {
//				System.out.println("과목명 : " + className[i]+"/성적                                                                                                                                                                                                                                                                                                             : " + classScore[i]);
//			}
//		}
	}
	
	 void All() {
		for(Student student : list) {
			System.out.println("학번 : " + student.getStudentNumber());
			System.out.println("이름 : " + student.getName());
			System.out.println("전화번호 : " + student.getPhoneNumber());
			System.out.println("메모 : " + student.getMemo());
			System.out.println("현재 수강중인 과목과 성적 >>>");
//			boolean[] classCheck = student.getClassCheck();
//			int[] classScore = student.getClassScore();
//			for(int i=0; i<classCheck.length; i++) {
//				if(classCheck[i]) {
//					System.out.println("과목명 : " + className[i]+"/성적 : " + classScore[i]);
//				}
//			}
		}
	}





}
