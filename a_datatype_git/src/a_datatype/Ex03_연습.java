package a_datatype;

public class Ex03_연습 {

	public static void main(String[] args) {
		
		// 국어점수 변수 선언
		// 영어점수 변수 언언
		int PointKr;
		int PointEn;
				
		// 국어점수 변수애 90
		// 영어점수 변수에 100
		PointKr = 91;
		PointEn = 100;
		
		// 총점 변수 선언
		int PointSum;
		// 총점 계산하기
		PointSum = PointKr + PointEn;
		
		// 평균 변수 선언
		double PointAvg;
		// 평균 계산
		//PointAvg = (PointKr + PointEn)/2; // 정수형끼리 연산한 결과는 정수형이다(자바의 특성)
		PointAvg = (PointKr + PointEn)/2.0;
		//PointAvg = (double)(PointKr + PointEn)/2;
		
		// 총점 출력
		System.out.println("국어점수: "+PointKr+"\n영어점수: "+PointEn+"\n총점: "+PointSum+"\n평균: "+PointAvg);
	}

}
