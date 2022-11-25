package javaPractice.ch_12_interface;


/* 주어진 코드를 바탕으로 이전 문제에서 만든 MyWeapon을 사용하는 
 * GameUnit 클래스의 생성자와 attact() 메서드를 완성하라.
 * GameUnit 인스턴스는 두 개 생성한다. unitPower는 각 유닛에 공급되는
 * 기본 power로 무기를 사용 할 때 차감된다.
 * bossPower는 클래스 변수로 생성되는 모든 GameUnit 인스턴스에 공유한다
 * 두 유닛에서는 공격으로 bossPower가 0이하가 되면 
 * 게임이 끝난다.(System.exit(1)).
 * 생성자에서는 파라미터로 각 유닛의 이름을 받아 초기화 하고,
 * 무기 인스턴스를 만들어 unitPower로 무기 충전한다.
 * */
public class GameUnit{
	static int bossPower = 1000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;
	int power;
	
	//GameUnit의 생성자를 정의 하라
	GameUnit(){};
	
	GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	//attact(int power)메소드를 정의하라
	//void attact(int power)을 하면 bossPower에서 power만큼 제거하고
	//bossPower가 0이하가 되면 게임 승리하고 System.exit(0) 프로그램 종료
	public static int getBossPower() {
		return bossPower;
	}
	void attact(int power) {
//		GameUnit.bossPower -=power;
		bossPower = bossPower-power;
		
//		System.out.println("현재 bossPower : " + GameUnit.bossPower);
		if(bossPower<=0) {
			System.out.println("승리!" + name +"님이 승리하였습니다.");
			System.exit(0);
		}	
		else {
			System.out.println("공격! bossPower:" + bossPower);
		}
	}
	public static void main(String[] args) {
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		
		while(true) {
			unit1.attact(50);
			unit2.attact(10);
		}	
	}

}
