package Test2_pattern;

public class MySingleton {

	public static void main(String[] args) {
		/*4. �ܺο��� ����ϴ� �ڵ� �����
		 * �ܺ� Ŭ�������� Company�� ������ �� �����Ƿ� static���� �����Ǵ�
		 * getInstance() �޼��带 ȣ��
		 * */
		
		Company company1 = Company.getInstance(); //Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����
		Company company2 = Company.getInstance();
		
		/*Company company = new Company();
		 * Company �ٱ��̶� �����ڰ� �Ⱥ����� �̹������ ��ü ���� ����
		 *  ��ü �����ҷ��� getInstance(); ���
		 */
		//Company company = new Company();
		System.out.println(company1==company2); //�� ������ ���� �ּ����� Ȯ��
		//true
		System.out.println(company1); 
		//javaPractice.ch_18_pattern.Company@379619aa
		System.out.println(company2);
		//javaPractice.ch_18_pattern.Company@379619aa
	}

}
