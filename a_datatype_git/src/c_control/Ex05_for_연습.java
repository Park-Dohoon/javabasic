package c_control;
import java.util.Scanner;

public class Ex05_for_연습 {
	public static void main(String[] args) {
		
		// 문제1
		for (int i=1; i<=15 ; i++) {
			if(i%5 == 0)
				System.out.println(i);
			else
				System.out.print(i+" ");
		}
		
		
		// 문제2
		Scanner input = new Scanner(System.in);
		System.out.print("\n문자를 입력하시오(a~z 대소문자 가능):");
			//char N = (char) input.nextByte(); -> 자료형 매치가 안됨 char: 2byte
		char N = input.nextLine().charAt(0);
		
		if(N>='a' && N<='z') {
			for(char i = 'a' ; i <= N ; i++) {
				System.out.print(i);
			}
		}
		else if(N>='A' && N<='Z') {
			for(char i = N ; i <= 'Z' ; i++) {
				System.out.print(i);
			}
		}
		else {
			System.out.println("Error");
		}
		
		
		// 문제3
		System.out.print("\n\n거꾸로 출력할 문자열을 입력하시오:");
		String str = input.nextLine();
		input.close();
		for(int i = str.length()-1 ; i>=0 ; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
