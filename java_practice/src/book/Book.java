package book;

public class Book {

	private int code;
	private int cnt;
	private String name;
	private String autor;
	
	public Book() {
	}
	
	public Book(int code, int cnt, String name, String auto) {
		this.code=code;
		this.cnt =cnt;
		this.name= name;
		this.autor = auto;
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
		return "Book_rental [code=" + code + ", cnt=" + cnt + ", name=" + name + ", autor=" + autor + "]";
	}
	
}
