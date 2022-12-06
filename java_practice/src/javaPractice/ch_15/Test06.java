package javaPractice.ch_15;

/*
Class Ŭ����
�ڹ��� ��� Ŭ������ �������̽��� ������ �ǰ��� class ���Ϸ� ����
java ������ �����ϵǸ� class ������ �����ǰ�, 
�� ���Ͽ��� Ŭ������ �������̽��� ���� ����, �޼ҵ�, ������ ���� ������ �������
Class Ŭ������ �����ϵ� class ���Ͽ� ����� Ŭ������ �������̽� ������ �������� �� ���

��Ȳ�� ���� ���� �۾����� ���� Ŭ������ ����ؾ� �� ���� �ְ�,
��ȯ �޴� Ŭ������ ��Ȯ�� � �ڷ������� �𸣴� ��찡 ����
�𸣴� Ŭ������ ������ ����� ���, �츮�� Ŭ������ ������ ���� ã�ƾ� ��
*/

class Person {
   private String name;
   private int age;
   
   public Person() {}

   public Person(String name) {
      super();
      this.name = name;
   }

   public Person(String name, int age) {
      super();
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
            
}

public class Test06 {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub

		/*forName() �޼��忡�� �߻��ϴ� ���ܸ� ó����.
		 * �̸��� ��ġ�ϴ� Ŭ������ ���� ��� ClassNotFoundException �߻�
		 * 
		 * class Ŭ������ �����ϰ� Ŭ���� ������ �������� ����� 3����
		 * 1.Ojbect Ŭ������ getClass() �޼��� ����ϱ�
		 * String s = new String();
		 * Class c = s.getClass(); //getClass() �޼����� ��ȯ���� Class
		 * 
		 * 2.Ŭ���� ���� �̸��� Class ������ ���� �����ϱ�
		 * Class c = String.Class;
		 * 
		 * 3.Class.forName("Ŭ���� �̸�") �޼������ϱ�
		 * Class c = Class.forName("java.lang.String");*/
		
		Person person = new Person();
		Class pClass1 = person.getClass(); //Object�� getClass() �޼��� ����ϱ�
		System.out.println(pClass1.getName());
		//javaPractice.ch_15_.Person
		Class pClass2 = Person.class; //���� class ���� �����ϱ�
		System.out.println(pClass2.getName()); 
		//javaPractice.ch_15_.Person
		Class pClass3 = Class.forName("javaPractice.ch_15_.Person"); //Ŭ���� �̸����� ��������
		System.out.println(pClass3.getName());
		//javaPractice.ch_15_.Person
	}

}
