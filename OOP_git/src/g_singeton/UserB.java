package g_singeton;

public class UserB {
	DBConnect db;
	
	public UserB() {
		db = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("B 작업");
	}
}
