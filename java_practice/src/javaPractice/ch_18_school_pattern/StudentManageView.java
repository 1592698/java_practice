package javaPractice.ch_18_school_pattern;

import java.util.Scanner;

public class StudentManageView {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("학생 관리 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("메뉴를 선택해주세요 >>> 1.학생추가 / 2.학생삭제 / 3.수강신청 / " + "4. 성적입력 / 5. 정보조회 / 6. 프로그램종료");
			int menu = input.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("학생 추가 및 수정 메뉴 입니다.");
				StudentManage.addStudent();
				break;
			case 2:
				System.out.println("학생 삭제 메뉴 입니다.");
				StudentManage.removeStudent();
				break;
			case 3:
				System.out.println("수강 신청 메뉴 입니다.");
				StudentManage.addClass();
				break;
			case 4:
				System.out.println("성적 입력 메뉴 입니다.");
				StudentManage.setScore();
				break;
			case 5:
				System.out.println("정보 조회 메뉴 입니다.");
				StudentManage.infromStudent();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴를 선택했습니다.");
			}
		}
	}

}
