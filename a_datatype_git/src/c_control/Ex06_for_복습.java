package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int num = input.nextInt();
		input.close();
		
		for (int i = 0; i<num; i++) {				// row
			for (int j = 0; j<num - i-1; j++) {		// column - space
				System.out.print("  ");
			}
			for (int j = 1; j<=i+1; j++) {			// column - number
				System.out.print(j%10+" ");
			}
			System.out.println();
		}
		
	}
}
