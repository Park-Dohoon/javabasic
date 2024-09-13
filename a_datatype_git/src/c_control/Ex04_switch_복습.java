package c_control;

public class Ex04_switch_복습 {
 public static void main (String[] args) {
	 int kor=100, eng=100, math=100;
	 int total=kor+eng+math;
	 int avg = total / 3;
	 /*
	  * 평균을 구해서 90 이상 A
	  * 90미만 80이상 B
	  * 80미만 70이상 C
	  * 그 외는 F
	  * (switch문 이용)
	  * 
	  */
	 
	 char score ='\u0000';	// 유니코드 0값
	 switch(avg/10) {
	 case 10:
	 case 9: score = 'A'; break;
	 case 8: score = 'B'; break;
	 case 7: score = 'C'; break;
		 default : score = 'F';
	 }
	 
	 System.out.println("당신의 학점은 "+score+"입니다");
	 
 }
}
