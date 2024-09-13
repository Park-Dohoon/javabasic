package a_datatype;

import java.util.Scanner;

/*
 * 자바에서 클래스를 입력받는 방법
 * 		- java.util.Scanner 클래스 이용
 * 		
 * 		- 정수형 입력 시: nextInt()
 * 		- 실수형 입력 시: nextDouble()
 * 		- 문자열 입력 시: next() / nextLine()
 * [숙제] next() / nextLine() 차이점?
 * 
 		System.out.print("아무거나:"); 
		String arr = input.next();		# 공백 전까지 읽음. 공백 이후는 새로운 입력(공백포함 공백 이후)으로 처리
		System.out.println(arr);
		
		System.out.print("아무거나:");
		arr = input.nextLine();			# 공백을 포함해 모든 입력을 전달(엔터까지)
		System.out.println(arr);
 * 
 *  [참고] 기본적인 클래스는 java.lang 패키지
 *  
 *  
 */



public class Ex08_Scanner {
	public static void main (String[] args) {
		
		int kor, eng, math, total;
		double avg;
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하시오: ");
		kor = input.nextInt();
		System.out.print("영어점수를 입력하시오: ");
		eng = input.nextInt();
		System.out.print("수학점수를 입력하시오: ");
		math = input.nextInt();
		input.close();
		
		System.out.println("\n국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.printf("총점은 %d점, 평균은 %.2f점 입니다", total, avg);
		
		
	}
}
