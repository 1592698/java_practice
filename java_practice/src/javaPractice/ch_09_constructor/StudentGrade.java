package javaPractice.ch_09_constructor;

class StudentGrade{

	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;


	public StudentGrade(String name, int ban, int no) {
		this.name=name;
		this.ban=ban;
		this.no=no;
	}
	public String getName() {
		return name;
	}
	public void updateRecord(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	int getTotal() {
		return kor + eng + math;
	}
	int getAverage() {
		return ( kor + eng + math )/3;
	}



	
}
