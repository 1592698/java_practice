package javaPractice.ch_11_abstract;

abstract class Animal { //동물 클래스
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public String getName() { return name;}
	
	public abstract void bark(); // 짖는다
	public abstract String toString(); //문자열 표현을 반환
	
	public void introduce() {
		System.out.println(toString() + "입니다.");
		bark();
	}
}
class Cat extends Animal{
	private int age;
	public Cat(String name, int age) { super(name); this.age = age;}
	public void bark() { System.out.println("야옹!");}
	public String toString() {return age + "살인 " + getName();}
	
}

class Dog extends Animal{
	private String type; //견종
	public Dog(String name, String type) {
		super(name); this.type=type;
	}
	public void bark() {System.out.println("멍멍@@@");}
	public String toString() {return type + "인 " + getName();}
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals= {
				new Dog("바둑이", "삽살개"), //개
				new Cat("아롱이", 7), //고양이
				new Dog("백두","진돗개"), //개
		};
		for(Animal animal : animals) {
			animal.introduce(); //animal이 참조하고 있는 인스턴스의 형에 따라서
			System.out.println(); //메서드가 호출된다
		}
	}
}
