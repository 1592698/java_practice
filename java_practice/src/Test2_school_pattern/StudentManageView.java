package Test2_school_pattern;

import java.util.Scanner;

public class StudentManageView {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		
		StudentManage studentManage= new StudentManage();
		while(true) {
			System.out.println("�޴��� �������ּ��� >>> 1.�л��߰� / 2.�л����� / 3.������û / " + "4. �����Է� / 5. ������ȸ / 6. ���α׷�����");
			int menu = input.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
				studentManage.addStudent();
				break;
			case 2:
				System.out.println("�л� ���� �޴� �Դϴ�.");
				studentManage.removeStudent();
				break;
			case 3:
				System.out.println("���� ��û �޴� �Դϴ�.");
				studentManage.addClass();
				break;
			case 4:
				System.out.println("���� �Է� �޴� �Դϴ�.");
				studentManage.setScore();
				break;
			case 5:
				System.out.println("���� ��ȸ �޴� �Դϴ�.");
				studentManage.infromStudent();
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("���� �޴��� �����߽��ϴ�.");
			}
		}
	}

}