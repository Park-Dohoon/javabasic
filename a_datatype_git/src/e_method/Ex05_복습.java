package e_method;

public class Ex05_복습 {
	public static void main(String[] args) {
		int data1 = 1000;
		double data2 = 1.99;
		
		String msg = method(data1,data2);
		System.out.println(msg);
	}
	
	static String method(int data1, double data2) {
		// data1과 data2의 값을 여기서 출력
		System.out.println("data1: "+data1+" / data2: "+data2);
		
		String msg = "안녕하세요";
		return msg;
	}
}
