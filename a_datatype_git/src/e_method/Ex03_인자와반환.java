package e_method;

public class Ex03_인자와반환 {
	public static void main(String[] args) {
		// 데이타
		int a=10, b=20;
		int sum =add(a,b);
		
		// result
		System.out.println(sum);
	}
	static int add(int a, int b) {
		// 데이터 처리
		int sum = a+b;
		
		return sum;
	}
}
