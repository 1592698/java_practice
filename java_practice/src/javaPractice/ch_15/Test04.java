package javaPractice.ch_15;


/*������ �������� �����ϸ� ���� ���簡 �Ǳ� ������ ���� ����� ����Ŵ
 * �������� �纻�� ���� ���� clone() �޼��带 ���
 * ������ �纻�� ����� ���纻�� ����*/

class Point{ //������ �ǹ��ϴ� PointŬ����
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x = " + x + "," + "y = " +y;
	}
}
class Circle implements Cloneable { //��ü�� �����ص� �ȴٴ� �ǹ̷� Cloneable �������̽��� �Բ� ����
	//Cloneable�� �����ؾ� ���� ����
	Point point;
	int radius;
	
	Circle(int x , int y, int radius){
		point = new Point(x,y);
		this.radius = radius;
	}
	public String toString() {
		return "������ " +point + "�̰�, " + "��������" + radius + "�Դϴ�.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// clone() �޼��带 ��� �� �� �߻��� �� �ִ� ������ ����
		return super.clone();
	}
	
}
public class Test04 {
	public static void main(String[] args) throws CloneNotSupportedException{
		/*
		 * Object clone(): ��ü�� �����Ͽ� ������ ��� ������ ���� �ν��Ͻ��� ����
		 * ��ü�� ������ �� �ٸ� ��ü�� ��ȯ
		 * ��ü ������ ������ ���� ���纻�� ����Ѵٰų�, �⺻ Ʋ(prototype)�� ���纻�� �����
		 * ������ �ν��Ͻ��� ����� ������ ���������� ������ �Ϸ��� ��� ���
		 * */
		
		//clone()�޼���� �ν��Ͻ� �����ϱ�
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle)circle.clone(); 
		//clone() �޼��带 ����� circle �ν��Ͻ��� copyCircle�� ����
		
		//���� ����
		System.out.println(circle); //������ x=10, y=20�̰�, �������� 30�Դϴ�
		System.out.println(copyCircle); //������ x=10, y=20�̰�, �������� 30�Դϴ�
		
		//�ּ� ���� �ٸ�.
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
