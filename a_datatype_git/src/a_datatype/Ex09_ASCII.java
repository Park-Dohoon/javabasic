package a_datatype;
/*
 * 
 * c언어의 문자 : ASCII code
 * 				한 글자를 1byte(8bit)로 표현
 * java언어의 문자: unicode (with ascii-code)
 * 				한 글자를 2byte(16bit)로 표현
 * 
 * 메모리 단위
 * 
 * 1bit : 0 / 1
 * 1byte = 8bit
 * 1kB = 1024byte
 * 
 */
public class Ex09_ASCII {

	public static void main(String[] args) {
		
		//int a;
		//a = 'A';
		//System.out.println(a);
		/*
		 * [Ascii] 1B = 8bit
		 * 
		 *  대문자	   순서
		 * - - - -   - - - -
		 * 0 1 0 0 | 0 0 0 1  A = 65
		 * 0 1 0 0 | 0 0 1 0  B
		 * 0 1 0 0 | 0 0 1 1  C
		 * 
		 *  소문자	   순서
		 * - - - -   - - - -
		 * 0 1 1 0 | 0 0 0 1  a = 97
		 * 0 1 1 0 | 0 0 1 0  b
		 * 0 1 1 0 | 0 0 1 1  c
		 * 
		 */
		
		//char ch = 70; // 
		//System.out.println(ch);
		
		char c = '0';
		System.out.printf("%d, %c", (int)c, c);
		
	}

}
