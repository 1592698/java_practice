package javaPractice.ch_03;

public class Test01 {
	public static void main(String[] args) {
		
		/*증감연산자
		 * 단독으로 사용을 할 때는 전위나 후위나 값이 동일
		 */
		
		int i=5;
		i++; //i = i + 1;과 같은 의미. ++i로 바꿔 써도 결과같음
		System.out.println(i); 
		
		i=5; //결과를 비교하기 위해 i값을 다시 5로 설정
		++i;
		System.out.println(i);
	}
}
