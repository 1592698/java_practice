package javaPractice.ch_16_arraylist;

import java.util.Stack;

//Stack�� �̿��� ���� ���̽�
class Coin{ //���� ���̽��� ������ Ŭ����
	private int value;
	public Coin(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
public class Test06 {

	//stack�� �̿��� ���� ���̽�
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//������ ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {//���� ���̽��� ������� Ȯ��
			Coin coin = coinBox.pop(); //���� ���̽����� ���� ���� ������ ����
			System.out.println("�ų��� ���� : " + coin.getValue()+"��");
		}
		
		/*
		 * �ų��� ���� : 10��
			�ų��� ���� : 100��
			�ų��� ���� : 50��
			�ų��� ���� : 100��
			*/
	}

}
