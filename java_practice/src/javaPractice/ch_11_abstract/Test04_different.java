package javaPractice.ch_11_abstract;

import java.util.ArrayList;

/*
 * Car 추상 클래스를 상속받는 Sonata, Grandeur, Avante, Genesis 클래스가 있습니다.
 * 각 차는 주행하기 위해 다음 순서로 움직입니다.
 *       run() {
 *          start();
 *          drive();
 *          stop();
 *          turnOff();
 *       }
 * 
 * CarTest 클래스를 보고 다음 출력 결과가 나오도록
 * Car, Sonata, Grandeur, Avante, Genesis 클래스를 구현하세요.
 * 
 * Sonata 시동을 켭니다
 * Sonata 달립니다
 * Sonata 멈춥니다
 * Sonata 시동을 끕니다
 * =====================
 * Grandeur 시동을 켭니다
 * Grandeur 달립니다
 * Grandeur 멈춥니다
 * Grandeur 시동을 끕니다
 * =====================
 * Avante 시동을 켭니다
 * Avante 달립니다
 * Avante 멈춥니다
 * Avante 시동을 끕니다
 * =====================
 * Genesis 시동을 켭니다
 * Genesis 달립니다
 * Genesis 멈춥니다
 * Genesis 시동을 끕니다
 */

abstract class Car{
   protected String name;
   Car(String name){
      this.name = name;
   }
   public void run() {            // 반복적으로 들어가야하기에 부모 클래스에 넣어두는게 좋고!
      start();
      drive();
      stop();
      turnOff();
      clean();
   }
   public abstract void start();   // 
   public abstract void drive();
   public abstract void stop();
   public abstract void turnOff();
   public abstract void clean();
}

class Sonata extends Car {
   Sonata() {
      super("Sonata");
   }
   @Override
   public void start() {
      System.out.println(name + " 시동을 켭니다");
   }
   @Override
   public void drive() {
      System.out.println(name + " 달립니다");
   }
   @Override
   public void stop() {
      System.out.println(name + " 멈춥니다");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " 시동을 끕니다");
   }
   public void clean() {
	   System.out.println("세차를 합니다");
   }
}
class Grandeur extends Car {
   Grandeur() {
      super("Grandeur");
   }
   @Override
   public void start() {
      System.out.println(name + " 시동을 켭니다");
   }
   @Override
   public void drive() {
      System.out.println(name + " 달립니다");
   }
   @Override
   public void stop() {
      System.out.println(name + " 멈춥니다");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " 시동을 끕니다");
   }
   public void clean() {
	   System.out.println("세차를 합니다");
   }
}
class Avante extends Car {
   Avante() {
      super("Avante");
   }
   @Override
   public void start() {
      System.out.println(name + " 시동을 켭니다");
   }
   @Override
   public void drive() {
      System.out.println(name + " 달립니다");
   }
   @Override
   public void stop() {
      System.out.println(name + " 멈춥니다");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " 시동을 끕니다");
   }
   public void clean() {
	   System.out.println("세차를 합니다");
   }
}
class Genesis extends Car {
   Genesis() {
      super("Genesis");
   }
   @Override
   public void start() {
      System.out.println(name + " 시동을 켭니다");
   }
   @Override
   public void drive() {
      System.out.println(name + " 달립니다");
   }
   @Override
   public void stop() {
      System.out.println(name + " 멈춥니다");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " 시동을 끕니다");
   }
   public void clean() {
	   System.out.println("세차를 합니다");
   }
}

public class Test04_different  {

   public static void main(String[] args) {
      ArrayList<Car> carList = new ArrayList<Car>();
      
      carList.add(new Sonata());
      carList.add(new Grandeur());
      carList.add(new Avante());
      carList.add(new Genesis());
      
      for (Car car : carList) {
         car.run();
         System.out.println("=====================");
      }
      
   }

}