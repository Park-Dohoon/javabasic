package k_final;
/*
 * 		final : 변경불가
 * 			
 * 			- class		: 상속 방지(부모클래스가 될 수 없다) 
 * 			- field 	: 값 변경 방지 -> 상수
 * 			- method	: overriding 방지 
 */

class Parent{
	final String field = "부모님꺼";
	final void jib() {
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent{
	Child() {
		///field = "내꺼";
	}
//	void jib() {
//		System.out.println("자식이 탕진함");
//	}
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
	}

}
