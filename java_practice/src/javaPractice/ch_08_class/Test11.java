package javaPractice.ch_08_class;

public class Test11 {

	public static void main(String[] args) {
		
		
		String chulsooAccountName ="ö��";
		String chulsooAccountNo ="123456";
		long chulsooAccountBalance =1000;
		
		String youngheeAccountName ="����";
		String youngheeAccountNo ="654321";
		long youngheeAccountBalance =200;
		
		chulsooAccountBalance -=200;
		youngheeAccountBalance +=100;
		
		System.out.println("ö���� ���� ");
		System.out.println("     ���¸��� : " +chulsooAccountName);
		System.out.println("     ���¹�ȣ : " +chulsooAccountNo);
		System.out.println("     �����ܰ� : " +chulsooAccountBalance);
		
		System.out.println("������ ���� ");
		System.out.println("     ���¸��� : " +youngheeAccountName);
		System.out.println("     ���¹�ȣ : " +youngheeAccountNo);
		System.out.println("     �����ܰ� : " +youngheeAccountBalance);
	
		
//		MyAccount chulsoo;
//		chulsoo=new MyAccount();
//		
//		MyAccount younghee = new MyAccount();
//		
//
//		chulsoo.printAccount();
//		younghee.printAccount();
	}

}
class Account{
	
}


