package javaPractice.ch_16_arraylist;

import java.util.Stack;

//Stack을 이용한 동전 케이스
class Coin{ //동전 케이스를 구현한 클래스
	private int value;
	public Coin(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
public class Test06 {

	//stack을 이용한 동전 케이스
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전을 깨움
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {//동전 케이스가 비었는지 확인
			Coin coin = coinBox.pop(); //동전 케이스에서 제일 위의 동전을 꺼냄
			System.out.println("거내온 동전 : " + coin.getValue()+"원");
		}
		
		/*
		 * 거내온 동전 : 10원
			거내온 동전 : 100원
			거내온 동전 : 50원
			거내온 동전 : 100원
			*/
	}

}
