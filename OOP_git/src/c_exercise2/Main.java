package c_exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		
		System.out.print("상품번호를 입력하시오-> ");
		product.setProductNo(input.next());
		System.out.print("상품명을 입력하시오-> ");
		product.setProductName(input.next());
		System.out.print("초기 재고량을 입력하시오-> ");
		product.setStock(input.nextInt());
		
		System.out.print("\n판매량을 입력하세요-> ");
		product.sale(input.nextInt());
		product.output();
		System.out.print("\n입고량을 입력하세요-> ");
		product.income(input.nextInt());
		product.output();
	}
}
