package javaPractice.ch_10_polymorphism;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*instanceof ������
		 * instanceof B: a�� B�� ��ü�̴�*/
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) { // fe�� FireEngine�� ��ü�̴�
			System.out.println("This is FireEngine instance.");
		}
		if(fe instanceof Car) { //fe�� Car�� ��ü�̴�
			System.out.println("This is a car instance.");
		}
		if(fe instanceof Object) { //fe �� object�� ��ü�̴�
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		
		
		Car polyFe = new FireEngine(); //������ ����ؼ� ���� ���� ����
		if(polyFe instanceof FireEngine) { //polyFe FireEngine�� ��ü�̴�
			System.out.println("This is a FireEngine instance.");
		}
		if(polyFe instanceof Car) { //polyFe�� Car�� ��ü�̴�.
			System.out.println("This is a an Object instance.");
		}
		if(polyFe instanceof Object) { //polyFe �� Object�� ��ü�̴�
			System.out.println("This is Object instance");
		}
		
		
		System.out.println();
		
		Car car = new Car(); //�θ� Ŭ������ ��ü ����
		if(car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(car instanceof Car) { //car�� Car�� ��ü�̴�
			System.out.println("This is Car instance.");
		}
		if(car instanceof Object) { //car�� Object�� ��ü�̴�
			System.out.println("This is an Object instance");
		}
	}

}
