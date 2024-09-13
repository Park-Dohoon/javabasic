package c_control;

enum Size{
	SMALL,
	MIDEUM,
	LARGE
}

public class Ex04_switch_enum {
	public static void main(String[] args) {
		/*
		 * small : 1, medium : 2, large : 3으로 프로그램 처리
		 * 
		 */
//		int size = 1; // 화면에서 넘어오는 값이라 가정
//		
//		switch(size) {
//		case 1: System.out.println("작은거"); break;
//		case 2: System.out.println("중간거"); break;
//		case 3: System.out.println("큰거"); break;
//		}
		
		Size size = Size.SMALL;
		switch(size) {
		case SMALL: System.out.println("작은거"); break;
		case MIDEUM: System.out.println("중간거"); break;
		case LARGE: System.out.println("큰거"); break;
		}
	}
}
