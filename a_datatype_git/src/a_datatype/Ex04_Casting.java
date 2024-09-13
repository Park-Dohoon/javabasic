package a_datatype;
/*
 * 1. 기본형
 * [참고] 자료형
 * 		논리형: boolean
 * 		문자형: char(1byte)
 * 		정수형: byte(1byte), short(2byte), int(4Byte), long(8byte) -> 실무에서는 int와 long만 사용
 * 		실수형: float(4byte), double(8byte)
 * 
 * 2. 참조형
 * [기본]
 * 		변수의 자료형과 값의 자료형이 일치
 * 
 * [참고]
 * 		변수의 자료형과 값의 자료형이 안 맞는 경우
 * 		1) 변수의 자료형 > 값의 자료형 : 자동 해결
 * 		2) 변수의 자료형 < 값의 자료형 : 자료형 변경(Casting)
 * 
 * */
public class Ex04_Casting {

	public static void main(String[] args) {
		float f;
		// f = 3.6; -> error, 소숫점의 기본형이 double이기 때문(캐스팅 필요)
		f = (float) 3.6;
		System.out.println("f = "+f);
		
		double d;
		d = 100;	//공간(8byte) <- 4byte
		System.out.println("d = "+d);
		
		// 정수형 변수 i에 36.99 실수 대입하고 출력
		int i;
		i = (int)36.99;
		System.out.println(i);
		
		//int su;
		//su = 10000000000;
		long big;
		big = 10000000000L; // long 형은 숫자 뒤에 대소문자 L을 추가해야 함 
		System.out.println("큰수:" + big);
		
	}

}
