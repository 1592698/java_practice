package javaPractice.ch_12_interface;


/* �־��� �ڵ带 �������� ���� �������� ���� MyWeapon�� ����ϴ� 
 * GameUnit Ŭ������ �����ڿ� attact() �޼��带 �ϼ��϶�.
 * GameUnit �ν��Ͻ��� �� �� �����Ѵ�. unitPower�� �� ���ֿ� ���޵Ǵ�
 * �⺻ power�� ���⸦ ��� �� �� �����ȴ�.
 * bossPower�� Ŭ���� ������ �����Ǵ� ��� GameUnit �ν��Ͻ��� �����Ѵ�
 * �� ���ֿ����� �������� bossPower�� 0���ϰ� �Ǹ� 
 * ������ ������.(System.exit(1)).
 * �����ڿ����� �Ķ���ͷ� �� ������ �̸��� �޾� �ʱ�ȭ �ϰ�,
 * ���� �ν��Ͻ��� ����� unitPower�� ���� �����Ѵ�.
 * */
public class GameUnit{
	static int bossPower = 1000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;
	int power;
	
	//GameUnit�� �����ڸ� ���� �϶�
	GameUnit(){};
	
	GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	//attact(int power)�޼ҵ带 �����϶�
	//void attact(int power)�� �ϸ� bossPower���� power��ŭ �����ϰ�
	//bossPower�� 0���ϰ� �Ǹ� ���� �¸��ϰ� System.exit(0) ���α׷� ����
	public static int getBossPower() {
		return bossPower;
	}
	void attact(int power) {
//		GameUnit.bossPower -=power;
		bossPower = bossPower-power;
		
//		System.out.println("���� bossPower : " + GameUnit.bossPower);
		if(bossPower<=0) {
			System.out.println("�¸�!" + name +"���� �¸��Ͽ����ϴ�.");
			System.exit(0);
		}	
		else {
			System.out.println("����! bossPower:" + bossPower);
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
