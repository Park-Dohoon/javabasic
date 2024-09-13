package b_operator;
import java.util.Scanner;
/*
 * 비교 연산자
 * <, >, <=, >=, ==, !=
 * 
 */

public class Ex05_비교 {

	public static void main(String[] args) {
		
//		int kor=89, eng=87, math=77;
//		int total = kor+eng+math; 
//		double avg = (double)total/3;
//		System.out.println("총점:"+total+", 평균:"+avg);
		
		/*
		 * [학점 구하기]
		 * 평균이 90이상이면 A학점
		 * 평균이 80이상 90미만이면 B학점
		 * 평균이 70이상 80미만이면 C학점
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("평균을 입력하시오:");
		double avg = sc.nextInt();
		sc.close();
		
		if (avg >= 90) {						// 만약에 avg값이 90이상이라면
			System.out.println("A학점입니다.");	// 그렇다면 'A'학점 출력
		} else if (avg>=80) {					// 그렇지 않다면 만약에 avg값이 80이상이라면
			System.out.println("B학점입니다.");	// 그렇다면 'B'학점 출력
		} else if (avg >=70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}
		/*
		if (avg >= 90) {						// 만약에 avg값이 90이상이라면
			System.out.println("A학점입니다.");	// 그렇다면 'A'학점 출력
		} if (avg >=80) {						// (그렇지 않다면 -> 제거됨) 만약에 avg값이 80이상이라면
			System.out.println("B학점입니다.");	// 그렇다면 'B'학점 출력
		} if (avg >=70) {
			System.out.println("C학점입니다.");
		}
		
		if (avg >= 70) {						// 만약에 avg값이 70이상이라면
			System.out.println("C학점입니다.");	// 그렇다면 'C'학점 출력			-> 계속 c만 출력(범위가 더 넓기 때문)
		} else if (avg >=80) {						
			System.out.println("B학점입니다.");	
		} else if (avg >=90) {
			System.out.println("A학점입니다.");
		}
		*/
	}

}
