package javaPractice.ch_10_question_tv;

import java.util.ArrayList;

public class Test {


	int money = 1000; //소유금액
	int bonusPoint = 0; // 보너스 점수

	// 환불 기능을 추가하기 위해 배열 ArrayList로 저장되는 데이터 타입 변경
	ArrayList item = new ArrayList(); //구입한 제품을 저장하는데 사용될 ArrayList 객체
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족해서 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		
		// 환불 기능을 추가하기 위해 배열 ArrayList로 저장되는 데이터 타입 변경
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p) { // 구입한 제품을 환불한다.
		if(item.remove(p)) { // 제품을 ArrayList에서 제거한다.
			money +=p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+ "을/를 반품하셨습니다");
		}
		else { //제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다");
		}
	}
	
	// 추가된 제품 저장 기능 메소드
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여줌
		int sum= 0;
		String itemList ="";
		
		if(item.isEmpty()) {// Vector가 비어있는지 확인함
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		// Vector의 i번째에 있는 객체를 얻어옴
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum+=p.price;
			itemList +=(i==0) ? "" + p: "," + p;
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만 원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}

}
