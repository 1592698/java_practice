package javaPractice.ch_09_constructor;


class User2 {
	private String name;
	private int age;
	
	User2(String name, int age){ // 매개변수를 가진 생성자
		this.name= name;
		this.age= age;
	}
	
	public int getAge() { 
		//private는 함부로 값변경 못함 하려면 메서드를 통해서 해야함 
		//메서드도 private걸어두는게 관리 편함 클래스내에서만 사용되기때메 바깥쪽에서 사용 못함 public이면 수정 힘듦
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
}
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	User2 user1 = new User2("철수", 20); //인스턴스 생성
	User2 user2 = new User2("영희", 19); //인스턴스 생성
	
	//user2.age = 99; //에러발생. 직접적 접근 불가
	
	user2.setAge(20);
	System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}

}
