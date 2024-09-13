package n_collection;
import java.util.*;
public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		List result = method();
		
		// 처리
		for(int i=0; i<result.size(); i++) {
			Object obj = result.get(i);
			System.out.println(obj);
		
		}
	}
	
	static List method() {
		// data
		String name = "홍길자";
		Integer age = 100;		// int
		Double height = 190.99;
		
		List list = new ArrayList();
		// Object[] obj = new Object[갯수];
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
	}
}
