package javaPractice.ch_10_question;

class Animal_1{
	void Breath() {
		System.out.println("������");
	}
}
class Lion extends Animal_1 {

	@Override
	public String toString() {
		return "����";
	}
	
}
class Rabbit extends Animal_1 {

	@Override
	public String toString() {
		return "�䳢";
	}
	
}
class Monkey extends Animal_1 {

	@Override
	public String toString() {
		return "������";
	}
	
}
class Zookeeper { //������ Ŭ����
	void feed(Animal_1 animal) { //���ڿ��� ���� �ִ� �޼���
		System.out.println(animal + "���� ��� �ֱ�");
	}	
}

public class Test11_animal {

	public static void main(String[] args) {
		
		Animal_1 lion = new Lion(); //Lion �ν��Ͻ� ����
		Zookeeper james = new Zookeeper(); //james ��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion); //james�� lion���� ���̸� �� 
		
		Animal_1 rabbit = new Rabbit();
		james.feed(rabbit);
		Animal_1 monkey = new Monkey();
		james.feed(monkey);
	}
}
