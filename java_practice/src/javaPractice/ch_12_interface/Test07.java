package javaPractice.ch_12_interface;

public class Test07 {
 /*DataAccessObject �������̽��� �� �������̽��� �����ϴ� OracleData,
  * MySqlData Ŭ������ �ֽ��ϴ�.
  * ���� Ŭ������ ���� ��� ����� ������ ���� �� �������̽��� Ŭ������ ���� �ϼ��ϼ���*/
	
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
		
	}
	public static void main(String[] args) {
		dbWork(new OracleData());
		dbWork(new MySqlData());
		
		//Oracle DB�� ����
		//Oracle DB���� �˻�
		//Oracle DB�� ����
		//Oracle DB���� ����
		//MySql Db�� ����
		//MySql Db���� �˻�
		//MySql Db�� ����
		//MySql Db���� ����
	}
}
interface DataAccessObject {

	void insert();

	void delete();

	void update();

	void select();
	
}
class OracleData implements DataAccessObject{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB���� �˻�");
	}

	@Override
	public void  update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void  delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB���� ����");
	}
	
}
class MySqlData implements DataAccessObject{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB���� ����");
	}
	
}