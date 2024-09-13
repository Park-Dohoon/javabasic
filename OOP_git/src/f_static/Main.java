package f_static;

public class Main {
	public static void main(String[] args) {
		
//		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();
//		
//		System.out.println("책의 갯수 : "+b1.hakbun);
//		System.out.println("책의 갯수 : "+b2.hakbun);
//		System.out.println("책의 갯수 : "+b3.hakbun);
		
		System.out.println("책의 갯수 : "+Book.getCount());
		// -> static 영역 내 변수/메소드는 객체 생성 없이 클래스 명으로 접근 가능
		
	}
}
