package f_exception;

import java.io.FileInputStream;

public class Ex03_throws {
	public static void main(String[] args) {
		try {
			readFile();
			System.out.println("파일처리 성공");
		} catch(Exception ex) {
			System.out.println("예외발생: "+ex.getMessage());
			// ex.printStackTrace();
		}
	}
	static void readFile() throws Exception {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("happy.txt"); 
			// 모듈이기 때문에 try~catch 예외 처리하면 main에서 인식 불가 -> 에러는 main에 throws
		} finally {
			fis.close();
		}
	}
}
