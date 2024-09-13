package c_control;

public class Ex01_if주민번호 {
	public static void main (String[] args) {
		
		String id = "950204-3234567";
		String gender = "";
		char sex = id.charAt(7);
		
		// 그 문자가 1이면 남자, 2면 여자를 출력
		if (sex == '1' || sex == '3' || sex == '9') {
			// System.out.println("male");
			gender = "남자";
		}
		else if (sex == '2' || sex == '4' || sex=='0') {
			// System.out.println("female");
			gender = "여자";
		}
		else {
			System.out.println("invalid number");
		}
		System.out.println(gender);
		
	}
}
