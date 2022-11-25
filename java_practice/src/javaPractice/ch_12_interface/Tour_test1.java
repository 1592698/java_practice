package javaPractice.ch_12_interface;

/*
 * A ���α׷��ӿ� B ���α׷��Ӱ� �ϳ��� ������Ʈ�� ���� ���� ��
 * A���α׷��ӿ� B ���α׷��Ӱ� ������ Ŭ������ �ϼ����� �ʾҾ,
 * �����ؾ� �� ��ɵ��� �̸� ���� �ϰ� ��ȯ Ÿ���� ���� ������
 * ������ �۾��� �����ʹ� �����ϰ� ���డ��
 * �ٷ� �̷� ��Ӱ� �������� �������̽�
 * �Ʒ������� KoreaTour, JapanTour, TourGuideŬ������ 3���� ���� �۾��� �ϰ�,
 * ���ÿ� ���߿� ���� ������ ����
 * �������̽��� �����ϱ� ����
 * �������̽��� �̸� ���� �����ϰ� ��.
 * �� �۾� ������ 1) �������̽� 2)���ÿ� 3���� Ŭ������ �۾�
 * */
interface Providable { //�������̽�
	void leisureSports(); //public abstract����
	void sightseeing();
	void food();
}
class KoreaTour implements Providable {

	@Override
	public void leisureSports() {
		// TODO Auto-generated method stub
		System.out.println("�Ѱ����� ����Ű ����");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("�溹�� ���� ����");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("���� ����� ����");
	}	
}
class TourGuide{
	private Providable tour; //�������̽��� Ÿ�� ����
	TourGuide (Providable providable){
		tour = providable;
	}
	
	//�������̵� �ƴ�
	public void leisureSports(){
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}
public class Tour_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
	}

}
