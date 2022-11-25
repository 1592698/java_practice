package javaPractice.ch_11_abstract;

import java.util.ArrayList;

/*
 * Car �߻� Ŭ������ ��ӹ޴� Sonata, Grandeur, Avante, Genesis Ŭ������ �ֽ��ϴ�.
 * �� ���� �����ϱ� ���� ���� ������ �����Դϴ�.
 *       run() {
 *          start();
 *          drive();
 *          stop();
 *          turnOff();
 *       }
 * 
 * CarTest Ŭ������ ���� ���� ��� ����� ��������
 * Car, Sonata, Grandeur, Avante, Genesis Ŭ������ �����ϼ���.
 * 
 * Sonata �õ��� �մϴ�
 * Sonata �޸��ϴ�
 * Sonata ����ϴ�
 * Sonata �õ��� ���ϴ�
 * =====================
 * Grandeur �õ��� �մϴ�
 * Grandeur �޸��ϴ�
 * Grandeur ����ϴ�
 * Grandeur �õ��� ���ϴ�
 * =====================
 * Avante �õ��� �մϴ�
 * Avante �޸��ϴ�
 * Avante ����ϴ�
 * Avante �õ��� ���ϴ�
 * =====================
 * Genesis �õ��� �մϴ�
 * Genesis �޸��ϴ�
 * Genesis ����ϴ�
 * Genesis �õ��� ���ϴ�
 */

abstract class Car{
   protected String name;
   Car(String name){
      this.name = name;
   }
   public void run() {            // �ݺ������� �����ϱ⿡ �θ� Ŭ������ �־�δ°� ����!
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
      System.out.println(name + " �õ��� �մϴ�");
   }
   @Override
   public void drive() {
      System.out.println(name + " �޸��ϴ�");
   }
   @Override
   public void stop() {
      System.out.println(name + " ����ϴ�");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " �õ��� ���ϴ�");
   }
   public void clean() {
	   System.out.println("������ �մϴ�");
   }
}
class Grandeur extends Car {
   Grandeur() {
      super("Grandeur");
   }
   @Override
   public void start() {
      System.out.println(name + " �õ��� �մϴ�");
   }
   @Override
   public void drive() {
      System.out.println(name + " �޸��ϴ�");
   }
   @Override
   public void stop() {
      System.out.println(name + " ����ϴ�");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " �õ��� ���ϴ�");
   }
   public void clean() {
	   System.out.println("������ �մϴ�");
   }
}
class Avante extends Car {
   Avante() {
      super("Avante");
   }
   @Override
   public void start() {
      System.out.println(name + " �õ��� �մϴ�");
   }
   @Override
   public void drive() {
      System.out.println(name + " �޸��ϴ�");
   }
   @Override
   public void stop() {
      System.out.println(name + " ����ϴ�");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " �õ��� ���ϴ�");
   }
   public void clean() {
	   System.out.println("������ �մϴ�");
   }
}
class Genesis extends Car {
   Genesis() {
      super("Genesis");
   }
   @Override
   public void start() {
      System.out.println(name + " �õ��� �մϴ�");
   }
   @Override
   public void drive() {
      System.out.println(name + " �޸��ϴ�");
   }
   @Override
   public void stop() {
      System.out.println(name + " ����ϴ�");
   }
   @Override
   public void turnOff() {
      System.out.println(name + " �õ��� ���ϴ�");
   }
   public void clean() {
	   System.out.println("������ �մϴ�");
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