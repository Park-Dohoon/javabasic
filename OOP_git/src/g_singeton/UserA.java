package g_singeton;

public class UserA {
	DBConnect db;
	
	public UserA() {
		// db = new DBConnect(); -> 불가 DBC 생성자가 private
		db = DBConnect.getInstance();
	}
	public void use() {
		System.out.println("A 작업");
	}
}
