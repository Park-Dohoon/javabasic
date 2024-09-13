package e_method;

public class Ex99_복습1 {
	
	public static void main(String[] args) {
		System.out.println("A");
		test();
		System.out.println("B");
	}
	static void test() {
		System.out.println("C");
		sample();
		imsi();
		System.out.println("D");			
	}	
	static void sample() {
		System.out.println("E");	
	}
	static void imsi() {
		System.out.println("F");	
	}
}