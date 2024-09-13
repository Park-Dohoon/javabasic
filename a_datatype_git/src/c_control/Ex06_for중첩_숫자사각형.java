package c_control;

import java.util.Scanner;

public class Ex06_for중첩_숫자사각형 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 숫자를 입력하시오");
		int row = Integer.parseInt(input.next());
		int col = Integer.parseInt(input.next());
		
//		int su = 1;
//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++) {
//				System.out.print(su+"	");
//				su++;
//			}
//			System.out.println("\n");
//		}
		for(int i=0, su=1; i<row; i++,su++) {
			for(int j=0; j<col; j++) {
				System.out.print(su+j+"	");
			}
			System.out.println("\n");
		}
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
	}
}
