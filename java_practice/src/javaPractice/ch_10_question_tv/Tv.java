package javaPractice.ch_10_question_tv;

public class Tv extends Product {

	Tv(){
		//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�
		super(100); // Test12_Tv�� ������ 100�������� �Ѵ�
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
