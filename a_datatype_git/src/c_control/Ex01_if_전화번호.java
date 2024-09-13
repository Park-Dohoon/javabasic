package c_control;

public class Ex01_if_전화번호 {
	public static void main(String[] args) {
		
		String tel = "02-222-2222";
		int idx = tel.indexOf('-');
//		System.out.println(idx);
//		System.out.println(tel.substring(0,idx));
//		
		String localNum = tel.substring(0,idx);
		//System.out.println(localNum);
		
		/*
		 * 지역번호가 02라면 서울 출력
		 * 그렇지 않고 지역번호가 032라면 인천 출력
		 * 나머지는 한국 출력
		 */
		
		String local = "";
		
 		if (localNum.equals("02")){
			local = "서울";
		}
		else if (localNum.equals("031")){
			local = "경기도";
		}
		else if (localNum.equals("032")) {
			local = "인천";
		}
		else if (localNum.equals("033")){
			local = "강원도";
		}
		else {
			local = "한국";
		}
		System.out.println(local+"지역번호입니다");
	}
}
