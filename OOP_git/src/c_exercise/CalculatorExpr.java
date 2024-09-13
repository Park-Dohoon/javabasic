package c_exercise;

public class CalculatorExpr {
	
	private int num1;
	private int num2;
	
	// setters and getters
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	// methods
	public int getAddition() {
		return num1+num2;
	}
	public int getSubstraction() {
		return num1-num2;
	}
	public int getMultiplication() {
		return num1*num2;
	}
	public double getDivision() {
		return (double)num1/num2;
	}
}
