package c_control;

public class Ex06_for중첩_알파벳 {
	public static void main(String[] args) {

		// 문제1
		for(char j = 0; j < 26; j++) {
			for(char i = 'A'; i <='A'+j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 문제2
		for(char j = 0; j < 26; j++) {
			for(char i = 'A'; i <='Z'-j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 문제3
		for(char j = 0; j < 26; j++) {
			for(char i = 'Z'; i >='Z'-j; i--) {
				System.out.print(i);
			}
			System.out.println();
		}

		//문제4
		for(char j = 0; j < 26; j++) {
			for(char i = (char)('A' + j); i <='Z'; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
