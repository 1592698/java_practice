package Test2_school_pattern;


import java.util.ArrayList;

import java.util.Scanner;


public class StudentManage {

	 Scanner input = new Scanner(System.in);
	 private ArrayList<Student> students = new ArrayList<>();
//	 String className[] = {"JAVA","PYTHON","C"};
	
	 private ArrayList<String> className = new ArrayList<>();
	
	
	 
	  public Student findStudentInform(int studentNumber) {
		for(Student student : students) {
			if(student.getStudentNumber()==studentNumber) {
				System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
				System.out.println("�̸� : " + student.getName());
				System.out.println("��ȭ��ȣ : "+student.getPhoneNumber());
				System.out.println("�޸� : "+student.getMemo());
				return student;
			}
		}return null;
	}
	
	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


	public int studentNum() {
		//�л� ��ȣ �Է��ϱ�
		System.out.println("�л��� �й��� �Է��ϼ���. >>> ");
		int studentNumber = input.nextInt();
		return studentNumber;
	}
	 public StudentManage(){ //���� ������
		 className.add(0,"JAVA");
		 className.add(1,"PYTHON");
		 className.add(2,"C");
		 className.add(3,"C++");
	 }
	@Override
	public String toString() {
//		 return (className.indexOf(className)+1) + " : ";
		
		return "1. " + className.get(0) + " 2. " + className.get(1) + " 3. " + className.get(2) + " 4. " + className.get(3);
	}
	//1. �л� �߰� �� ����
	public  void addStudent() {
//		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
//		int studentNumber = input.nextInt(); //�й� �Է¹���
		int studentNumber = studentNum();
		//�Է��� �й����� ���ο� �л��� ����
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			newStudent = new Student(studentNumber);
			students.add(newStudent); //�л���ü�� ArrayList�� ����
		}
		System.out.println("�̸��� �Է� �ϼ���. >>>");
		newStudent.setName(input.next()); //���ڿ� �Է¹޾Ƽ� setName�� ����
		System.out.println("��ȭ ��ȣ�� �Է��ϼ���. >>>");
		newStudent.setPhoneNumber(input.next());
		System.out.println("�޸� �Է��ϼ���. >>>");
		newStudent.setMemo(input.next());
		System.out.println("�л� �߰��� �Ϸ� �Ǿ����ϴ�." +"\n" );
	}
	//2. �л� ���� �޴�
	public  void removeStudent() {
//		System.out.println("�л��� �й��� �Է� �ϼ���.>>>");
//		int studentNumber = input.nextInt(); //�й� �Է¹���
		int studentNumber = studentNum();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent ==null) { //���� ������ �л��� ������ ���ٸ�
			System.out.println("Error: �л��� ���������ʽ��ϴ�");
			return; //�޼ҵ� ����
		}
		students.remove(newStudent); //�ش� �л��� ����
		System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�.");
	}

	//3. ������û �޴�
	public  void addClass() {
//		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
//		int studentNumber = input.nextInt(); //�й� �Է¹���
		int studentNumber = studentNum();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent ==null) { //���� ������ �л��� �������� ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�.");
			return; //�޼ҵ� ����
		}
	
		while(true) {
			System.out.println("�޴��� �����ϼ��� : 1. ������û / 2. �������� / 3. ����");
			int classMenu = input.nextInt();
			switch(classMenu){
				case 1:
					setClass("������û �� ������ �����ϼ���", newStudent, true);
					break;
				case 2:
					setClass("���� ���� �� ������ �����ϼ���", newStudent, false);
					break;
				case 3:
					return;
			}
		}
	}

	private  void setClass(String message, Student newStudent, boolean check) {
		System.out.println(message);
//		System.out.println("1. JAVA / 2. PYTHON / 3. C");
	   for (int i = 0; i < className.size(); i++) { // ����� ������ŭ ���� �ݺ�
            String study = className.get(i);
            System.out.println((i+1) + " : " + study);
         }
         
         int index = input.nextInt() - 1; // �Է��� ���� -1 �� �ϸ� index���� ��
         newStudent.setClassCheck(index, check);
		
		
		if(!check) { //�������� �� �����̶��
			newStudent.setClassScore(index, 0); //������ 0���� �ǵ���
		}
	}

	//4. ���� �Է� �޴�
	public  void setScore() {
//		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
//		int studentNumber = input.nextInt(); //�й� �Է¹���
		int studentNumber = studentNum();
		
		Student newStudent =findStudentInform(studentNumber);
		if(newStudent==null) {//���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�.!!!");
			return; //�޼ҵ� ����
		}
		while(true) {
//			System.out.println("������ �Է�/ ������ ������ �����ϼ��� 1. JAVA / 2. PYTHON / 3. C / 4. ���� ");
			System.out.println("������ �Է�/ ������ ������ �����ϼ���." + toString() + "/ 4. ����");
			int classMenu = input.nextInt();
			if(classMenu ==5) {//���� üũ
				break; //while�� ����
			}
			if(!newStudent.getClassCheck()[classMenu-1]) { //�̽�û üũ
				System.out.println(className.get(classMenu-1)+"������ �̽�û �����Դϴ�!");
				continue; //�̽�û�̱⶧���� ó������ ���ư���
			}
			System.out.println("������ �Է��ϼ��� >>>");
			int score = input.nextInt();
			if(score <0 || score>100) { //������ 0-100�������� üũ
				System.out.println("Error: ������ 0���� 100���̿� ���ڸ� �Է��� �ּ���");
				continue; //ó������ ���ư�
				
			}
			//�������� ����� ������ �Էµ� ���
			newStudent.setClassScore(classMenu-1, score); //�ش��л��� Score�� ������Ʈ �Ѵ�
			System.out.println(className.get(classMenu-1)); //���
		}
	}

	//5. �л� ���� ��ȸ �޴�
	public  void infromStudent() {
		System.out.println("�޴��� ���� �� �ּ���. 1. Ư���л��� / 2. ��ü �л�");
		int menu =input.nextInt();
		
		switch(menu) {
		case 1: //Ư���л��� ��������
			One();
			break;
		case 2: //��ü �л��� ���� ����
			All();
			break;
		}
	}
	 void One() {
		System.out.println("�л��� �й��� �Է��ϼ���.");
		int studentNumber = input.nextInt(); //�й� �Է¹���
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent==null) { //���� ������ �л��� ������ ���ٸ�
			System.out.println("Error: �л��� �������� �ʽ��ϴ�.!!!");
			return;//�޼ҵ� ����
		}
//		System.out.println("�й� : " + newStudent.getStudentNumber());
//		System.out.println("�̸� : " + newStudent.getName());
//		System.out.println("��ȭ��ȣ : " + newStudent.getPhoneNumber());
//		System.out.println("�޸� : " + newStudent.getMemo());
//		System.out.println("���� �������� ����� ���� >>>");
//		boolean[] classCheck = newStudent.getClassCheck();
//		int[] classScore = newStudent.getClassScore();
//		for(int i=0; i<classCheck.length; i++) {
//			if(classCheck[i]) {
//				System.out.println("����� : " + className[i]+"/����                                                                                                                                                                                                                                                                                                             : " + classScore[i]);
//			}
//		}
		printStudent(newStudent);
	}
	
	 void All() {
		for(Student student : students) {
//			System.out.println("�й� : " + student.getStudentNumber());
//			System.out.println("�̸� : " + student.getName());
//			System.out.println("��ȭ��ȣ : " + student.getPhoneNumber());
//			System.out.println("�޸� : " + student.getMemo());
//			System.out.println("���� �������� ����� ���� >>>");
//			boolean[] classCheck = student.getClassCheck();
//			int[] classScore = student.getClassScore();
//			for(int i=0; i<classCheck.length; i++) {
//				if(classCheck[i]) {
//					System.out.println("����� : " + className[i]+"/���� : " + classScore[i]);
//				}
//			}
			
			printStudent(student);
		}
	}
	 private void printStudent(Student student) { // ������ȸ ��� �޼ҵ�
         System.out.println("�й�: " + student.getStudentNumber());
         System.out.println("�̸�: " + student.getName());
         System.out.println("��ȭ��ȣ: " + student.getPhoneNumber());
         System.out.println("�޸�: " + student.getMemo());
         System.out.println("���� �������� ����� ���� >>> ");
         boolean[] classCheck = student.getClassCheck();
         int[] classScore = student.getClassScore();
         for(int i = 0; i < classCheck.length; i++) {
            if(classCheck[i]) {
               System.out.println("�����: " + className.get(i) + " / ����: " + classScore[i]);
            }
         }
      }
	 

}
