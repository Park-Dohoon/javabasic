package c_control;

import java.util.*;

/*
 * for 	: 반복횟수가 정해져 있는 경우 주로 사용
 * while: 반복횟수를 모를 때 주로 사용
 */

public class Ex07_while_응용 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("예 : 국어/영어/수학/(90/80/70)");
		String str = input.nextLine();
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer(str,"/");
		
		// 반복횟수를 알 수 있다면
//		int cnt = st.countTokens();
//		for (int i=0; i<cnt; i++) {
//			String token = st.nextToken();
//			System.out.println("점수: "+token);
//		}
		
		// 반복횟수가 불분명하다면
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("점수: "+token);
		}
		
	}
}
