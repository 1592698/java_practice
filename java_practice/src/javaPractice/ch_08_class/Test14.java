package javaPractice.ch_08_class;
class Check{
	//instanceVariable : iv
	//classVariable : cv
	//instanceMethod: im
	//classMethod: cm
	
	static int cv =5; //Ŭ���� ����
	int iv = 4; //�ν��Ͻ� ����
	static void cm() { //Ŭ���� �޼���
		
	}
	void im() { //�ν��Ͻ� �޼���
		
	}
	
	static void cm_Imember() { //Ŭ���� �޼��尡 �ν��Ͻ� ����� ����
		//System.out.println(iv); //�����߻�
		//im(); //�����߻�
	}
	
	void im_cmember() {
		//�ν��Ͻ� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmember() {
		//Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		//�ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Check.im_Imember(); //����
		Check.cm_Cmember(); //����
		
		Check myinstanceCheck = new Check();
		myinstanceCheck.im_cmember(); //����
		myinstanceCheck.im_Imember(); //����
		
	}

}
