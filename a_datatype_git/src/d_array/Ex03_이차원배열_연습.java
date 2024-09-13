package d_array;

public class Ex03_이차원배열_연습 {
	public static void main(String[] args) {
		
		int a[][]=new int[][]{
								{3,-5, 12 }, 
								{-2, 11, 2, -7}, 
								{21, -21, -35, -93, -11}, 
								{9, 14, 39, -98}
							};
		
		//출력
		for(int i=0; i< a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
				System.out.print(a[i][j]+"/");
			}
			System.out.println();
		}
		
		// a배열의 모든 값의 합을 구하기
		int sum = 0;
		for(int i=0; i< a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
				sum += a[i][j];
			}
			
		}
		System.out.println("배열의 모든 요소의 합은 "+sum+"입니다");
		
		// 각 행들의 합이 가장 큰 행을 출력하시오
		int[] each_sum = new int[a.length];
		
		for(int i=0; i< a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				each_sum[i] +=a[i][j];
			}
		}
		
		// 출력
		for(int i = 0; i <each_sum.length;i++)
			System.out.println(i+"번째 행의 합: "+each_sum[i]);
		
		// 최대값
		int max_sum = -999, max_idx=0;
		for (int i = 0; i <each_sum.length; i++) {
			if(each_sum[i] > max_sum) {
				max_sum = each_sum[i];
				max_idx = i;
			}
		}
		System.out.printf("\n합이 가장 큰 값을 가지는 행은 %d행으로 값은 %d입니다\n", max_idx, max_sum);
	}
}
