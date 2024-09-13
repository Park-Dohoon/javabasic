package d_array;

public class Ex99_정렬 {
	public static void main(String[] args) {
		
		int[] lotto = {45,2,15,27,10,42};
		
		// 출력
		System.out.println("*Before sorting*");
		for(int a=0; a<lotto.length;a++) {
			System.out.print(lotto[a]+" ");
		} System.out.println("\n");
		
		// 버블정렬
//		for(int i = lotto.length-1; i>0;i--) {
//			for(int j=0; j< i; j++) {
//				if(lotto[j]>lotto[j+1]) {
//					int temp = lotto[j];
//					lotto[j] = lotto[j+1];
//					lotto[j+1] = temp;
//				}
//			}
//		}
		
		// 선택정렬
		for(int i = 0; i<lotto.length; i++) {
			
			int min = i;
			
			for(int j=i+1; j< lotto.length; j++) {
				
				if(lotto[min]>lotto[j]) {
					min = j;
				}
			}
			if(lotto[min]<lotto[i]) {
				
				int temp = lotto[i];
				lotto[i] = lotto[min];
				lotto[min] = temp;
			}
		}
		
		// 삽입정렬
//		for(int i = 1; i<lotto.length; i++) {
//			
//			int idx = i;
//			
//			for (int j = i-1; j >=0; j--) {
//				if (lotto[i]<lotto[j]) {
//					idx = j;
//				}
//			}
//			
//			if (idx==0 || lotto[idx-1]<lotto[i]) {
//				if (idx == 0) {
//					int temp = lotto[1];
//					lotto[1] = lotto[0];
//					lotto[0] = temp;
//				}
//				else {
//					int temp = lotto[i];
//					for(int j=i-1;j>=idx;j--) {
//						lotto[j+1]=lotto[j];
//					}
//					lotto[idx] = temp;
//				}
//			}
//		}
		
		// 출력
		System.out.println("*After sorting*");
		for(int a=0; a<lotto.length;a++) {
			System.out.print(lotto[a]+" ");
		}
		
		
	}
}
//두 변수의 값 맞바꾸기
		/*
		 * int a = 5, b = 6;
		 * int temp = a;
		 * a= b;
		 * b = temp;
		 * 
		 */