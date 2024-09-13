package e_method;

import java.util.Scanner;

public class Ex99_복습2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수입력: ");
		int jumsu = input.nextInt();
		
		// pass(jumsu);
		String result = pass(jumsu);
		System.out.println(result);
	}
	/*
	 * 역할: 입력받은 점수를 넘겨받아 80점 이상이면 합격, 그렇지 않으면 불합격 출력
	 */
	
//	static void pass(int jumsu) {
//		System.out.println(jumsu >= 80? "합격":"불합격");
//	}
	static String pass(int jumsu) {
		return jumsu >= 80? "합격":"불합격";
	}
	
}
