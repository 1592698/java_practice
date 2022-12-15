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
				System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
				System.out.println("�̸� : " + student.getName());
				System.out.println("��ȭ��ȣ : "+student.getPhoneNumber());
				System.out.println("�޸� : "+student.getMemo());
				return student;
			}
		}return null;
	}
	
	//�ش� �л�ã��
	private Student findStudentTraverse(int studentNumber) {
		for(Student student : list) {
			if(studentDAO.isStudent(studentNumber)) { //������ �й��� �ִٸ�
				return student;
			}
		}
		return null;
	}
	
	private Student findStudent(int studentNumber) { 
		//�뿩, �ݳ� å ã�°�
		Student student =findStudentTraverse(studentNumber);
		if(student == null) {
			System.out.println("�й��� ã�� �� �����ϴ�");
		}
		return student;
	}

	private boolean isStudent(int studentNumber) {
		//���� �ߺ���ȸ�̱⶧���� account�� �������� ���� bool���� ����
		return (findStudentTraverse(studentNumber)==null) ? false: true;
	}
	
	//1. �л� �߰� �� ����
	public  void addStudent() {
		Student student = new Student();
		
		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
		student.setStudentNumber(scanner.nextInt()); //�й� �Է¹���
		

		System.out.println("�̸��� �Է� �ϼ���. >>>");
		student.setName(scanner.next());
		System.out.println("��ȭ ��ȣ�� �Է��ϼ���. >>>");
		student.setPhoneNumber(scanner.nextInt());
		System.out.println("�޸� �Է��ϼ���. >>>");
		student.setMemo(scanner.next());
		studentDAO.insertStudent(student);
		System.out.println("�л� �߰��� �Ϸ� �Ǿ����ϴ�." +"\n" );
	}

	//2. �л� ���� �޴�
	public  void removeStudent() {
		Student student = new Student();
		System.out.println("�л��� �й��� �Է� �ϼ���.>>>");
		int studentNumber = scanner.nextInt(); //�й� �Է¹���
		
		
		 //���� ������ �л��� ������ �ִٸ�
			if(studentDAO.isStudent(studentNumber)) {
				studentDAO.deleteStudent(studentNumber);
				System.out.println("�й� " + studentNumber + "�� �л��� ������ ���� �Ǿ����ϴ�");
			}
	}

	//3. ������û �޴�
	public  void addClass() {
		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
		int studentNumber = scanner.nextInt(); //�й� �Է¹���
		     
		while(true) {
			System.out.println("�޴��� �����ϼ��� : 1. ������û / 2. �������� / 3. ����");
			int classMenu = scanner.nextInt();
			switch(classMenu){
				case 1:
				    printSubject();
					System.out.println("������û �� ���� �ڵ带 �����ϼ��� : ");
					
					int code =scanner.nextInt();
					Course course = new Course();
					course.setCode(code);
					course.setStudentNumber(studentNumber);
					courseDAO.insertCourse(course);
					
					System.out.println("�й� " + studentNumber+ " �л��� " + code + " ������ ������û�Ϸ��߽��ϴ�.");
					break;
				case 2:
					System.out.println("���� ���� �� �����ڵ带 �����ϼ��� : ");
					int code2 = scanner.nextInt();
						courseDAO.deleteCourse(code2);
						System.out.println("������ �����߽��ϴ�.");
					break;
				case 3:
					return;
			}
		}
	}

	//������û ���� ��ü���
	private void printSubject() {
		Subject subject = new Subject();
		ArrayList<Subject> list = subjectDAO.selectAll();
		
		for(Subject subject3 : list) {
			System.out.println("�����ڵ� : " + subject3.getCode() + " " + "�����̸� : " + subject3.getSubjectName() );
		}
	}
	private void printCourse() {
		Course course = new Course();
		ArrayList<Course> list = courseDAO.selectAll();
		
		for(Course course2 : list) {
			System.out.println("�����ڵ� : " + course2.getCode() + " " + "�����̸�: " + course2.getStudentNumber());
		}
		
	}
	
	private void addCourse() {

	}
	//4. ���� �Է� �޴�
	public  void setScore() {

		Course course = new Course();
		ArrayList<Course> list = courseDAO.selectAll();
		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
		int studentNumber = scanner.nextInt(); //�й� �Է¹���
		if(!studentDAO.isStudent(studentNumber)) {//���� ������ �л��� ������ ������
			System.out.println("Error : �л��� �������� �ʽ��ϴ�.!!!");
			return; //�޼ҵ� ����
		}
		
		for(Course course2 : list) {
			if(studentNumber==course2.getStudentNumber())
				System.out.println("�����ڵ� : " + course2.getCode() + " " + "�����̸�: " + course2.getStudentNumber());
		}
		while(true) {
//			System.out.println("�����Է��� ��");
			int classMenu = scanner.nextInt();
			System.out.println("0�� ����");
			if(classMenu ==0) {//���� üũ
				break; //while�� ����
			}
			if(courseDAO.isCourse(classMenu)) { //�̽�û üũ
				System.out.println("������ �̽�û �����Դϴ�!");
				continue; //�̽�û�̱⶧���� ó������ ���ư���
			}
			System.out.println("������ �Է��ϼ��� >>>");
			int score = scanner.nextInt();
			System.out.println("������ �ԷµǾ����ϴ�.");
			if(score <0 || score>100) { //������ 0-100�������� üũ
				System.out.println("Error: ������ 0���� 100���̿� ���ڸ� �Է��� �ּ���");
				continue; //ó������ ���ư�
				
			}
			//�������� ����� ������ �Էµ� ���
			Student student = new Student();
//			course.setScore(score); //�ش��л��� Score�� ������Ʈ �Ѵ�
			
			courseDAO.updateScore(classMenu, studentNumber,score);
			System.out.println(); //���
			return;
		}
		
	}

	//5. �л� ���� ��ȸ �޴�
	public  void infromStudent() {
		System.out.println("�޴��� ���� �� �ּ���. 1. Ư���л��� / 2. ��ü �л�");
		int menu =scanner.nextInt();
		
		switch(menu) {
		case 1: //Ư���л��� ��������
			One();
			break;
		case 2: //��ü �л��� ���� ����
			All();
			break;
		}
	}
	
	
	//6. �������� ���� �޴�
	public  void subjectManage() {
		Subject subject =new Subject();
		
		while(true) {
			System.out.println("�޴��� �����ϼ��� : 1. �������� ��� / 2. �������� ���� / 3. �������� ��ȸ / 4. ���θ޴���");
			int classMenu = scanner.nextInt();
			switch (classMenu) {
			case 1:
				System.out.print("�����ڵ� : ");
				subject.setCode(scanner.nextInt());
				System.out.print("���� �̸� : ");
				subject.setSubjectName(scanner.next());

				if(subjectDAO.insertSubject(subject)) {
					System.out.println("���� ��Ͽ� �����߽��ϴ�.");
				}
				else{
					System.out.println("������ �����մϴ�. ��Ͽ� �����߽��ϴ�");
				}
				System.out.println();
				break;
			case 2:
				
				System.out.print("�����ڵ� : ");
				int code= scanner.nextInt();
				if(subjectDAO.deleteSubject(code)) 
						{
					System.out.println("������ �����߽��ϴ�.");
				}
				break;
			case 3:
				System.out.println("�������� ���� ��ü �׸�");
				
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
		System.out.println("�л��� �й��� �Է��ϼ���.");
		int studentNumber = scanner.nextInt(); //�й� �Է¹���
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent==null) { //���� ������ �л��� ������ ���ٸ�
			System.out.println("Error: �л��� �������� �ʽ��ϴ�.!!!");
			return;//�޼ҵ� ����
		}
		System.out.println("�й� : " + newStudent.getStudentNumber());
		System.out.println("�̸� : " + newStudent.getName());
		System.out.println("��ȭ��ȣ : " + newStudent.getPhoneNumber());
		System.out.println("�޸� : " + newStudent.getMemo());
		System.out.println("���� �������� ����� ���� >>>");
//		boolean[] classCheck = newStudent.getClassCheck();
//		int[] classScore = newStudent.getClassScore();
//		for(int i=0; i<classCheck.length; i++) {
//			if(classCheck[i]) {
//				System.out.println("����� : " + className[i]+"/����                                                                                                                                                                                                                                                                                                             : " + classScore[i]);
//			}
//		}
	}
	
	 void All() {
		for(Student student : list) {
			System.out.println("�й� : " + student.getStudentNumber());
			System.out.println("�̸� : " + student.getName());
			System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
			System.out.println("�޸� : " + student.getMemo());
			System.out.println("���� �������� ����� ���� >>>");
//			boolean[] classCheck = student.getClassCheck();
//			int[] classScore = student.getClassScore();
//			for(int i=0; i<classCheck.length; i++) {
//				if(classCheck[i]) {
//					System.out.println("����� : " + className[i]+"/���� : " + classScore[i]);
//				}
//			}
		}
	}





}
