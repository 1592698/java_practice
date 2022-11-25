package javaPractice.ch_10_object;

class User {
	public String name;
	public int age;
	
	User(String name, int age){ //매개변수를 가진 생성자
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
	}
	
	
	
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("철수", 20); //인스턴스 생성
		User user2 = new User("영희", 19); //인스턴스 생성
		
		System.out.println(user1.name + "의 나이는 " + user1.age);
		user2.setAge(30);

		System.out.println(user2.name + "의 나이는 " + user2.age);

	}

}
