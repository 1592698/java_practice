package javaPractice.ch_08_class;

class MyStudent { //�޼���� ���� Ŭ����
	String name; //�̸�
	int grade; //�г�
	int kor; //���� ����
	int eng; //���� ����
	int math; //���� ����
	
	
	void printStudent() {
		//���� �ϳ��� �л� �� ���� ���� �ຸ�� ���� �� �� ����
		System.out.println(name+"�� "+grade 
			+"�г��̰�, ������� " + kor + "���Դϴ�.");
	}
}


public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MyStudent student1 = new MyStudent(); //class�� �𵨷� �ϴ� ��ü ����
	//�Ϲ����� �����Ϳ� Ÿ���� �޶� ��ü��� ��
	//���� �ϳ��� �л� �� ���� ���� ������ ���� �� �� ����
	
	student1.name="�����";
	student1.grade=2;
	student1.kor=100;
	student1.eng=90;
	student1.math=80;
	
	MyStudent student2 = new MyStudent(); //class�� �𵨷� �ϴ� ��ü ����
	student2.name="�ڸ��";
	student2.grade=1;
	student2.kor=90;
	student2.eng=80;
	student2.math=70;
		
		
	student1.printStudent();//����̴� 2�г��̰� ���� ������ 100 ���Դϴ�
	student2.printStudent(); //�ڸ���� 1�г��̰� ���� ������ 90���Դϴ�
	}

	
}
