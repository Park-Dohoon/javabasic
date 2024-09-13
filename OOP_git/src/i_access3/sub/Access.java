package i_access3.sub;
/*
 * 접근지정자
 * 
 * - private	: 다른 클래스에서 접근 못함
 * - public		: 모든 곳에서 접근 가능
 * - protected	: 동일한 패키지+상속관계(다른 패키지에 있는 경우 자식패키지에서 접근 가능)
 * - default	: 동일한 패키지에서만 접근
 * 
 */
public class Access {
	private		String a = "private data";
	public 		String b = "public data";
	protected 	String c = "protected data";
				String d = "default data";
	
	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
