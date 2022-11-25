package javaPractice.ch_08_class;

class MyStudent { //메서드는 없는 클래스
	String name; //이름
	int grade; //학년
	int kor; //국어 성적
	int eng; //영어 성적
	int math; //수학 성적
	
	
	void printStudent() {
		//변수 하나로 학생 한 명이 여러 행보를 저장 할 수 있음
		System.out.println(name+"는 "+grade 
			+"학년이고, 국어성적은 " + kor + "점입니다.");
	}
}


public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MyStudent student1 = new MyStudent(); //class를 모델로 하는 객체 생성
	//일반적인 데이터와 타입이 달라서 객체라고 함
	//변수 하나로 학생 한 명이 여러 정보를 저장 할 수 있음
	
	student1.name="김박이";
	student1.grade=2;
	student1.kor=100;
	student1.eng=90;
	student1.math=80;
	
	MyStudent student2 = new MyStudent(); //class를 모델로 하는 객체 생성
	student2.name="박명수";
	student2.grade=1;
	student2.kor=90;
	student2.eng=80;
	student2.math=70;
		
		
	student1.printStudent();//김박이는 2학년이고 국어 성적은 100 점입니다
	student2.printStudent(); //박명수는 1학년이고 국어 성적은 90점입니다
	}

	
}
