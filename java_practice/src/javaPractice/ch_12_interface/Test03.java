package javaPractice.ch_12_interface;

//�������̽� ��� ��� ��
interface Skinnable {
	int BLACK =0; //���� //public static final
	int RED=1; //����
	int GREEN = 2; //���
	int BLUE = 3; //�Ķ�
	int LEOPARD =4; //ǥ�� ����
	
	void changeSkin(int skin); //��Ų ���� public static
}

class PortablePlayer implements Player, Skinnable {
	private int skint = BLACK;
	
	public PortablePlayer() {}//������

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("**�������**");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("**�������**");
	}

	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		System.out.print("��Ų�� ");
		switch(skin) {
		case BLACK : System.out.print("����"); break;
		case RED : System.out.print("����"); break;
		case GREEN : System.out.print("���"); break;
		case BLUE : System.out.print("�Ķ�"); break;
		case LEOPARD : System.out.print("ǥ������"); break;
		default: System.out.print("�⺻��"); break;
		}
		
		System.out.print(" (��)�� �����߽��ϴ�.");
	}
	
	
}
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PortablePlayer a = new PortablePlayer();
		a.play(); //���
		a.stop(); //����
		
		//System.out.println(Skinnable.LEOPARD);
		a.changeSkin(Skinnable.LEOPARD); //��Ų�� ǥ�� ���̷� ����
	}

}
