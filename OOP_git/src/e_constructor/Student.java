package e_constructor;
/*
 * [참고] 초기화
 * 		int a;		// 변수선언
 * 		a = 10;		// 값 지정
 * 
 * 		int b =20;	// 변수선언+값지정 = 초기화
 * 
 * 		int[] array = new int[3];
 * 		array[0] = 100;
 * 		array[0] = 100;
 * 		array[0] = 100;
 * 
 * 		int[] array2 = {100, 200, 300};  => initialize
 *  
 *  [참고] 클래스의 초기화 : 생성자 함수(constructor)
 *  	- 클래스가 인스턴스화 될 때 실행하는 함수
 *  	- 생성자 함수 이름은 반드시 클래스명과 동일
 *  	- 리턴형이 없음(void도 없음)
 *  	- overloading 가능(메소드 명이 동일하고 매개변수의 타입과 갯수가 다른 여러 개의 함수)
 *  	- default constructor
 *  		-> 생성자 함수가 존재하지 않을 때 자동 생성
 *  		-> 하나라도 있을 때는 생성 x
 *  
 *  [참고] 자바 특성
 *  	class Test{					// 클래스명
 *  		String Test;			// 변수명
 *  		public void Test() { }	// 함수명
 *  		public Test() { }		// 생성자
 *  	}
 *  
 *  [참고] this 와 this() 함수
 *  	this : 자기 객체를 지칭하는 레퍼런스
 *  			- 멤버변수나 멤버메소드를 명확하게 지칭할 때 사용
 *  	this() : 다른 생성자 함수를 호출할 때 사용(오직 생성자에만 사용)
 *  			*주의 - 반드시 생성자 내 첫 라인에 기술해야 함
 */

public class Student {
	
	// member fields : 멤버변수들 (서로 다른 자료형)
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	// Constructor : 생성자 함수
	// * public Student() {} -> 생성자 함수가 없을 때 자동으로 정의/호출
	public Student() {
//		name = "박길동";
//		kor = 50;
//		eng = 50;
//		math = 50;
		this("홍길동", 50, 50, 50);
		//System.out.println("기본 생성자 호출");
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		//System.out.println("인자 있는 생성자 호출");
		
	}
	
	// member methods : 멤버함수들
	public int calTotal() {
		total = kor+eng+math;
		return total;
	}
	public double calAvg() {
		avg = (double)total/3;
		return avg;
	}
	
	// setter & getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
