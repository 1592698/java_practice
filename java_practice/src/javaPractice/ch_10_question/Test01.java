package javaPractice.ch_10_question;


class Employee {
	private int baseSalary = 3000000; //�⺻��
	int getSalary() {
		return baseSalary;
	}
}
class Manager extends Employee {
	private int salary = 2000000;
	@Override
	int getSalary() {
		return(super.getSalary() + salary);
	}
	
}
class Programer extends Employee {
	
	private int salary = 3000000;
	@Override
	int getSalary() {
		
		return(super.getSalary() + salary);
	}
	
}

/*�Ϲ� ������ Employee Ŭ������ �𵨸��Ѵ�
 * Employee Ŭ������ ��ӹ޾Ƽ� �����ڸ� ��Ÿ���� Manager Ŭ������ 
 * ���α׷��Ӹ� ��Ÿ���� Programer Ŭ������ �ۼ��Ѵ�
 * Employee Ŭ���� �ȿ��� ������ ����ϴ� getSalary() �޼��尡 �ִ�
 * �� �޼��带 Manager Ŭ������ Programer Ŭ�������� �������̵��ؼ� �� ���޺��� �ٸ� ������ ��ȯ�ϵ��� �Ѵ�
 * �������̵��� �� �� Employee Ŭ������ baseSalary�� ����϶�*/
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager manager = new Manager();
		System.out.println("�������� ���� : " + manager.getSalary());
		
		Programer pr = new Programer();
		System.out.println("���α׷����� ���� : " + pr.getSalary());
	}

}
