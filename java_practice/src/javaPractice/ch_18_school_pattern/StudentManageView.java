package javaPractice.ch_18_school_pattern;

import java.util.Scanner;

public class StudentManageView {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		
		while(true) {
			System.out.println("�޴��� �������ּ��� >>> 1.�л��߰� / 2.�л����� / 3.������û / " + "4. �����Է� / 5. ������ȸ / 6. ���α׷�����");
			int menu = input.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
				StudentManage.addStudent();
				break;
			case 2:
				System.out.println("�л� ���� �޴� �Դϴ�.");
				StudentManage.removeStudent();
				break;
			case 3:
				System.out.println("���� ��û �޴� �Դϴ�.");
				StudentManage.addClass();
				break;
			case 4:
				System.out.println("���� �Է� �޴� �Դϴ�.");
				StudentManage.setScore();
				break;
			case 5:
				System.out.println("���� ��ȸ �޴� �Դϴ�.");
				StudentManage.infromStudent();
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