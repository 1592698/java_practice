package javaPractice.ch_10_question;

class Robot{}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 부릅니다");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다");
	}
}

public class Test12 {

	/*1) instanceof를 이용해서 action 메서드를 작성하시오*/
	
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r; //부모타입에서 자식타입으로 대입할 
			dr.dance();
		}
		else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		else if (r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot) r;
			dr.draw();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++) {
			action(arr[i]);
		}
	}
}
