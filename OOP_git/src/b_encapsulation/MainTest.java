package b_encapsulation;

public class MainTest {
	public static void main(String[] args) {
		
		// 클래스 변수 선언
		Student s = null;
		// 객체 생성
		s = new Student();
		
		// 값 지정 및 처리
		s.setName("홍길순");
		s.setKor(88);
		s.setEng(77);
		s.setMath(60);
		
		System.out.println(s.getName()+"님 총점: "+s.calTotal());
		
		//s.getTotal = 300;
		System.out.println(s.getName()+"님 평균: "+s.calAvg());
		
	}
}
