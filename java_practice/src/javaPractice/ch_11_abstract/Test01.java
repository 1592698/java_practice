
package javaPractice.ch_11_abstract;

abstract class pokemon {

		String name;
		
		abstract void attact();
		//���� �߻�޼��� ��ü���� ������ �����Ƿ� ��ȣ '{ }'�� ���U��ȣ �����ݷ� ; �� �ٿ���
		abstract void sound(); //�Ҹ� �߻� �޼���
		
		public String getName() { //���ϸ��� �̸��� �����ϴ� �޼���
			return this.name;
		}
}		
class Pikachu extends pokemon { //��ī�� Ŭ����
	Pikachu() { //�̸��� �����ϴ� ������
		this.name = "��ī��";
	}
	void attact() { //��ü���� ����
		System.out.println("���� ����");
		
	}
	void sound() {
		System.out.println("��ī��ī!");
	}
}

class Squirtle extends pokemon{
	Squirtle(){ 
		this.name = "���α�";
		
	}
	void attact() {
		System.out.println("�� ����");
	}
	void sound() {
		System.out.println("���� ����");
	}
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pikachu pikachu1 = new Pikachu();
		System.out.println("�� ���ϸ��� " + pikachu1.getName());
		pikachu1.attact();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("�� ���ϸ���" + squirtle1.getName());
		squirtle1.attact();
		squirtle1.sound();
		
	}

}
