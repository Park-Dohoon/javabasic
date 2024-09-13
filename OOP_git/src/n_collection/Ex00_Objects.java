package n_collection;

public class Ex00_Objects {
	public static void main(String[] args) {
		
		StudentA a = new StudentA("01234", "홍길동");
		StudentA b = new StudentA("01234", "홍길동");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		if (a.equals(b)) {
			System.out.println("동일인");
		}
		else {
			System.out.println("다른 사람");
		}
	}
}

class StudentA extends Object {
	
	String number	;
	String name		;
	
	public StudentA(String number, String name) {
		this.number = number;
		this.name 	= name	;
	}
	public String toString() {
		return "학번: " + number + ", 이름: " + name;
	}
	public boolean equals(Object obj) {
		StudentA other = (StudentA) obj;
		
		return number.equals(other.number); 
	}
}