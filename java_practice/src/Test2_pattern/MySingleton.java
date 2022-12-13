package Test2_pattern;

public class MySingleton {

	public static void main(String[] args) {
		/*4. 외부에서 사용하는 코드 만들기
		 * 외부 클래스에서 Company를 생성할 수 없으므려 static으로 제공되는
		 * getInstance() 메서드를 호출
		 * */
		
		Company company1 = Company.getInstance(); //클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
		Company company2 = Company.getInstance();
		
		/*Company company = new Company();
		 * Company 바깥이라서 생성자가 안보여서 이방법으로 객체 생성 ㄴㄴ
		 *  객체 생성할려면 getInstance(); 사용
		 */
		//Company company = new Company();
		System.out.println(company1==company2); //두 변수가 같은 주소인지 확인
		//true
		System.out.println(company1); 
		//javaPractice.ch_18_pattern.Company@379619aa
		System.out.println(company2);
		//javaPractice.ch_18_pattern.Company@379619aa
	}

}
