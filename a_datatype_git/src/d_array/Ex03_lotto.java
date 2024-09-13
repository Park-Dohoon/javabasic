package d_array;

public class Ex03_lotto {
	public static void main(String[] args) {
		int [][] lotto = new int [5][6];
		int [] lotto_catch = new int [6];
		
		// 값 지정: 임의의 값
		for(int i = 0; i<5; i++) {
			for (int j=0; j <6; j++) {
				lotto[i][j] = (int)(Math.random()*45+1);
				for(int k=0;k<j;k++) {
					if (lotto[i][j]==lotto[i][k])
						j--;
				}
			}
		}
		
		// 당첨번호 생성
		for (int j=0; j <6; j++) {
			lotto_catch[j] = (int)(Math.random()*45+1);
			for(int k=0;k<j;k++) {
				if (lotto_catch[j]==lotto_catch[k])
					j--;
			}
		}
		
		// 5개 번호정렬 - bubble sort
		for(int i = 0; i<5; i++) {
			
			for(int j = 0; j<6; j++){
				for(int k = 0; k<6-j-1; k++) {
					
					int temp = lotto[i][k];
					if (temp > lotto[i][k+1]) {
						lotto[i][k] = lotto[i][k+1];
						lotto[i][k+1]=temp;
					}
				}
			}
		}
		
		// 당첨번호 정렬 - 선택정렬
		for(int i = 0; i<lotto.length; i++) {
			
			int min = i;
			
			for(int j=i+1; j< lotto.length+1; j++) {
				
				if(lotto_catch[min]>lotto_catch[j]) {
					min = j;
				}
			}
			if(lotto_catch[min]<lotto_catch[i]) {
				
				int temp = lotto_catch[i];
				lotto_catch[i] = lotto_catch[min];
				lotto_catch[min] = temp;
			}
		}
		
		// 출력
		System.out.println("*오늘의 로또번호*");
		for(int i = 0; i<lotto_catch.length; i++)
			System.out.print("/"+lotto_catch[i]+" ");
		System.out.println("\n----------------------------");
		
		for(int i = 0; i<5; i++) {
			int cnt = 0;
			
			for (int j=0; j <6; j++) {
				System.out.print("/"+lotto[i][j]+" ");
				
				for(int k = 0; k<lotto[i].length;k++) {
					if (lotto[i][j] == lotto_catch[k])
						cnt++;
				}
			}
			System.out.println("\n			-> "+cnt+"개 맞았습니다");
		}
	}
}
