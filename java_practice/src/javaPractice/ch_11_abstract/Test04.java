//package javaPractice.ch_11_abstract;
//
//import java.util.ArrayList;
//
//
//abstract class Car{
//	public String name;
//	Car(String name){
//		this.name = name;
//	}
//	public  void run() {
//		start();
//		drive();
//		stop();
//		turnOff();
//		clean();
//	}
//	public  void start( ) {
//		System.out.println(name + "시동을 켭니다");
//	}
//	public  void drive() {
//		System.out.println(name + "달립니다");
//	}
//	public  void stop() {
//		System.out.println(name + "멈춥니다");
//	}
//	public  void turnOff() {
//		System.out.println(name + "시동을 끕니다");
//	}
//	public void clean() {
//		System.out.println("세차를 합니다");
//	}
//}
//class Sonata extends Car{
//	
//	Sonata(){
//		super("Sonata");
//	}
//}
//class Grandeur extends Car{
//	Grandeur(){
//		super("Grandeur");
//	}
//}
//class Avante extends Car{
//	Avante(){
//		super("Avante");
//	}
//}
//class Genesis extends Car{
//	Genesis(){
//		super("Genesis");
//	}
//
//}
//public class Test04 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generateCarethod stub
//
//		ArrayList<Car> carList = new ArrayList<Car>();		
//		carList.add(new Sonata());
//		carList.add(new Grandeur());
//		carList.add(new Avante());
//		carList.add(new Genesis());
//		
//		for(Car car : carList) {
//			car.run();
//			System.out.println("======================");
//		}
//	}
//
//}
