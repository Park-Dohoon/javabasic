package d_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Student[] s = new Student[3];
		Scanner input = new Scanner(System.in);

		for(int i=0; i<s.length; i++) {
			
			s[i] = new Student();		// 배열 내 요소들에 각각 객체 할당 
			
			System.out.print(i+1+"번 학생명 입력 : ");
			s[i].setName(input.next());
			System.out.print(i+1+"번 국어점수 입력 : ");
			s[i].setKor(input.nextInt());
			System.out.print(i+1+"번 영어점수 입력 : ");
			s[i].setEng(input.nextInt());
			System.out.print(i+1+"번 수학점수 입력 : ");
			s[i].setMath(input.nextInt());
			
			System.out.println("총점: "+s[i].calTotal());
			System.out.println("평균: "+s[i].calAvg()+"\n");
		}
		
	}
}
