package javaPractice.ch_12_interface;

class JapanTour implements Providable {

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("���� Ÿ�� �������� ����");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("����ī ���� ����");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("�ʹ� ����");
	}
	
}
public class Tour_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports(); //���� Ÿ�� �������� ����
		guide2.sightseeing();//����ī ���� ����
		guide2.food();//�ʹ� ����
	}

}
