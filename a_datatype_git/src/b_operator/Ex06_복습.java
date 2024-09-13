package b_operator;

import java.util.Scanner;

/*
 * 자동 import 매크로: ctrl + shift + o
 */

public class Ex06_복습 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하시오: ");
		char ch = input.nextLine().charAt(0);		// 자바에서 char는 2byte -> 한글을 한 문자로 표현 가능
		input.close();
		System.out.println("문자: "+ch);
		
		// 사용자가 입력한 문자가 대문자인지 여부 판단
		if (ch >= 'A' & ch <= 'Z') {
			System.out.println("대문자");
		}
		else if (ch >= 'a' & ch <= 'z') {
			System.out.println("소문자");
		}
		else {
			System.out.println("기타문자");
			
			if (ch >= '가' & ch <= '힣') {
				System.out.println("한글입니다");
			}
		}
		
	}
}
