package javaPractice.ch_12_interface;

public interface Weapon {

	public void fire(int power); //파라미터 파워로 무기발사
	public int getRestPower(); //현재 남아 있는 파워 리턴
	public void charge(int power); //파라미터만큼 무기 파워 충전
}
/*게임 프로그램에서 주어진 무기 인터페이스를 이용해
 * 자신만의 무기 클래스 (MyWeapon)을 디자인하라
 * 단, 무기 클래스는 int curPower 필드가 있고,
 * fire()는 curpower에서 power만큼 차감하고
 * charge()는 power만큼 curPower를 증가 시킨다*/
 
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
