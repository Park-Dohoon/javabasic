package e_exercise;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("처리하려는 데이터의 수를 입력하시오 : ");
		int numberOfData = input.nextInt();
		
		int[] data = new int[numberOfData];
		System.out.println("\n데이터를 입력하시오(공백으로 구분)");
		for(int i=0; i<numberOfData; i++)
			data[i] = input.nextInt();
		
		System.out.print("\n점수들 : ");
		for(int i=0; i<numberOfData; i++) {
			System.out.print( data[i] );
			if(i != numberOfData -1)
				System.out.print(", ");
		}
		System.out.println();
		
		GradeExpr jumsu = new GradeExpr(data);
		System.out.println("총점 : "+jumsu.getTotal());
		System.out.printf("평균 : %.2f\n",jumsu.getAverage());
		System.out.println("최고 점수 : "+jumsu.getGoodScore());
		System.out.println("최저 점수 : "+jumsu.getBadScore());
	}
}
