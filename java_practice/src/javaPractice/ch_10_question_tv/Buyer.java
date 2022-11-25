package javaPractice.ch_10_question_tv;

public class Buyer { //고객, 물건을 사는 사람
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스 점수

	/*수정
	 * 구매한 물품을 저장하는 기능 추가
	 * 구매한 물품에 대한 정보를 요약해서 보여주는 기능 추가*/
	
	//추가 코드 두줄
	Product[] item = new Product[10]; //구입한 제품을 저장하기 위한 배열
	int i=0; //Product배열에 사용될 카운터
	
	
	
	void buy(Product p) { //부모 클래스 타입으로 매개변수 받음
		//부모 클래스의 필드 사용, price, bonusPoint
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
		return;
		}
		money -=p.price; //가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint;  //제품의 보너스 점수를 추가한다
		item[i++] = p; //추가코드		
		System.out.println(p+"을/를 구입하셨습니다");
	}
	
	
	void summary() { //구매한 물품에 대한 정보를 요약해서 보여준다
		int sum =0; //구입한 물품의 가격합계
		String itemList = ""; //구입한 물품목록
//방법 1	
//		for(int i=0; i<item.length; i++) {
//			if(item[i]==null) 
//				break;
//			
//				sum +=item[i].price;
//				itemList+=(item[i]+ ", ");			
//		}
//방법 2		
//		for(Product p : item) {
//			if(p == null) {
//				break;
//			}
//				sum +=p.price;
//				itemList += p + ", ";
//		}
//방법 3
		for(int i=0; i<this.i; i++) {
			sum +=item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
