package javaPractice.ch_12_interface_shoppingmall;


//Product Ŭ������ ��ӹ޴� Ŭ������, ����ƮTV�� ��ǰ ������ ����ϴ� �� �ʿ�
public class SmartTv extends Product{
	String resolution; //�ػ�
	
	public SmartTv(String pname, int price, String resolution, int inch, String productCode) {
		//�����ڷ�, ��ǰ�̸��� ����, �ػ� ������ �޾Ƽ� ó��
		
		
		
		this.pname = pname;
		this.price=price;
		this.resolution=resolution;
		this.inch=inch; //inch�� �߰�
		this.productCode=productCode;
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		//�߻� Ŭ������ ���ǵ� �߻� �޼��带 �������̵�
		//�߰� ������ �ػ� ������ ���
		
		System.out.print(" �ػ�: " +resolution +",");
		System.out.print(" ��ġ: " +inch +","); //��ġ�� �߰��ڵ�
		System.out.println(" ��ǰ �ڵ�: " + productCode);
		
	}
	

}
