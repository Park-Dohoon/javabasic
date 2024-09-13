package xx_problem1;

public class Student {
	
	// member fields : 멤버변수들 (서로 다른 자료형)
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	// member methods : 멤버함수들
	public int calTotal() {
		total = kor+eng+math;
		return total;
	}
	public double calAvg() {
		avg = (double)total/3;
		return avg;
	}
	public void printStudentInfo() {
		System.out.printf("%s 총점 : %d 평균 : %.0f\n", name, this.calTotal(), this.calAvg());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
}