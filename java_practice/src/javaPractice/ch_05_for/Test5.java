package javaPractice.ch_05_for;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요
		
		//방법 1
		int sum=0;
		for(int i=1; i<101; i++) {
			if(i % 3 ==0) {
				sum +=i;
			}
		}
		System.out.println("3의 배수의 총합: "+sum);
		
		//방법2
//		int sum =0;
//		for(int i=3; i<=100; i +=3) {
//			sum +=i;
//		}
//		System.out.println("3의 배수의 총합: "+sum);
	}

}
