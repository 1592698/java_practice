package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

//update
class DBUpdate extends DBSelect {
	protected User modifyUser() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		
		do {
			System.out.println("정보 수정 할 회원의 아이디를 입력하세요 : ");
			user.userID = scanner.nextLine();
			System.out.println("회원의 이름을 입력하세요 : ");
			user.name = scanner.nextLine();
			System.out.println("회원의 나이를 입력하세요(숫자만) : ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("회원의 직업을 입력하세요 : ");
			user.job = scanner.nextLine();
		
			System.out.println("수정 된 회원 : " + user.userID + " / " + user.name + " / " + user.age + " / " + user.job + "이 맞습니까? (y/n)");
			
			validateTemp = scanner.nextLine(); //입력값 저장
			validate = ! validateTemp.equals("y"); //입력 값이 y가 아닌 경우 true, 같은 경우 false 반환
			//System.out.println(validate);
		}while(validate);
		scanner.close();
		return user;
	}
	public void updateUser() throws SQLException{
		User user =modifyUser();
		String updateSQL = "UPDATE tUser SET name = ?, age = ?, job = ? WHERE userID = ? ";	
		//System.out.println(updateSQL);
		
		preparedStatement = conn.prepareStatement(updateSQL); //쿼리 실행 준비
		//? 에 들어갈 값을 지정해주는데, ?는 순서에 따라 1번부터 번호가 부여
		preparedStatement.setString(1, user.name);
		preparedStatement.setInt(2, user.age);
		preparedStatement.setString(3, user.job);
		preparedStatement.setString(4, user.userID);
		int cnt = preparedStatement.executeUpdate(); //영향을 받은 데이터 개수 반환
		//pstmt.excuteQuery() : select
		//pstmt.excuteUpdate() : insert, update, delete..
		
		if(cnt > 0) {
			System.out.println("영향 받은 데이터 : : " + cnt);
			System.out.println("데이터 수정에 성공했습니다.");
		}
		else {
			System.out.println("데이터 수정에 실패했습니다.");
		}
		
	}
}
public class Test3_UpdateUser {
	public static void main(String[] args) throws SQLException {
		DBUpdate myDB = new DBUpdate();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.updateUser();
		myDB.getAllUser();
		myDB.closeDB();
	}

}
