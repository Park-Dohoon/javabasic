package xx_problem3;

public class Student extends Human {
	// field
	private String number	;
	private String major	;
	
	// constructor
	public Student() {
		
	}
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		
		this.number	= number;
		this.major 	= major	;
	}
	
	// method
	public String  printInformation() {
		return super.printInformation() + "	" + number + "	" + major;
	}
}
