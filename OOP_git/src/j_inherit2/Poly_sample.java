package j_inherit2;

public class Poly_sample {
	public static void main(String[] args) {
		
		Item[] result = method();
		
		// 처리(출력)
		for(int i=0; i < result.length ; i++) {
			result[i].output();	// polymophism
		}
		
	}
	
	static Item[] method() {
		
		// data
		Book	b = new Book("001", "python", "ICT", "someone");
		Dvd		d = new Dvd("002", "탈주", "한국인", "한국감독");
		Cd		c = new Cd();
		
//		Object[] obj = new Object[3];
//		obj[0] = b;
//		obj[1] = d;
//		obj[2] = c;
//		
//		return obj;
		
		Item[] obj = new Item[3];
		obj[0] = b;
		obj[1] = d;
		obj[2] = c;
		
		return obj;
	}
}
