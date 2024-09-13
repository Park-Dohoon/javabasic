package i_access3;

import i_access3.sub.Access;

// Access 클래스와 MainTest 클래스가 다른 패키지(폴더, 디렉터리) 안에 있는 상황
public class MainTest extends Access {
	// Access : 부모클래스, MainTest 자식 클래스
	public static void main(String[] args) {
		
		//Access acc = new Access();	-> 부모가 아닌 자식 클래스로 객체 생성
		MainTest acc = new MainTest();
		//acc.a = "change private"; -> can`t access from other class
		acc.b = "change public";
		acc.c = "change protected";
		//acc.d = "change default";
		
		acc.output();
	}
}
