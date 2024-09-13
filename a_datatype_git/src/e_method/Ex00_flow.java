package e_method;

public class Ex00_flow {

	static void method() {			// main 내에서(static 함수)는 static 함수만 호출 가능
		System.out.println("call method");
	}
	
	public static void main(String args[]) {
		
		System.out.println("starting main");
		
		method();
		method();
		method();
		
		System.out.println("ends main");
		
	}
	
}
