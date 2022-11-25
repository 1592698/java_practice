package javaPractice.ch_12_interface;

/*
 * A 프로그래머와 B 프로그래머가 하나의 프로젝트를 진행 했을 때
 * A프로그래머와 B 프로그래머가 서로의 클래스가 완성되지 않았어도,
 * 구현해야 할 기능들을 미리 협의 하고 반환 타입을 정해 놓으면
 * 서로의 작업의 정도와는 무관하게 진행가능
 * 바로 이런 약속과 같은것이 인터페이스
 * 아래예지는 KoreaTour, JapanTour, TourGuide클래스를 3명이 각각 작업을 하고,
 * 동시에 개발에 들어가는 것으로 보면
 * 인터페이스를 이해하기 쉬움
 * 인터페이스를 미리 만들어서 가능하게 됨.
 * 즉 작업 순서가 1) 인터페이스 2)동시에 3개의 클래스를 작업
 * */
interface Providable { //인터페이스
	void leisureSports(); //public abstract생략
	void sightseeing();
	void food();
}
class KoreaTour implements Providable {

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("전주 비빔밥 투어");
	}	
}
class TourGuide{
	private Providable tour; //인터페이스로 타입 선언
	TourGuide (Providable providable){
		tour = providable;
	}
	
	//오버라이딩 아님
	public void leisureSports(){
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}
public class Tour_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
	}

}
