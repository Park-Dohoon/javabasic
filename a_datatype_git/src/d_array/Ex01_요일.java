package d_array;

import java.util.Calendar;

public class Ex01_요일 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();		//객체할당 불가 - 시스템 값을 불러오는 개념이기 때문
		System.out.println("현재 날짜 확인");
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 ");
		System.out.println(cal.get(Calendar.DATE)+"일");
		
		System.out.printf("현재 시간은 %d시 %d분 %d초입니다\n",cal.get(Calendar.HOUR),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND));
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		int yoil_id = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println( yoil[yoil_id] + "요일" );
		
		
	}
}
