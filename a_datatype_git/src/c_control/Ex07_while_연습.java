package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오(공백으로 구분): ");
		String str = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		
		// 문제1
//		int max = -99;
//		
//		while(st.hasMoreTokens()) {
//			
//			String token = st.nextToken();
//			int su = Integer.parseInt(token);
//			
//			if (max<su) {
//				max = su;
//			}
//		}
//		System.out.println(max);
		
		// 문제2
		int odd=0, even=0;
		while (st.hasMoreTokens()) {
			int buff = Integer.parseInt(st.nextToken());
			if (buff%2 == 0)
				even++;
			else
				odd++;
		}
		System.out.printf("짝수: %d개\n홀수: %d개\n\n", even, odd);
		
		// 문제3
		System.out.println("10개의 정수를 입력하시오(0 입력 시 강제 종료)");
		str = input.nextLine();
		StringTokenizer st2 = new StringTokenizer(str);
		int total = 0, cnt = 0;
		
		while (st2.hasMoreTokens()) {
			
			int buff = Integer.parseInt(st2.nextToken());
			if (buff == 0 || cnt == 10) break;
			total += buff;
			cnt++;
		}
		System.out.printf("총합: %d / 평균: %.2f",total, (total/(double)cnt));
	}
}
