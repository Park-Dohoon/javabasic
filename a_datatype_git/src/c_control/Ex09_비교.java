package c_control;

import java.util.Scanner;

public class Ex09_비교 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 구구단 출력을 몇 번 반복할까요?
//		System.out.print("구구단 출력을 몇 번 반복할까요?: ");
//		int su = input.nextInt();
//		for (int j = 0 ; j <su; j++) {
//		// for
//			System.out.print("단을 입력하시오: ");
//					int dan = input.nextInt();
//			for(int i = 1; i <=9; i++)
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//			System.out.println();
//		}
		
		// while
//		String answer="N";
//		while(answer.equals("Y")|answer.equals("y")) {
//			if(answer.equals("N")|answer.equals("n")) {
//				int i = 0;				// 조건비교 -> 실행
//				System.out.print("\n단을 입력하시오: ");
//				int dan = input.nextInt();
//				while (i++ < 9)
//					System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//			}
//			else {
//				System.out.println("잘못된 입력입니다");
//			}
//			System.out.print("\n종료할까요?(Y/N) ");
//			answer = input.next();
//			
//		}
		
//		// do while
//		 i = 1;				// 실행 -> 조건비교
//		do {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//				i++;
//		}
//		while (i <= 9);
		
		
		String answer="Y";
		do {
			if(answer.equals("Y")|answer.equals("y")) {
				System.out.print("\n단을 입력하시오: ");
				int dan = input.nextInt();
				
				int i = 0;
				while (i++ < 9)
					System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
			else {
				System.out.println("\n[잘못된 입력입니다]");
				answer = "y";
			}
			
			System.out.print("\n다시할까요?(Y/N) ");
			answer = input.next();
			
		} while(!(answer.equals("N")|answer.equals("n")));
		System.out.println("[종료합니다]");
	}
}
