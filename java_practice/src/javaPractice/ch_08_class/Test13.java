package javaPractice.ch_08_class;


class Area{
	static void manual() {
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.print("triangle : �ﰢ�� ���� ");
		System.out.print("rectangle : �簢�� ���� ");
		System.out.println("�Դϴ�");
	}
	
	double triangle(int a , int b) {//�ﰢ�� ���̸� ��ȯ�ϴ� �޼���
		return (double) a * b/2;
	}
//	static double triangle(int a , int b) {//�ﰢ�� ���̸� ��ȯ�ϴ� �޼���
//		return (double) a * b/2;
//	} static �ٿ����� ������ �Ȼ���
	
	int rectangle(int a, int b) {//�簢�� ���̸� ��ȯ�ϴ� �޼���
		return a*b;
	}
}

public class Test13 {

	/*Ŭ���� �޼���� ��ü�� �������� �ȾƵ� ȣ���� ����
	 * �ν��Ͻ� �޼���� ��ü�� �����ؾ߸� ȣ���� ����
	 * �ֳ��ϸ� �ν��Ͻ� �޼���� ��ü�� �����Ǿ�� �޸𸮻� ������ �����ϰ�
	 * Ŭ���� �޼���� Ŭ������ �޸𸮿� �ö󰥶� �����Ǳ� ����*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.manual(); //Ŭ���� �޼��� ���� ����
		//Area.triangle(3,5)// ���� �߻�
		//Area.rectangle(3,5) // �����߻�
		
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
		
		
	}

}
