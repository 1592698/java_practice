package javaPractice.ch_12_interface_shoppingmall;

//���θ� �԰��� ������ �������̽�, ��� ���θ��� IShop �������̽��� �����ؾ���
public interface IShop {
	//���θ� Ŭ������ ���� �� �� �����ؾ��ϴ� �߻� �޼���
	
	public abstract void setTitle(String title); //���θ� ����(�̸�)�� ����
	public abstract void genUser(); // ���θ��� �̿� �� �� �ִ� ���� ����ڵ��� ����
	public abstract void genProduct(); //���θ��� ���� ��ǰ�� ����
	public abstract void start(); //���θ� ���α׷��� �����ϴ� ���� �޼���
	

	
	}

