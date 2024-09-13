package xx_problem2;

public class Account {
	private String name;
	private String accountId;
	private int balance=0;
	
	public Account(String name, String accountId, int balance) {
		this.name = name;
		this.accountId = accountId;
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
		System.out.println("\n"+money+"원 입금 후 잔액 : "+balance);
	}
	// 출금
	public void withdraw(int money) {
		if (balance-money <0)
			System.out.println("\n잔액이 부족합니다.");
		else {
			balance -= money;
			System.out.println("\n"+money+"원 출금 후 잔액 : "+balance);
		}
	}
	// print account info - name,account identifier, balance  
	public void printAccount() {
		System.out.printf("예금주 : %s, 계좌번호 : %s, 잔액 : %d\n", name, accountId, balance);
	}
}
