package b_operator;

public class Ex08_ShortCircuit_Logic {
	public static void main(String[] args) {
		int a = 3;
//		if(a > 3 && ++a>3) {				// && 앞의 조건이 F인 경우 뒷 조건을 실행하지 않는다 : short circuit logic
//			System.out.println("조건만족");
//			
//		}
//		System.out.println("A="+a);
		
		if(a > 3 & ++a>3) { 				// & 인 경우 정상적으로 동작 -> 일반논리처럼 동작
			System.out.println("조건만족");
			
		}
		System.out.println("A="+a);
		
		
		int b = 3;
//		if(b > 1 || ++b > 3) {				// || 앞의 조건이 T인 경우 뒷 조건을 실행하지 않는다 : short circuit logic
//			System.out.println("조건만족2");
//		}
//		System.out.println("B="+b);
		
		if(b > 1 | ++b > 3) {				// | 인 경우 정상적으로 동작 -> 일반논리처럼 동작
			System.out.println("조건만족2");
		}
		System.out.println("B="+b);
		
	}
}
