package n_collection;

import java.util.*;

public class Ex07_hashMap {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		HashMap<String,String> map = new HashMap<String,String>();
		//		   아이디		비밀번호
		map.put("javassem", "1111"); // value, key
		map.put("javababo", "9999");
		map.put("kimjava", "9999");
		map.put("javassem", "1234");
		
		while(true) {
			System.out.print("ID : ");
			String id = input.next();
			System.out.print("PW : ");
			String pw = input.next();
			
			if(map.containsKey(id)) {
				if( (map.get(id)).equals(pw) ) {
					System.out.println("\n로그인 성공");
					break;
				}
				else {
					System.out.println("\n비밀번호가 일치하지 않습니다.");
					continue;
				}
			}
			else {
				System.out.println("\n존재하지 않는 ID입니다.");
				continue;
			}
		
			// 구현부분
		
		}
		
	}
}
