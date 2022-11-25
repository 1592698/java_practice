package javaPractice.ch_09_constructor;
class bank{
	private int balance =0;
	final int MAX_BALANCE=1000000;
	final int MIN_BALANCE=0;
	
	
	public void setBalance(int balance) {
		this.balance=(balance < MIN_BALANCE || balance > MAX_BALANCE)? this.balance:balance;		
	}
	public int getBalance() {
		return balance;
	}
}
public class Test11 {
	/*은행 계좌 객체인 Account 객체는 잔고 (balance) 필드를 가지고 있다
	 * balance 필드는 필수값이 올 수 없고, 최대 백만원까지 저장할 수 있다
	 * 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고,
	 * 0~1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성하라
	 * 
	 * 1) Setter의 Getter를 이용한다
	 * 0과 1,000,000의 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용한다
	 * Setter의 매개값이 음수이거나 백만원을 초과하면 전체 balance 값을 유지한다
	 * */
	public static void main(String[] args) {
		bank account =new bank();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " +account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " +account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " +account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " +account.getBalance());	
	}
}

