package javaPractice.ch_05_for;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 합계 구하기
		
		int sum = 0 ;
		for(int i = 1; i<=10; i++) {
			System.out.println("i = " + i + ", sum = " + (sum += i));
		}
	}

}
