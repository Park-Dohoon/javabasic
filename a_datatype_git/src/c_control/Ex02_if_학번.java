package c_control;

import java.util.Scanner;

public class Ex02_if_학번 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("학번을 입력하시오: ");
		String student_id = input.next();
		input.close();
		
		FindStudentInfo(student_id);
		
	}
	
	static void FindStudentInfo(String student_id) {
		
		if (student_id.length() != 10) {
			System.out.println("잘못된 입력입니다.");
		}
		
		else {
			String year = student_id.substring(0, 4);
			char classes_id = student_id.charAt(4);
			String major_id =  student_id.substring(5,7);
			
			String classes = "";
			String major = "";
			
			
			if (classes_id == '1') {
				classes = "공대";
				
				if (major_id.equals("11")) {
					major = "컴퓨터학과";
				}
				else if (major_id.equals("12")) {
					major = "소프트웨어학과";
				}
				else if (major_id.equals("13")) {
					major = "모바일학과";
				}
				else if (major_id.equals("22")) {
					major = "자바학과";
				}
				else if (major_id.equals("33")) {
					major = "서버학과";
				}
			}
			else if (classes_id == '2') {
				classes = "사회대";
				
				if (major_id.equals("11")) {
					major = "사회학과";
				}
				if (major_id.equals("12")) {
					major = "경영학과";
				}
				if (major_id.equals("13")) {
					major = "경제학과";
				}
			}
			
			System.out.printf("\n%s(은/는) %s년도에 입학한 %s %s 학생입니다.\n",student_id, year, classes, major);
		}
	}

}
