package l_abstract;

public class Cd extends Item{
	private String singer;
	
	public Cd() {
		this("0000", "제목없음", "미정");
	}
	public Cd(String number, String title, String singer) {
		this.number = number;
		this.title 	= title	;
		this.singer = singer;
	}
	public void output() {
		System.out.printf("id number	: %s \n"
						+ "tilte		: %s \n"
						+ "singer		: %s\n", 
						number, title, singer);
	}
}
