package javaPractice.ch_05_for;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요 */
		
//방법1
		for (int i=1; i<=4; i++) {
			for(int j=1; j<=(4-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j <=i; j++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
	

//방법2
		for(int i=4; i>=1; i--) //4 3 2 1
	     { 
	        for(int j=1;j< i;j++)  
	         { 
	            System.out.print(" "); 
	        } 
	        for(int j=4;j>=i;j--) //  4>=4 : 1, 4>=3 : 2,  4>=2 : 3 , 4>=1: 4
	         { 
	            System.out.print("*"); 
	        } 
	        System.out.println(); 
	    } 

	}

}
