package javaPractice.ch_10_question;

class Circle {
	protected int radius; //반지름
	public Circle(int radius) {
		this.radius = radius;
	}
}
class Pizza extends Circle{
	private String tasty;
	public Pizza(String tasty, int radius) {
		super(radius);
		this.radius= radius*2;
		this.tasty = tasty;
		
	}
	public void print() {
		
		System.out.println("피자의 종류 : " +tasty+ ", 피자의 크기 : " + radius);
	}
	
}

/*원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza 클래스를 작성해 보자*/
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); //피자의 종류 : Pepperoni, 피자의 크기 : 20
		
	}

}
