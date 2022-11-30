package javaPractice.ch_12_interface_shoppingmall;

//���θ� ��ǰ ���Ǹ� ���� �߻�Ŭ����,
//�پ��� ��ǰ ������ �����ϱ� ���� �⺻ ���� ���� �� ��¸� �߻�Ŭ�������� �����ϰ�
//�߰� ������ ���� Ŭ�������� �����ϵ��� ������
public abstract class Product {

	String pname; //��ǰ��
	int price; //����
	int inch; //��ġ�� �߰��ڵ�
	String brand; //������ �߰� �ڵ�
	String productCode; //��ǰ �ʼ� ������ ��ǰ�ڵ� �߰� �ڵ�
	
	//��ǰ��� ������ ����ϴ� �⺻���� ��� �޼���
	//��ǰ�� �⺻ ������ ��ǰ �̸��� ������ ���
	//�� ������ ����Ϸ��� printExtra()�޼��带 ȣ��
	public void printDetail() {
		System.out.print("��ǰ��: " +pname+ ",");
		System.out.print("����: " +price +",");
		
		printExtra();
	}
	
	//�߻� �޼���. ���� ������ ���� Ŭ�������� ��
	//printDetail()���� �ڵ����� ȣ���ϹǷ�, printDetail()���� ������ ���뵵 �ڵ����� �Բ� ���
	public abstract void printExtra();
}
