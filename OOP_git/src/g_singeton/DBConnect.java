package g_singeton;

public class DBConnect {
	
	// 생성자
	private DBConnect() {
		System.out.println("실제 DB에 연결함");
	}
	
	// 멤버변수
	private static DBConnect dbconn = null;
	
	// 멤버 메소드
	public static DBConnect getInstance() {				// + Calendar.getInstance()				
		if(dbconn == null) dbconn = new DBConnect();
		return dbconn;
	}
}
