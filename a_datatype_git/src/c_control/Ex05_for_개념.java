package c_control;

public class Ex05_for_개념 {
	public static void main(String []args) {
		
//		int result = 0;
//		for(int j = 1; j<=10;j++) {
//			
//			result +=j;
//			
//		}
//		System.out.println("결과:"+result);
		
//		for(char ch = 'A' ; ch <= 'Z' ; ch++ ) {
//			System.out.print(ch);
//		}
//		for(char ch = '가' ; ch <= '힣' ; ch++ ) {
//			System.out.print(ch);
//		}
		
//		for(int a=10 ; a>0 ; a -= 2) {
//			System.out.println(a);
//		}
		
//		for(char ch = 'Z' ; ch >= 'A' ; ch-- ) {
//			System.out.print(ch);
//		}
		
//		boolean onoff = true;
//		
//		for (int i = 1 ; onoff == true? (i<100):(i>0) ; i = (onoff == true) ? (i+1):(i-1) ) {
//			
//			if(i > 9) onoff = false;
//			
//			for (int j = 0 ; j < i; j++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int odd=0, even=0;
		for (int i =1 ; i<=10 ; i++) {
			if (i%2==0) {
				even +=i;
			}
			else {
				odd +=i;
			}
		}
		System.out.printf("1부터 10 까지 짝수의 합은 %d, 홀수의 합은 %d입니다\n", even, odd);
		
		even = 0; odd = 0;
		int buff = 0;
		
		for (int i =1 ; i<=10 ; i++) {
			buff = (i%2==0) ? (even+=i) : (odd+=i);
		}
		System.out.printf("1부터 10 까지 짝수의 합은 %d, 홀수의 합은 %d입니다\n", even, odd);
		
	}
}
