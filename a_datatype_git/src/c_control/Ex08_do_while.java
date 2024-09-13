package c_control;

import java.util.Scanner;

/*
 * 	초기치;
 * 	do{
 * 		반복문장;
 * 		증가치;
 * 	} while(조건문);
 */
public class Ex08_do_while {
	public static void main(String[] args) {
		
//		int sum = 0; 
//		int i=1;
//		
//		do {
//			sum += i;
//			i++;
//		} while(i<=10); 
//		System.out.println(sum);
		
		Scanner input = new Scanner(System.in);
		System.out.print("단을 입력하시오: ");
		int dan = input.nextInt();
		input.close();
		
//		int i = 0;				// 조건비교 -> 실행
//		while (i++ < 9)
//			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		
		int i = 1;				// 실행 -> 조건비교
		do {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
				i++;
		}
		while (i < 10);
	}
}
