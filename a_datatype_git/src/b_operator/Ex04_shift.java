package b_operator;
/*
 * shift: 모든 비트의 값을 이동하는 연산자
 * >>
 * <<
 * >>>
 * 
 * 숫자 2를 1byte 적용한다면
 * 	2		00000010
 * 	2<<1 	00000100 = 4
 * 	2>>1 	00000001 = 1
 * 	2>>>1	00000001
 * 			10000010 -->	01000001 (일반 shift의 경우 부호 비트 유지)
 * 
 */
public class Ex04_shift {
	public static void main(String[] args) {
		int a = 4;
		int result = a>>2;
		System.out.println("a>>2한 결과: "+result);
		
		int result2 = a<<2;
		System.out.println("a<<2한 결과: "+result2);
		
		int b = -4;
		int re1 = b >>2;
		System.out.println("b>>2한 결과:"+re1);
		
		int re2 = b >>>2;
		System.out.printf("b:%x \nb>>2한 결과:%x",b,re2);
				
	}
}
