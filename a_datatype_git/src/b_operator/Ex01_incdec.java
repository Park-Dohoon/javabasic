package b_operator;

public class Ex01_incdec {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		// [주의]
		//System.out.println("A=" + a + ", B=" + b);
		//System.out.println("A=" + a+1 + ", B=" + b+1);
		//System.out.println("A=" + (a+1) + ", B=" + (b+1));
		
		// [권장]
		//a = a+1;
		//b = b+1;
		//System.out.println("A=" + a + ", B=" + b);
		
		System.out.println("A=" + a + ", B=" + b);
		
		a = a+1;
		b = b-1;
		System.out.println("A=" + a + ", B=" + b);
		
		//증가감소 연산자
		a++;
		b--;
		System.out.println("A=" + a + ", B=" + b);
		
		++a;
		--b;
		System.out.println("A=" + a + ", B=" + b);
		
		int z = 10, y=10;
		int result = ++z;
		System.out.println(result);
		
		int result2 = y++;
		System.out.println(result2);
		
		System.out.println("Z=" + z + ", Y=" + y);
		
		System.out.println("Z=" + ++z + ", Y=" + --y);	// z=12 y=10
		System.out.println("Z=" + z++ + ", Y=" + y--);	// z=12 y=10
		
		System.out.println("Z=" + z + ", Y=" + y);
		
		
		
	}

}
