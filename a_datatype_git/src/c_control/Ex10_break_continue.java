package c_control;

/*
 * break: 블럭을 벗어나는 문장
 * continue: 블럭의 끝으로 이동하는 문장(다음 루프 실행)
 */

public class Ex10_break_continue {
	public static void main(String args[]) {
//		for (int j = 0; j<3; j++) {
//			if (j==1) continue;//break;
//			System.out.printf("< %d >\n",j);
//		}
//		System.out.println("data");
		
		// 라벨 부착(대문자 권장)
		END: for (int i = 0; i<2; i++) {
			
			for (int j = 0; j<3; j++) {
				if (j==2) break END; //continue END;
				if (j==1) 
				System.out.printf("< %d, %d > \n",i, j);
			}
			
			System.out.println("data");
		}
		
	} 
	 
}
