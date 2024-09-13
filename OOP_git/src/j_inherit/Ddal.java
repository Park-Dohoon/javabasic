package j_inherit;

public class Ddal extends Umma{
	public Ddal() {
		System.out.println("딸 생성");
	}
	// overriding method
	public void gene() {
		System.out.println("자식은 자식이다");
		
	}
	public void study() {
		System.out.println("엄마는 대장");
	}
}
