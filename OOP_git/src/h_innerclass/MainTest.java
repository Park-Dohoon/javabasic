package h_innerclass;

/*
 * inner class : 클래스 안의 클래스 (멤버 취급)
 */
class Outer{				// 한 java 파일 안에 두 클래스 정의해도 class 파일이 각각 생성됨
	static class Inner{			// Outer$Inner.class 생성, inner class 에는 static 부여 가능(멤버 취급, outer class 에는 부여 불가)
		static void najabara() {
			System.out.println("잡아봅시다");
		}
	}
}
public class MainTest {
	public static void main(String[] args) {
		/*
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.najabara();
		*/
		/*
		Outer.Inner in = new Outer.Inner();
		in.najabara();
		*/
		
		Outer.Inner.najabara();
	}
}
