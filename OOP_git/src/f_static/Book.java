package f_static;
/*
 * static : 공유
 * 
 * 		메모리의 단 하나 설정(지정) -> static 메모리 영역에 따로 할당
 * 
 */
public class Book {
	
	private static int count;
	
	static {		// static 생성자
		System.out.println("딱 한번");
	}
	public Book() {
		count++;
		System.out.println("책 객체 생성");
	}
	public static int getCount() {
		return count;
	}
}
