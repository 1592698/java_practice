package javaPractice.ch_08_class;


public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t; //TV �ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		
		t = new Tv(); 
		t.channel =7; 
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�"); 
	}

}
