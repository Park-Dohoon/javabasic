package j_inherit;

public class MainTest {
	public static void main(String[] args) {
//		Umma u= new Umma();
//		u.gene();
//		u.job();
//		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		d.job();	// 상속받음
		
		// 변수는 부모 클래스이고 객체 자식 클래스
//		Umma dal = new Ddal(); // Ddal 객체를 할당했지만 Umma 메모리만 참조 가능
//		dal.job();
//		// dal.study(); -> 사용 불가
//		dal.gene();	// 자식 메소드가 overriding 되었기 때문에 기존 부모 메소드 사용 불가
		
		
		// casting
		// 참조형에서 부모 자식간의 관계가 형성된다면 캐스팅 가능
		// : 부모 - 부모 메모리 / 자식 - 부모 메모리+자식 메모리
		//
		/*
		 * String a = new String();
		 * StringBuffer b = (StringBuffer)a;
		 * -> 불가능
		 * 
		 */
		
//		Umma a = new Umma();
//		Ddal b = (Ddal)a;
		
//		Ddal c = new Ddal();
//		Umma d = (Umma)c;		// up casting
//		Ddal c2 = (Ddal)d;		// down casting
		
		// 연산자 : instanceof	-> 해당 클래스의 객체인지 판별
		Ddal d = new Ddal();
		
		if(d instanceof Ddal) {
			System.out.println("Dal 클래스 객체");
		}
		
		if (d instanceof Umma) {
			System.out.println("Umma 클래스 객체");
		}
		
	}
}

