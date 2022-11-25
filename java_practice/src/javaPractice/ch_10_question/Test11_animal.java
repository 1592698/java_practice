package javaPractice.ch_10_question;

class Animal_1{
	void Breath() {
		System.out.println("숨쉬기");
	}
}
class Lion extends Animal_1 {

	@Override
	public String toString() {
		return "사자";
	}
	
}
class Rabbit extends Animal_1 {

	@Override
	public String toString() {
		return "토끼";
	}
	
}
class Monkey extends Animal_1 {

	@Override
	public String toString() {
		return "원숭이";
	}
	
}
class Zookeeper { //사육사 클래스
	void feed(Animal_1 animal) { //사자에게 먹이 주는 메서드
		System.out.println(animal + "에게 고기 주기");
	}	
}

public class Test11_animal {

	public static void main(String[] args) {
		
		Animal_1 lion = new Lion(); //Lion 인스턴스 생성
		Zookeeper james = new Zookeeper(); //james 라는 이름의 사육사 인스턴스 생성
		james.feed(lion); //james가 lion에게 먹이를 줌 
		
		Animal_1 rabbit = new Rabbit();
		james.feed(rabbit);
		Animal_1 monkey = new Monkey();
		james.feed(monkey);
	}
}
