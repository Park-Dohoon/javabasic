package e_method;

public class Ex08_연습 {
	public static void main(String[] args) {
		multiple(2,3);
		multiple(4,'ㅋ');
		multiple(2,3,'ㅋ');
	}

	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a, char b) {
		for (int i=0; i<a; i++) System.out.print(b);
		System.out.println();
	}
	static void multiple(int a, int b, char c) {
		for (int i=0; i<a; i++) { 
			for (int j=0; j<b; j++)
				System.out.print(c);
			System.out.println();
		}
	}
}
