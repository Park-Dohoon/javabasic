package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_for_도전2_0905 {
	public static void main(String[] args) {

		// 문제1
//		Scanner input = new Scanner(System.in);
//		int size = input.nextInt();
//		
//		int counter = 1;
//		for (int i = 0; i < size; i++) {
//			for(int j = 0; j<i; j++)
//				System.out.print("  ");
//			for(int j = 1 +size*i; j <= size -i +size*i; j++)
//				System.out.print(counter++ +" ");
//		
//			System.out.println();
//		}
		
		// 문제2
//		Scanner input = new Scanner(System.in);
//		int size = input.nextInt();
//		
//		int counter_char = 0, counter_num = 0;
//		for (int i = 0; i < size; i++) {
//			for(int j = 0; j < size-i; j++)
//				System.out.printf("%c ", (char)('A' + counter_char++));
//			
//			for (int j = size -i ; j < size; j++)
//				System.out.printf("%d ",counter_num++);
//			System.out.println();
//		}
		
		// 문제3
//		Scanner input = new Scanner(System.in);
//		int size = input.nextInt();
//		
//		int counter = 1;
//		for (int i = 0; i < size; i++) {
//			for(int j = 0; j < size; j++) {
//				System.out.print(counter+" ");
//				counter = (counter+2)%10;
//			}
//			System.out.println();
//		}
		
		// 문제4
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		if (!(num1 >= 2 & num1 <= 9 & num2 >= 2 & num2 <= 9)| st.hasMoreTokens())
			return;
		
		int top = 0, bottom = 0;
		if (num1 > num2) {
			top = num1;
			bottom = num2;
		}
		else {
			top = num2;
			bottom = num1;
		}
		
		for (int i = 1; i<=9; i++) {
			for (int j = top; j >= bottom; j--) {
				System.out.printf("%d * %d = %d	",j,i,j*i);
			}
			System.out.println();
		}
		
		
	}
}

