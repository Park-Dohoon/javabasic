package d_array;

public class Ex00_배열문법 {
	public static void main(String[] args) {
		
//		// 배열변수 선언
//		int [] kor = null;
//		
//		// 배열객체 생성
//		kor = new int[3];
//		
		// 배열변수 선언 + 객체생성
//		int[] kor = new int[3];
				
//		// 값 지정
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300;
		
		// 초기화
//		int[] kor = new int[] {100,200,300};
		int[] kor = {100,200,300};
		
		//총점
		int total = 0;
		for(int i=0; i< kor.length; i++) {
			total += kor[i];
		}
		System.out.println("총점: "+total);
		
	}
}
