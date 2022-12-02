package javaPractice.ch_14_exeption;

public class Test10 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		

		try {
			System.out.println("arr[2]= " + arr[2]);
			System.out.println("arr[3]= " + arr[3]); //예외발생
			System.out.println("arr 출력완료");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("에러");
		}
		System.out.println("try/catch 구문 밖 문장 수행");
	}

}
