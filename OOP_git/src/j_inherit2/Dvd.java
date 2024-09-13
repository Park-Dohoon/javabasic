package j_inherit2;

public class Dvd extends Item{
	private String actor;
	private String director;
	
	public Dvd() {
		number 		= "0000"	;
		title 		= "제목없음"	;
		actor 		= "미정"		;
		director 	= "무명"		;
	}
	public Dvd(String number, String title, String actor, String director) {
		super(number, title)		;
		this.actor 		= actor		;
		this.director	= director	;
	}
	
	public void output() {
		System.out.printf("id number	: %s \n"
						+ "tilte		: %s \n"
						+ "actor		: %s \n"
						+ "director	: %s \n\n", 
						number, title, actor, director);
	}
}
