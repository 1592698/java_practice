package javaPractice.ch_10_question;


public class Test10_pet {
	private String name; //애완동물의 이름
	private String masterName; //주인의 이름
	
	public Test10_pet(String name, String masterName) {
		this.name= name; //애완동물의 이름
		this.masterName = masterName; //주인의 이름
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	public void introduce() { //자기소개
		System.out.print("내 이름은 " + name + "입니다.");
		System.out.print("  주인님은 " + masterName + "입니다.");
	}
	
}
