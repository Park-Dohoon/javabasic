package a_datatype; //디렉터리

import java.io.IOException;

public class Ex05_declation {

	public static void main(String[] args) throws IOException {
	/*	
		int kor;
		
		kor = 30;
		
		// initialize = declaration+input value
		int eng =  30;
	 */
		
		int kor=30, eng=50;
		
		
		System.out.print("국어 점수를 입력하시오:");
		kor = System.in.read();
		System.out.print("영어 점수를 입력하시오:");
		eng = System.in.read();
		
		
		System.out.println("국어:"+kor+", 영어:"+eng);
		System.out.printf("국어:%d, 영어:%d\n",kor, eng);
		System.out.println();
		
		/*
		 * 만약에 국어점수와 영어점수가 동일하니
		 * 그렇다면 "두 점수가 동일"이라고 출력
		 * 그렇지 않다면 "두 점수가 다름"이라고 출력
		 */
		
		if(kor == eng) {
			System.out.println("두 점수가 동일");
		}
		else {
			System.out.println("두 점수가 다름");
		}
		
		// 두 점수 맞바꾸기 = 두 변수의 값을 바꾸기
		// kor=30, eng=50 -> kor=50, eng=30
		
		int buff = kor;
		kor = eng;
		eng = buff;
		System.out.println("\n국어:"+kor+", 영어:"+eng);
		
	}

}
