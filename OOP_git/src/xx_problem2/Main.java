package xx_problem2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Account account = new Account("홍길동", "123-456", 20000);
		account.printAccount();

		Scanner input = new Scanner(System.in);
		String command = "";
		
		while(!command.equals("종료")) {
			
			System.out.println("\n처리할 업무를 입력하세요('입금' 또는 '출금'을 정자로 입력)");
			System.out.println("** 거래종료를 원하신다면 '종료'를 정자로 입력하세요 **");
			command = input.next();
			
			switch(command) {
			case "입금": 
				System.out.print(command+"하실 금액을 입력하세요 : ");
				account.deposit(input.nextInt()); break;
			case "출금":
				System.out.println(command+"하실 금액을 입력하세요 : ");
				account.withdraw(input.nextInt()); break;
			default: 
				System.out.println("\n잘못된 입력입니다.\n"); break;
			case "종료":
			}
		}
		System.out.println("\n프로그램을 종료합니다.");	
	}
}
