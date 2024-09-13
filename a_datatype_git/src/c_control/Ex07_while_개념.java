package c_control;

import java.util.Scanner;

/*
 * 반복문
 * 	- for
 * 	- while
 *  - do~ while
 * 
 */

public class Ex07_while_개념 {
	public static void main(String[] args) {
		
//		int sum = 0;
//		
//		for(int i=1 ; i<=10; i++) {
//			sum += i;
//		} // end of for i
		
//		int sum = 0;
//		int i = 1;
//		for(; i<=10; i++) {
//			sum += i;
//		} // end of for i
		
//		int sum=0, i = 0;
//		while(i < 10) {
//			sum += i;
//			i++;
//		}
		
		// 단수를 입력받아 구구단을 출력
		Scanner input = new Scanner(System.in);
		System.out.print("단을 입력하시오: ");
		int dan = input.nextInt();
		input.close();
		
//		for(int i = 1; i<=9; i++) {
//			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//		}
		
		
		int i = 0;
		while (i++ < 9)
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		
		
		
	}// end of main
} // end of class
