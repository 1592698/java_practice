package javaPractice.ch_08_class;

public class Tv {

	//Tv �� �Ӽ�(�������)
	String color; //�Ӽ�
	boolean power; // �������� on off
	int channel; //ä��
	
	//Tv�� ��� (�޼ҵ�)
	
	void power() {
		power = !power; //Tv�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
	}
	void channelUp() { //Tv�� ä���� ���̴� ����� �ϴ� �޼���
		++channel; 
	}
	void channelDown() { //Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}
}
