package javaPractice.ch_10_final;


final class FinalClass{
	final int number= 4; //���
}

class Parents //extends FinalClass //�����߻�
{
	final void finalMethod() { //�������̵� �Ұ��� �޼���
		System.out.println("��� �Ұ��� �޼���");
	}
}

class Son extends Parents{
	//void finalMethod() {}//�����߻�
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		//member1.number = 3; // ����� ���� �Ұ�
	}

}
