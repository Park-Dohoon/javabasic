package c_control;

import java.util.Calendar;

/*
 * wrapper class: 자료형 클래스
 * 
 * - int		: integer
 * - long		: long
 * - double		: double
 * 
 */
public class Ex03_나이구하기 {
	
	public static void main(String[] args) {
		
		String id = "950903-1234567";
		
		// 개인정보 추출
		int id_year = Integer.parseInt(id.substring(0,2));	// string "80" -> int 80
		int id_month = Integer.parseInt(id.substring(2,4));
		int id_date = Integer.parseInt(id.substring(4,6));
		char sex_code = id.charAt(id.indexOf('-')+1);
		
		// 올해 년도 구하기
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);		
		
		// 사용할 나이 변수
		int age=0;
		int new_age=0;
		
		// 성별 코드가 1 또는 2
		if (sex_code == '1' || sex_code == '2') {
			age = year - (1900+id_year)+1;
		}
		// 성별 코드가 3 또는 4
		else if (sex_code == '3' || sex_code == '4') {
			age = year - (2000+id_year)+1;
		}
		// 성별 코드가 9 또는 0
		else if (sex_code == '9' || sex_code == '0') {
			age = year - (1800+id_year)+1;
		}
		
		// 만 나이 구하기
		// 생일이 지난 후
		if (month > id_month | (month == id_month && date >= id_date)) {
			// 성별 코드가 1 또는 2
			if (sex_code == '1' || sex_code == '2') {
				new_age = year - (1900+id_year);
			}
			// 성별 코드가 3 또는 4
			else if (sex_code == '3' || sex_code == '4') {
				new_age = year - (2000+id_year);
			}
			// 성별 코드가 9 또는 0
			else if (sex_code == '9' || sex_code == '0') {
				new_age = year - (1800+id_year);
			}
		}
		// 생일이 지나기 전
		else {
			// 성별 코드가 1 또는 2
			if (sex_code == '1' || sex_code == '2') {
				new_age = year - (1900+id_year)-1;
			}
			// 성별 코드가 3 또는 4
			else if (sex_code == '3' || sex_code == '4') {
				new_age = year - (2000+id_year)-1;
			}
			// 성별 코드가 9 또는 0
			else if (sex_code == '9' || sex_code == '0') {
				new_age = year - (1800+id_year)-1;
			}
		}
		
		System.out.println("한국나이:	"+age);
		System.out.println("만 나이:	"+new_age);
		
	}
}
