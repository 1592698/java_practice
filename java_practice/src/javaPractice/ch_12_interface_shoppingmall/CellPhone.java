package javaPractice.ch_12_interface_shoppingmall;

//Product �߻� Ŭ������ ��ӹ޾� ������ CellPhone Ŭ����
public class CellPhone extends Product {
	String carrier;
	
	public CellPhone(String pname, int price, String carrier, String brand, String productCode) {
		this.pname=pname;
		this.price=price;
		this.carrier=carrier;
		this.brand = brand; //������ �߰� �ڵ�
		this.productCode=productCode;
	}

	@Override
	public void printExtra() {
		System.out.print("��Ż�: "+carrier +",");
		System.out.print(" ������: "+brand +",");
		System.out.println(" ��ǰ �ڵ�: " + productCode);
	}
	
}
