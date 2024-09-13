package b_operator;
/*
 * 논리연산자(일반)
 * 
 *  A  B    A && B   A || B
 * ------------------------
 *  F  F       F        F
 *  F  T       F        T
 *  T  F       F        T
 *  T  T       T        T
 * 
 * 
 * 논리연산자(이진)
 * 
 *  A  B    A & B   A | B
 * ----------------------
 *  0  0      0       0
 *  0  1      0       1
 *  1  0      0       1
 *  1  1      1       1
 * 
 */
public class Ex06_일반논리 {
	public static void main(String[] args) {
		
		int score = 75;
		char attitude = 'A';
		
		// 우등생 기준
		if (score >= 80 || attitude == 'A') { // 성적 >= 80 : false / 태도 == A : true
			System.out.println("성적이 80점 이상이거나 태도가 A라면 우등생입니다");
		}
		
		// 성적향상반
		if(score >= 80 && attitude == 'A') { // 성적 >= 80 : false / 태도 == A : true
			System.out.println("성적이 80점 이상이고 태도가 A라면 성적향상반입니다");
		}
		
	}
}
