package f_exception;
/*
 * 오류
 * 		- 에러 : 심각한 오류
 * 		- 예외 : 심각하지 않은 오류
 * 
 * 예외처리 : 최종적인 목적은 프로그램이 정상으로 종료
 * 	[1] try ~ catch
 * 
 * 		try{
 * 			예외가 발생할 여지가 있는 구문
 * 		} catch(Exception ex){
 * 			예외가 발생한 후에 구문
 * 		} finally {
 * 			예외 관련 없이 무조건 실행구문
 * 		}
 * 
 *  [2] function + throws
 * 
 */
public class Ex01_tryCatch {
	public static void main(String[] args) {
		
		// String[] str = new String[] {"안녕하세요", "올라", "하이"};
		String[] str = {"안녕하세요", "올라", "하이"};
		
		try {
			for (int i=0; i<= str.length; i++) {
				System.out.println(str[i]);
			}
			return;
		}
		catch(Exception ex) {
			System.out.println("exception : "+ ex.getMessage());
		}
		finally {
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("프로그램 종료");
	}
}
