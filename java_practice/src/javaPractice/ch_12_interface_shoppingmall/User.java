package javaPractice.ch_12_interface_shoppingmall;

import java.util.Scanner;

public class User {

	/*���θ� ������� �⺻���� ������ �����ϰ� �����ϴ� ���
	 * ���� UserŬ������ �پ��� ȸ�� ������ �����Ǿ�� ������,
	 * ���⼭�� �̸��� ���� �������� ����� ����*/
	
	private String name; //����� �̸�
	
	private PayType payType; //���� ���� -enum
	
	//�̸��� ���� ������ �Ķ���ͷ� ������ ������
	//�����ڷ� �̸��� ���� ������ �޾� ����
	
	public User(String name, PayType payType) {
	
		this.name=name;
		this.payType=payType;
		
	}
	public String getName() { //������� �̸� ������ ����
	
		return name;
	}
	public void setName(String name) {
		
		this.name=name;
	}
	public PayType getPayType() {
		// TODO Auto-generated method stub
		return payType;
	}
	
	public void setPayType(PayType payType) { //������� ���� ���� ����
		this.payType= payType;
	}
}