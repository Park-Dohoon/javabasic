package c_exercise;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {

		CalculatorExpr mux = new CalculatorExpr();
		Scanner input = new Scanner(System.in);

		boolean onoff = true;

		while(onoff) {
			System.out.print("첫 번째 숫자:");
			mux.setNum1(input.nextInt());
			System.out.print("두 번째 숫자:");
			mux.setNum2(input.nextInt());

			System.out.printf("\n추출된 숫자: %d, %d\n", mux.getNum1(),mux.getNum2());
			System.out.println("덧셈 : "+mux.getAddition());
			System.out.println("뺄셈 : "+mux.getSubstraction());
			System.out.println("곱셈 : "+mux.getMultiplication());
			System.out.println("나눗셈 : "+mux.getDivision());
			
			INNERWHILE:
				while(onoff) {
					
					System.out.println("\n계속 진행하시겠습니까?(Y/N)");
					String answer = input.next();
					
					switch(answer.charAt(0)) {
					case 'y' | 'Y': break INNERWHILE;
					case 'n' | 'N': onoff = false; break;
					default: System.out.println("잘못된 입력입니다");
					}
				}
		}
		System.out.println("프로그램을 종료합니다");
	}
}
