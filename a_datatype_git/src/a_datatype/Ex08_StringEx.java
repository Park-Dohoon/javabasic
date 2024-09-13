package a_datatype;

public class Ex08_StringEx {

	public static void main(String[] args) {
		/*
		 * 	String은 클래스임(참조형)
		 * 	 -> 참조형은 무조건 new 연산자로 메모리를 확보해야 함
		 * 	 => 단, 하나 String 특권으로 new를 생략해도 됨
		 * 
		 */
		
		String name = "홍길동";	// JVM이 자동으로 같은 주소 할당(선언한 데이터가 같기 때문)
		String name2 = "홍길동";	// 데이터 변경 시 메모리 재할당
		
		
		if (name == name2) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		
		if (name.equals(name2)) {
			System.out.println("이름이 같다");
		}
		else {
			System.out.println("이름이 다르다");
		}
		
		
	}

}
