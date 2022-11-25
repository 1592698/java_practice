package javaPractice.ch_10_question;

import java.awt.Robot;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//애완동물 클래스의 이용 예 (다형성의 검증)
		//다형성의 오버라이딩
		
		Test10_pet kurt;
		kurt = new Test10_pet("Kurt", "아이"); 
		kurt.introduce(); //내 이름은 Kurt입니다.  주인님은 아이입니다.
		System.out.println( ); 
		
		Test10_RobotPet r2d2 = new Test10_RobotPet("R202", "루크");
		r2d2.introduce(); //저는 로봇입니다, 이름은 R202입니다.  주인님은, 루크입니다.청소를 합니다
		r2d2.work(0);
		System.out.println( );
		
		Test10_pet toy = new Test10_RobotPet("toy", "아이2");
		toy.introduce(); //저는 로봇입니다, 이름은 toy입니다.  주인님은, 아이2입니다.
		//toy.work(0);
		System.out.println( );
		
		Test10_pet p = r2d2;
		p.introduce(); //저는 로봇입니다, 이름은 R202입니다.  주인님은, 루크입니다.
		
		System.out.println( );
		
		r2d2.setName("아이로봇");
		r2d2.introduce( ); //저는 로봇입니다, 이름은 아이로봇입니다.  주인님은, 루크입니다.
		System.out.println( );
		p.introduce( ); //저는 로봇입니다, 이름은 아이로봇입니다.  주인님은, 루크입니다.
		
	}

}
