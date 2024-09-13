package e_method;
/*
 * 인자 - argument
 * 매개변수 - parameter
 * 
 * 인자:= 매개변수
 * 
 */
public class Ex01_1인자 {
	public static void main(String args[]) {
		// data
		int a= 10, b=20;
		
		add(a, b); // 인자: argument
		
	}
	
	static void add(int a, int b) { // 매개변수: parameter
		// data process
		
		int sum = a+b;
		System.out.println("sum = "+sum);
		
	}
}
