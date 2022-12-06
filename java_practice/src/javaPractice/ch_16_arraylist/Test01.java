package javaPractice.ch_16_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	/*String 객체를 저장하는 ArrayList*/
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); //저장된 총 객체수 얻기
		System.out.println("총 객체수: " + size);//총 객체수 :5 
		System.out.println();
		
		String skill = list.get(2); //2번 인덱스에 저장된 객체 얻기
		System.out.println("2: " + skill); //2: Database
		System.out.println();
		
		//저장된 객체 출력
		for(int i=0; i<list.size(); i++) { //저장된 개수만큼 반복
			String str = list.get(i);
			System.out.println(i+":" + str);
		}
		/*
		 *  0:Java
			1:JDBC
			2:Database
			3:Serverlet/JSP
			4:iBATIS
			*/
		System.out.println();
		for(String str: list) { //foreach로도 출력가능
			System.out.println(str);
		}
		System.out.println();
		list.remove(2); //2번 인덱스 Database 삭제 삭제되면 앞으로 한칸씩 땡겨짐 자원소모 큼
		list.remove(2); //2번 인덱스 Serverlet/JSP 삭제 3번->2번
		list.remove("iBATIS"); 
		
		for(int i=0; i<list.size(); i++) {//저장된 개수만큼 반복
			String str = list.get(i);
			System.out.println(i+":" + str);
		}
		/*
		 * 	0:Java
			1:JDBC
		 	*/
	}

}
