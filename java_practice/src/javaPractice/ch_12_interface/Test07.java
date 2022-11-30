package javaPractice.ch_12_interface;

public class Test07 {
 /*DataAccessObject 인터페이스와 이 인터페이스를 구현하는 OracleData,
  * MySqlData 클래스가 있습니다.
  * 메인 클래스를 보고 출력 결과가 다음과 같을 때 인터페이스와 클래스를 만들어서 완성하세요*/
	
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
		
	}
	public static void main(String[] args) {
		dbWork(new OracleData());
		dbWork(new MySqlData());
		
		//Oracle DB에 삽입
		//Oracle DB에서 검색
		//Oracle DB를 수정
		//Oracle DB에서 삭제
		//MySql Db에 삽입
		//MySql Db에서 검색
		//MySql Db를 수정
		//MySql Db에서 삭제
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
		System.out.println("Oracle DB에 삽입");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void  update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB를 수정");
	}

	@Override
	public void  delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
	}
	
}
class MySqlData implements DataAccessObject{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에 삽입");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 삭제");
	}
	
}