
package javaPractice.ch_11_abstract;

abstract class pokemon {

		String name;
		
		abstract void attact();
		//공격 추상메서드 구체적인 내용이 없으므로 괄호 '{ }'를 생랼가호 세미콜론 ; 을 붙여줌
		abstract void sound(); //소리 추상 메서드
		
		public String getName() { //포켓몬의 이름을 리턴하는 메서드
			return this.name;
		}
}		
class Pikachu extends pokemon { //피카츄 클래스
	Pikachu() { //이름을 지정하는 생성자
		this.name = "피카츄";
	}
	void attact() { //구체적인 구현
		System.out.println("전기 공격");
		
	}
	void sound() {
		System.out.println("피카피카!");
	}
}

class Squirtle extends pokemon{
	Squirtle(){ 
		this.name = "꼬부기";
		
	}
	void attact() {
		System.out.println("물 공격");
	}
	void sound() {
		System.out.println("꼬북 꼬북");
	}
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포켓몬은 " + pikachu1.getName());
		pikachu1.attact();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("이 포켓몬은" + squirtle1.getName());
		squirtle1.attact();
		squirtle1.sound();
		
	}

}
