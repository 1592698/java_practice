package javaPractice.ch_10_question;

import java.awt.Robot;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ֿϵ��� Ŭ������ �̿� �� (�������� ����)
		//�������� �������̵�
		
		Test10_pet kurt;
		kurt = new Test10_pet("Kurt", "����"); 
		kurt.introduce(); //�� �̸��� Kurt�Դϴ�.  ���δ��� �����Դϴ�.
		System.out.println( ); 
		
		Test10_RobotPet r2d2 = new Test10_RobotPet("R202", "��ũ");
		r2d2.introduce(); //���� �κ��Դϴ�, �̸��� R202�Դϴ�.  ���δ���, ��ũ�Դϴ�.û�Ҹ� �մϴ�
		r2d2.work(0);
		System.out.println( );
		
		Test10_pet toy = new Test10_RobotPet("toy", "����2");
		toy.introduce(); //���� �κ��Դϴ�, �̸��� toy�Դϴ�.  ���δ���, ����2�Դϴ�.
		//toy.work(0);
		System.out.println( );
		
		Test10_pet p = r2d2;
		p.introduce(); //���� �κ��Դϴ�, �̸��� R202�Դϴ�.  ���δ���, ��ũ�Դϴ�.
		
		System.out.println( );
		
		r2d2.setName("���̷κ�");
		r2d2.introduce( ); //���� �κ��Դϴ�, �̸��� ���̷κ��Դϴ�.  ���δ���, ��ũ�Դϴ�.
		System.out.println( );
		p.introduce( ); //���� �κ��Դϴ�, �̸��� ���̷κ��Դϴ�.  ���δ���, ��ũ�Դϴ�.
		
	}

}
