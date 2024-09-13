package c_control;

public class Ex07_369 {
	public static void main(String[] args) {
		
		for (int i = 1; i<=50 ; i++) {
			int su = i; 					//반복 수가 많을 경우 buff 필수
			boolean su369 = false;
			
			while(su != 0) {
				int na = su%10;
				
				if (na == 3 | na ==6 | na == 9) {
					System.out.print("짝");
					su369 = true;
				}
				su = su /10;
			}

			if(!su369) System.out.println(i);
			else System.out.println();
		}
	}
}
