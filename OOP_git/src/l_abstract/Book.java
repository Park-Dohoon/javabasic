package l_abstract;

/*
 * 	# this / super
 * 		this	: 자기 객체를 지칭
 * 		super	: 부모 객체를 지칭
 * 
 * 	# this() / super()
 * 		this()	: 다른 생성자를 호출
 * 		super()	: 부모 생성자를 호출
 */
public class Book extends Item{
	private String writer;
	private String publisher;
	
	public Book() {
		number 		= "0000"	;
		title 		= "제목없음"	;
		publisher 	= "미정"		;
		writer 		= "무명"		;
		
		System.out.println("자식의 기본 생성자");
	}
	
	public Book(String number, String title, String writer, String publisher) {
//		super.number 	= number	;	// 부모의 멤버변수 호출
//		super.title		= title		;
		super(number,title);		// 부모의 생성자 호출
		
		this.writer 	= writer	;
		this.publisher 	= publisher	;
		
		System.out.println("자식의 인자 생성자");
	}
	
	// overriding
	public void output() {
		System.out.printf("id number	: %s\n"
						+ "tilte		: %s\n"
						+ "writer		: %s\n"
						+ "publisher	: %s\n\n", 
						number, title, writer, publisher);
	}
}
