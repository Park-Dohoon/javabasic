package e_constructor;

import java.util.Scanner;

public class MainArray {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정보를 입력할 학생 수를 입력 -> ");
		int student_count = input.nextInt();
		Student s[] = new Student[student_count];
		
		for(int i=0; i<student_count; i++) {
			System.out.print("\n학생이름-> ");
			String name = input.next();
			System.out.print("국어점수-> ");
			int kor = input.nextInt();
			System.out.print("영어점수-> ");
			int eng = input.nextInt();
			System.out.print("수학점수-> ");
			int math = input.nextInt();
			
			s[i] = new Student(name, kor, eng, math);
			
			System.out.println(s[i].getName()+"님의 총점: "+s[i].calTotal());
			System.out.println(s[i].getName()+"님의 평균: "+s[i].calAvg());
		}
		
	}
}
