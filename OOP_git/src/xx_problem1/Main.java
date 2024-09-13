package xx_problem1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력할 학생 수는? ");
		int numberOfStudent = input.nextInt();
		
		Student[] student = new Student[numberOfStudent];
		
		for(int i=0; i<numberOfStudent; i++) {
			System.out.print(i+1+"번째 학생의 정보 입력? ");
			student[i] = new Student();
			student[i].setName(input.next());
			student[i].setKor(input.nextInt());
			student[i].setEng(input.nextInt());
			student[i].setMath(input.nextInt());
		}
		for(int i=0; i<numberOfStudent; i++)
			student[i].printStudentInfo();
		
	}
	
}
