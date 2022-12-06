package javaPractice.ch_16_arraylist;

import java.util.ArrayList;
import java.util.List;

/*BoardDao ��ü�� getBoardList() �޼ҵ带 ȣ���ϸ� list<Board> Ÿ���� �÷����� ����
 * main() �޼ҵ� ����ÿ� �Ʒ��� ���� ��� �� �� �ֵ���
 * BoardDao�� getBoardList() �޼ҵ带 �ۼ��� ��*/
//����1-����1

//---------------------------------------1��° ���
class BoardDao {
	List<Board> boardList = new ArrayList<Board>();
	
	public BoardDao() {
		boardList.add(new Board("����1", "����1"));
		boardList.add(new Board("����2", "����2"));
		boardList.add(new Board("����3", "����3"));
	}
	public List<Board> getBoardList(){
		return boardList;
	}
}
//---------------------------------------2��° ���
//class BoardDao2nd{
//	
//	public List<Board> getBoardList() {
//		List<Board> boardList = new ArrayList<Board>();
//		boardList.add(new Board("����1", "����1"));
//		boardList.add(new Board("����2", "����2"));
//		boardList.add(new Board("����3", "����3"));
//		return boardList;
//	}
//}

class Board{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}
public class Test04 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
