package student_db;

import java.util.Scanner;

public class StudentManageView {
	public static void main(String[] args) {

		StudentManage manage = new StudentManage();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		
		while(true) {
			System.out.println("�޴��� �������ּ��� >>> 1.�л��߰� / 2.�л����� / 3.������û / " + "4. �����Է� / 5. ������ȸ / 6. �������� ���� / 7. ���α׷�����");
			int menu = input.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
				manage.addStudent();
				break;
			case 2:
				System.out.println("�л� ���� �޴� �Դϴ�.");
				manage.removeStudent();
				break;
			case 3:
				System.out.println("���� ��û �޴� �Դϴ�.");
				manage.addClass();
				break;
			case 4:
				System.out.println("���� �Է� �޴� �Դϴ�.");
				manage.setScore();
				break;
			case 5:
				System.out.println("���� ��ȸ �޴� �Դϴ�.");
				manage.infromStudent();
				break;
			case 6:
				System.out.println("�������� ���� �޴� �Դϴ�.");
				manage.subjectManage();
			case 7:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("���� �޴��� �����߽��ϴ�.");
			}
		}
	}

}
