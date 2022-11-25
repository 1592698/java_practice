package javaPractice.ch_03;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j = i++; 실행 후, i=" + i +", j=" +j);
		//i=6, j=5
		//결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j = i++; 실행 후, i=" + i +", j=" +j);
		//i=6, j=6
	}

}
