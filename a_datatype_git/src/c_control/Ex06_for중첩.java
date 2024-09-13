package c_control;

import java.util.Scanner;

public class Ex06_for중첩 {
	public static void main(String[] args) {
		
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j <5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j < 5-i; j++) {
//				
//				System.out.print("*");
//			} // end of for j
//			
//			System.out.println();
//		} // end of for i
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n쌓을 나무의 단 수를 입력하시오: ");
		int max = input.nextInt();
		input.close();
		
		// 피라미드 - 방법1
		System.out.println();
		for(int i = 0; i<max; i++) {
			// 공백 출력
			for(int j = 0;j < max-i-1; j++) {
				System.out.print(" ");
			}
			// * 출력
			for(int j = 0; j < i+1; j++) {
				System.out.print(" *");
			} // end of for j
			
			System.out.println();
		} // end of for i
		
		// 피라미드 - 방법2
		System.out.println();
		for(int i = 0; i<max; i++) {
			// 공백 출력
			for(int j = 0;j < max-i-1; j++) {
				System.out.print("  ");
			}
			// * 출력
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print(" *");
			} // end of for j
			
			System.out.println();
		}
		
	} // end of main
} // end of class
