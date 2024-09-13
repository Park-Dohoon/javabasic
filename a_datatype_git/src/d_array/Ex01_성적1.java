package d_array;

import java.util.Scanner;

/*
 * 학생수를 입력하시오 -> 5
 * 
 * 0번 학생의 국어점수를 입력하시오 -> 88
 * 1번 학생의 국어점수를 입력하시오 -> 88
 * 2번 학생의 국어점수를 입력하시오 -> 88
 * 3번 학생의 국어점수를 입력하시오 -> 88
 * 4번 학생의 국어점수를 입력하시오 -> 88
 * 
 * 총점과 평균 출력
 * 
 */

public class Ex01_성적1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하시오->");
		int su = input.nextInt();
		
		int[] kor = new int[su];
		
		for (int i = 0; i < su; i++) {
			System.out.print(i+1+"번 학생의 국어점수를 입력하시오->");
			kor[i] = input.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i<su;i++) 
			total+=kor[i];
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+(double)total/su);
	}
}
