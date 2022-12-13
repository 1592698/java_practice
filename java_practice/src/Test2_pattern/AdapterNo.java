package Test2_pattern;

/* ����͸� �����ϸ� ��ȯ�� converter��� �� �� ����.
 * ��ȯ���� ������ ���� �ٸ� �� �������̽� ���̿� ����� �����ϰ� �ϴ� ��
 * 
 * ����� ������ ���������� ȣ������ �ʰ� �߰��� ����͸� ���ļ� �޼��带 ȣ���ϵ��� �ϴ� ����
ServiceA�� ServiceB�� �޼��带 runService()��� �ϴ� ���� �̸��� �޼���� ȣ���ؼ� ����� �� �ְ� ���ִ� ��ȯ���Դϴ�.


*/
class ServiceA {
	void runWork() {
		System.out.println("work");
	}
}
class ServiceB {
	void runStudy() {
		System.out.println("study");
	}
}
class AdapterServiceA {
	ServiceA serviceA = new ServiceA();
	void runService() {
		serviceA.runWork();
	}
}
class AdapterServiceB {
	ServiceB serviceB = new ServiceB();
	void runService() {
		serviceB.runStudy();
	}
}
public class AdapterNo {
	public static void main(String[] args) {
		ServiceA serviceA = new ServiceA();
		ServiceB serviceB = new ServiceB();
		
		serviceA.runWork();
		serviceB.runStudy();
		
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		//������ �޼��� ���� ����� �� ����
		asa1.runService();
		asb1.runService();
	}
}
