package j_inherit_sample;

import java.awt.*;

public class Test {
	
	Frame f; // 윈도우 -> 프레임(java)
	
	Test() {
		f = new Frame("나의 첫 화면");
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
	}
}
