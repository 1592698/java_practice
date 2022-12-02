package javaPractice.ch_14_exeption;

/**/
class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}
public class Test14 {
	public static void ticketing(int age)throws AgeException{ 
		if(age<0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�");
			
		}
}
	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}

}}