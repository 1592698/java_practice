package javaPractice.ch_08_class;

public class Test11 {

	public static void main(String[] args) {
		
		
		String chulsooAccountName ="Ã¶¼ö";
		String chulsooAccountNo ="123456";
		long chulsooAccountBalance =1000;
		
		String youngheeAccountName ="¿µÈñ";
		String youngheeAccountNo ="654321";
		long youngheeAccountBalance =200;
		
		chulsooAccountBalance -=200;
		youngheeAccountBalance +=100;
		
		System.out.println("Ã¶¼öÀÇ °èÁÂ ");
		System.out.println("     °èÁÂ¸íÀÇ : " +chulsooAccountName);
		System.out.println("     °èÁÂ¹øÈ£ : " +chulsooAccountNo);
		System.out.println("     ¿¹±İÀÜ°í : " +chulsooAccountBalance);
		
		System.out.println("¿µÈñÀÇ °èÁÂ ");
		System.out.println("     °èÁÂ¸íÀÇ : " +youngheeAccountName);
		System.out.println("     °èÁÂ¹øÈ£ : " +youngheeAccountNo);
		System.out.println("     ¿¹±İÀÜ°í : " +youngheeAccountBalance);
	
		
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


