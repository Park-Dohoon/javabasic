package b_operator;

/*
 * not : 결과에 반대로 하는 연산자
 * - 일반논리 (true/flase) not : !
 * - 이진논리 not : ~
 * 
 */

public class Ex02_NOT {

	public static void main(String[] args) {
		
		// 일반논리
		boolean result = 3>4;
		System.out.println(result);
		System.out.println(!result);
		
		// 이진논리 not
		int a = 15;
		System.out.println(a);
		System.out.println(~a);
		
	}

}
