package javaPractice.ch_15;

/*GennericTypeTest
 * ���ʸ�(Generic): �Ϲ�ȭ, ����ȭ��� �ǹ̷�.
 * Ŭ������ �޼��忡�� ����ϴ� �ʵ峪 �Ű������� �ڷ���(Ŭ������)�� ȣ���ϴ� �ʿ��� �������� �ϴ� ���*/

class CommonData<T> { 
	//�Ϲ����� ������δ� Ŭ�������� �̸� ������ Ÿ���� �����ؾ� ������ ���׸��� ����ϸ� ȣ���ϴ� �ʿ��� ������ Ÿ���� ����
	private T data; //������ Ÿ������ T�� ����. Type�� ����. Ŭ���� ���𿡼� <>���̿� �ٸ� ���ڸ� �־ ��
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data= data;
	}
}
public class Test18 {

	public static void main(String[] args) {
		CommonData<String> stringCommonData = new CommonData<String>();
		//ȣ�� �ϴ� �ʿ��� Ÿ���� ����
		CommonData<Integer> integerCommonData = new CommonData<>();
		//�����ϸ鼭 Ÿ���� �����ϸ� �����ڿ��Դ� Ÿ���� ���� ����
		
		stringCommonData.setData("abc");
		integerCommonData.setData(100);
		System.out.println("StringCommonData : " + stringCommonData.getData());
		//StringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());
		//integerCommonData : 100
	}

}
