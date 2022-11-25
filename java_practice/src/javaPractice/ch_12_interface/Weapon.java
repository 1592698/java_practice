package javaPractice.ch_12_interface;

public interface Weapon {

	public void fire(int power); //�Ķ���� �Ŀ��� ����߻�
	public int getRestPower(); //���� ���� �ִ� �Ŀ� ����
	public void charge(int power); //�Ķ���͸�ŭ ���� �Ŀ� ����
}
/*���� ���α׷����� �־��� ���� �������̽��� �̿���
 * �ڽŸ��� ���� Ŭ���� (MyWeapon)�� �������϶�
 * ��, ���� Ŭ������ int curPower �ʵ尡 �ְ�,
 * fire()�� curpower���� power��ŭ �����ϰ�
 * charge()�� power��ŭ curPower�� ���� ��Ų��*/
 
class MyWeapon implements Weapon{
	private int curPower=0;
	@Override
	public void fire(int power) {		
		this.curPower -=power;	
	}
	@Override
	public int getRestPower() {	
		return curPower;
	}
	@Override
	public void charge(int power) {
		this.curPower +=power;	
	}
}
