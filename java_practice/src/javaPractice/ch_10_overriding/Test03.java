package javaPractice.ch_10_overriding;

class Car{
	private String marker, model, color;
	protected int curSpeed;
	
	@Override
	public String toString() {
		return "Car [marker=" + marker + ", model=" + model + ", color=" + color + ", curSpeed=" + curSpeed + "]";
	}

	Car(String color, String model, String marker,int curSpeed){
		this.marker = marker;
		this.model=model;
		this.color = color;
		this.curSpeed=curSpeed;
	}

	public void speedUp() {
		this.curSpeed++;
	}
	public void speedDown() {
		this.curSpeed--;
	}
}
class SportCar extends Car{

	SportCar(String color, String model, String marker,int curSpeed) {
		super(color, model, marker,curSpeed);
		
	}
	@Override
	public void speedUp() {
		this.curSpeed+=10;
	}

	@Override
	public void speedDown() {
		this.curSpeed-=10;
	}
}
public class Test03 {

	public static void main(String[] args) {

		Car car1 = new Car("현대", "a123","black" , 15);
		Car car2 = new Car("삼성", "b22","pink" , 12);
		Car car3 = new Car("기아", "c35","yellow" , 17);
		
		car1.speedUp();
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
	}

}
