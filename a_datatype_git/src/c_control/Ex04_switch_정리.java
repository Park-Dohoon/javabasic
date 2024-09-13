package c_control;

public class Ex04_switch_정리 {

	public static void main(String[] args) {
		
		int a = 10;
		switch(a/2) {							// break가 없으면 해당 조건 이후의 문장도 이어서 수행
		case 1: System.out.println("일");
		case 2: System.out.println("이");
		default: System.out.println("나머지");	// default의 위치는 아무 곳이나 상관 없다
		case 3: System.out.println("삼"); 
		case 4: System.out.println("사"); 
		}
	}

}
