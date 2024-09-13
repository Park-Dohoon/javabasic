package c_control;

public class Ex07_방탈출 {
	
	public static void main(String[] args) {
		int cnt = 0;
		
		for (int i = 1; i<=10000 ; i++) {
			int su = i; 					//반복 수가 많을 경우 buff 필수
			
			while(su != 0) {
				int na = su%10;
				
				if (na == 8) {
					cnt++;
				}
				su = su /10;
			}
		}
		System.out.println("결과: "+cnt);
	}
	
}
