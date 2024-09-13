package c_exercise2;

public class Product {
	private String productNo;
	private String productName;
	private int stock;
	
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void income(int numberOfRemains) {
		stock += numberOfRemains;
	}
	public void sale(int numberOfSales) {
		stock -= numberOfSales;
	}
	public void output() {
		System.out.printf("상품번호: %s, 상품명: %s, 재고량: %d\n", productNo, productName, stock );
	}
}
