package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 국어점수를 입력하시오 (입력예시: 10/10/10/10/10) -> 55/66/75/69/72
 * 총점은 xxx이고, 평균은 xxx입니다
 */
public class Ex01_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하시오 (입력예시: 10/10/10/10/10)");
		String str = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, "/");
		int[] kor = new int[st.countTokens()];
		
		int total = 0, cnt = 0;
		while(st.hasMoreTokens()) {
			kor[cnt] = Integer.parseInt(st.nextToken());
			total += kor[cnt++];
		}
		System.out.println("\n총점은 "+total+"이고, 평균은 "+(double)total/kor.length+"입니다");
	}

}
