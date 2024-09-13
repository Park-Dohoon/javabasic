package b_operator;

/*
 * 산술연산자 : + - * / %
 * 
 */
import java.util.Scanner;

public class Ex03_산술 {

	public static void main(String[] args) {
		
		Scanner temp = new Scanner(System.in);
		int a1, a2;
		
		System.out.print("첫번째 숫자 입력: ");
		a1 = temp.nextInt();
		System.out.print("두번째 숫자 입력: ");
		a2 = temp.nextInt();
		temp.close();
		
		System.out.println("더하기:"+ (a1+a2));
		System.out.println("빼기:" + (a1-a2));
		System.out.println("곱하기:"+ (a1*a2));
		System.out.println("나누기:"+ (a1/a2));
		System.out.println("나머지:"+ (a1%a2));
		
	}

}
