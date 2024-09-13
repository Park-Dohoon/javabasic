package e_method;

public class Ex05_returnType {
	public static void main(String[] args) {
		
		int [] result = add();
		int sum = result[0] + result[1];
		System.out.println("합:"+sum);
	}
	static int[] add() {
		int a=10, b=20;
		
		// a,b 값을 호출한 곳으로 넘긴다면
		int data[] = {a,b};
		
		return data;
	}
}
