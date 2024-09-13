package e_method;

public class Ex04_멤버변수범위 {
	
	static int a = 10, b= 20;
	static int sum;
	
	public static void main(String[] args) {
		
		// System.out.println(sum); // 멤버변수 자동 초기화 -> 에러 발생 x
		add();
		System.out.println(sum);
		
	}
	static void add() {
		sum = a+b;
	}
}
