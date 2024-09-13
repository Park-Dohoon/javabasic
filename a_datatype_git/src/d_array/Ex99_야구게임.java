package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_야구게임 {
	public static void main(String[] args) {
		int[] baseball = new int[3];
		
		for (int i = 0; i <baseball.length; i++) {
			baseball[i] = (int) (Math.random()*10);
			
			for(int j=0; j<i; j++) {
				if(baseball[i] == baseball[j]) {
					i--; 
				}
				
			}
			System.out.println(baseball[i]);
		}
		
		for(int i=0; i< baseball.length; i++)
			System.out.print(baseball[i]+"/");
		
		/*---------------------------
		 * 2. 사용자 입력값 answer에 각각의 숫자로 저장
		 * 		[ex] 3 4 5
		 */
		
		Scanner input = new Scanner(System.in);
		int[] answer = new int[baseball.length];
		
		int strike=0, ball=0;
		
		while(strike != 3) {
		System.out.println("\n세 숫자를 입력하시오(공백으로 구분)");
		String input_string= input.nextLine();
		StringTokenizer st = new StringTokenizer(input_string);
		for (int i = 0; i<baseball.length;i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i< baseball.length; i++)
			System.out.print(answer[i]+"/");
		
		/*---------------------------
		 * 3. 값비교
		 */
		strike=0; ball=0;
		for (int i=0; i<baseball.length;i++) {
			for(int j=0; j<answer.length;j++) {
				if(baseball[i] == answer[j]) {
					if(i == j) strike++;
					else ball++;
				}
			}
		}
		
		// 4. 출력
		System.out.println("\n스트라이크: "+strike+" /볼: "+ball);
		}
		System.out.println("정답입니다~ 축하드려요!");
	}

}
