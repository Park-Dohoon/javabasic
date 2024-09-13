package i_access;
/*
 * 접근지정자
 * 
 * - private	: 
 * - public		: 
 * - protected	: 
 * - default	: 
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
