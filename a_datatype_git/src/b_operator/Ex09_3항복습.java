package b_operator;

import java.util.Scanner;

public class Ex09_3항복습 {
	public static void main(String[] args) {
		int a = 8, b = 10;
		int max;
		
//		if (a>b) {
//			max = a;
//		}
//		else {
//			max = b;
//		}
//		System.out.println("두 수 중 큰 수는 " + max);
		
		// 두 수를 입력받고 그 두 수 중에서 큰 값 출력 (삼항연산자 이용)
		Scanner input = new Scanner(System.in);
		System.out.println("판별할 두 숫자를 입력하시오.");
		
		System.out.print("첫 번째 숫자: ");
		a = input.nextInt();
		System.out.print("두 번째 숫자: ");
		b = input.nextInt();
		input.close();
		
		max = a > b ? a : b;
		System.out.println("두 수 중 큰 수는 " + max);
		
	}
}
