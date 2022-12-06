package javaPractice.ch_15;

/*���ʸ��� C++�� ���ø��� ������ ����
 * C++���� �޸� ���׸� ��� Object�� ����ϸ� ��� ������ Ÿ���� ����� �� ������,
 * ��쿡 ���� �� ��ȯ ����� �ؼ� ���׸��� ��ȣ*/

class ObjectData{
	private Object data; //Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��밡��
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data= data;
	}
}
public class Test17 {

	public static void main(String[] args) {
		ObjectData stringCommonData = new ObjectData();
		ObjectData integerCommonData = new ObjectData();
		stringCommonData.setData("abc");//Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��밡��
		integerCommonData.setData(100);
		System.out.println("stringCommonData : " + stringCommonData.getData()); //stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData()); //integerCommonData : 100
		
	}

}
