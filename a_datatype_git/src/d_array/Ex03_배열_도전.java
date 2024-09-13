package d_array;

import java.util.Scanner;

public class Ex03_배열_도전 {

	public static void main(String[] args) {
			
		// 입력
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		char[][] question = new char[range][];
		question[0] = input.nextLine().toCharArray();	// int 입력 시 버퍼에 남은 엔터키 처리
		
		System.out.println("*정답 입력 ("+range+"세트)");
		for (int i=0; i < range; i++) {
			question[i] = input.nextLine().toCharArray();
		}
		
		// 점수 계산
		int score[] = new int[question.length];
		
		for(int i = 0; i<question.length; i++) {
			
			int outer_counter=0, inner_counter=0;
			
			for (int j=0; j<question[i].length; j++) {
				
				if(question[i][j] == 'O' | question[i][j] == 'o') {
					
					inner_counter++;
					outer_counter += inner_counter;
					if (j == question[i].length-1 || question[i][j+1] == 'X' | question[i][j+1] == 'x')
						inner_counter = 0;
				}
			}
			score[i] = outer_counter;
		}
		
		// 출력
		for (int i = 0; i<score.length;i++) {
			System.out.println(score[i]);
		}
	}

}
