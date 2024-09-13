package b_operator;
import java.util.Scanner;

public class Ex03_나머지 {

	public static void main(String[] args) {
		
		// 나머지 연산자 활용 : 홀/짝수 구할 때
//		int a=11;
//		
//		if (a % 2 == 0) {
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
		
		
		//숫자 하나를 입력받아 3의 배수인지 확인
		Scanner temp = new Scanner(System.in);
		int num;
		
		System.out.print("3의 배수인지 판별할 숫자를 입력하시오:");
		num = temp.nextInt();
		temp.close();
		
		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
}
