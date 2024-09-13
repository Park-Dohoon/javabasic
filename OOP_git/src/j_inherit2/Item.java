package j_inherit2;

public class Item {
	protected String number;
	protected String title;
	
	public Item() {			// 부모클래스 상속을 지정하지 않으면 object 클래스를 자동으로 상속
		
		number 	=	"0"	;
		title 	= 	""	;
		System.out.println("부모 기본 생성자");
	}
	
	public Item(String number, String title) {
		
		this.number = number	;
		this.title	= title		;
		System.out.println("부모 인자 생성자");
	}
	
	public void output() {
		System.out.printf("id number: %s, \ntilte: %s\n", number, title);
	}
	
}
