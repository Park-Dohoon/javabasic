package e_method;

public class Ex99_복습4 {
	public static void main(String args[]) {
		
		greeting(2);
		loopMethod(2);
		System.out.println(circle(3));
		System.out.println(square(4,5));
		
	}
	
	static int substract(int a, int b) {
		return a-b;
	}
	
	static void greeting(int a) {
		String words = "";
		switch(a) {
		case 1: words = "안녕하세요"; break;
		case 2: words = "굿모닝"; break;
		case 3: words = "올라"; break;
		case 4: words = "곤니치와"; break;
		case 5: words = "앗살람 알라이쿰"; break;
		case 6: words = "사와디캅"; break;
		case 7: words = "봉주르"; break;
		default: words = "도토잠보";
		}
		System.out.println(words);
	}
	
	static void loopMethod(int cycle) {
		while(cycle-- > 0) System.out.print("자바는 맛있다");
		System.out.println();
	}
	
	static double circle(double r) {
		double pi = 3.14;
		return pi*r*r;
	}
	
	static int square (int h, int w) {
		return h*w;
	}
}
