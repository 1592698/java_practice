package book_db;

public class Book {

	private int code;
	private int cnt;
	private String name;
	private String autor;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int code, String name, String autor, int cnt) {
		
		this.code=code;
		this.cnt =cnt;
		this.name= name;
		this.autor = autor;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "*�����뿩* [ å �ڵ� = " + code + ", å ���� = " + name + ", �۰� = " + autor + ", ���� = " + cnt + "]";
	}
}
