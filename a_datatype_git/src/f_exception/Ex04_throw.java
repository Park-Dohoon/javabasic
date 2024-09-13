package f_exception;

public class Ex04_throw {
	public static void main(String[] args) {
		
		try {
			readMessage();
		} catch(Exception ex) {
			System.out.println("예외 발생: "+ex.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}
	static void readMessage() throws Exception {
		String[] str = {"안녕하세요", "올라", "하이"};
		try {
			for(int i=0; i<=str.length; i++) {
				System.out.println(str[i]);
			}
		} catch(Exception ex) {
			throw new MyException();		// 개발자의 의도로 특정 예외를 메소드 내에서 발생시킨다 ( throws x ) 
		}									// 메소드에 throws가 없으면 main에 넘어가지 않고 메소드 내 처리
	}
}
