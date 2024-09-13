package e_method;

/*
 * call by reference
 * 		: 메소드의 인자(파라미터)의 자료형이 참조형인 경우
 * 		=> 주소만 복사
 */
public class Ex06_callByReference {
	public static void main(String[] args) {
		
//		Integer num1 = new Integer(3);
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a,b);
		System.out.println("2. A="+a+", B="+b);
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		
		a.append(b);
		System.out.println("1. A="+a+", B="+b);
		
	}
}
