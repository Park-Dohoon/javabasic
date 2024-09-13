package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_tryCatch {
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		
		try {
			
			fis = new FileInputStream("abc.txt"); // 예외처리 필수 함수
			fis.read();
			System.out.println("파일처리");
			
		} catch(FileNotFoundException ex) {
			
			System.out.println("exception : file does not exist");
			
		} catch(Exception ex) {
			
			System.out.println("exception : "+ex.getMessage());
			ex.printStackTrace(); // -> 모든 로그 출력
			
		} finally {
			
			try {
				fis.close();
				
			} catch(Exception ex) {}
			
		}
		
	}
}
