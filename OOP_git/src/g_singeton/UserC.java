package g_singeton;

public class UserC {
	DBConnect db;
	
	public UserC() {
		db = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("C 작업");
	}
}
