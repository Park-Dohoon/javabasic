package e_method;

public class Ex05_개념연습 {
	public static void main(String[] args) {
		char alpha = 'a';
		
		boolean res1 = checkLower(alpha);
		System.out.println(res1);
		
		char res2 = checkUpper(alpha);
		System.out.println(res2);
	}
	
	/*
	 * (문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
		
		함수명 : checkLower
		
		인자 : char
		
		리턴(반환) : boolean
	 */
	
	static boolean checkLower(char alpha) {
		return alpha >='a' && alpha <='z'? true : false;
	}
	
	/*
	 * (문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
		
		함수명 : checkUpper
		
		인자 : char
		
		리턴(반환) : char
	 */
	static char checkUpper(char alpha) {
		return alpha >='a' && alpha <='z'? String.valueOf(alpha).toUpperCase().charAt(0) : alpha;
	}
}
