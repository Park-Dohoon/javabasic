package i_access2;

import i_access2.sub.Access;

// Access 클래스와 MainTest 클래스가 다른 패키지(폴더, 디렉터리) 안에 있는 상황
public class MainTest {
	
	public static void main(String[] args) {
		
		Access acc = new Access();
		//acc.a = "change private"; -> can`t access from other class
		acc.b = "change public";
		//acc.c = "change protected";
		//acc.d = "change default";
		
		acc.output();
	}
}
