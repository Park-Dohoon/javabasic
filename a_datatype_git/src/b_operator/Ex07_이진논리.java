package b_operator;
/* 
 * 논리연산자(이진)
 * 
 *  A  B    A & B   A | B   A ^ B
 * -------------------------------
 *  0  0      0       0       0
 *  0  1      0       1		  1
 *  1  0      0       1		  1
 *  1  1      1       1		  0
 * 
 */
public class Ex07_이진논리 {
	public static void main(String[] args) {
		
		int a = 15;							// 00000000 00000000 00000000 00001111
		int b = 10;							// 00000000 00000000 00000000 00001010
		System.out.printf("a = %d, b = %d\n\n", a, b);
		
		int and = a & b;					// 00000000 00000000 00000000 00001010
		System.out.println("AND = " + and);
		int or = a | b;				 		// 00000000 00000000 00000000 00001010
		System.out.println("OR = " + or);
		int xor = a ^ b;					// 00000000 00000000 00000000 00001010
		System.out.println("XOR = " + xor);
		
	}
}
