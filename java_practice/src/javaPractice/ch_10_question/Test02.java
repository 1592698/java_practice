package javaPractice.ch_10_question;

class Circle {
	protected int radius; //������
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
		
		System.out.println("������ ���� : " +tasty+ ", ������ ũ�� : " + radius);
	}
	
}

/*���� ��Ÿ���� Circle Ŭ������ ��ӹ޾Ƽ� ���ڸ� ��Ÿ���� Pizza Ŭ������ �ۼ��� ����*/
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); //������ ���� : Pepperoni, ������ ũ�� : 20
		
	}

}
