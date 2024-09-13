package j_inherit2;

public class Test {
	public static void main(String[] args) {
		
//		Book b 	= new Book("1234-5678", "자바책", "자바쌤", "ICT");
//		b.output();
//		
//		Book b2 = new Book();
//		b2.output();
		
		//부모변수에 자식객체 생성
		Item b = new Book("0001", "자바책", "ICT", "자바쌤"); // overriding 된 부분만 자식의 멤버 참조
		
		b.output();
		
		
	}
}
