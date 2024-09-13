package c_control;

/*
 * 분기문 switch
 * [주의] break 확인
 * [주의] 문자형(char)/정수형(int/long)/문자열(String; 1.5버전 이상)
 * 
 */

public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		
		String id = "801212-1234567";
		char chul = id.charAt(8);
		String local ="";
		
		switch(chul) {
		case '0':
			local = "서울"; break;
		case '1':
			local = "인천/부산"; break;
		case '2':
			local = "경기"; break;
		case '9':
			local = "제주"; break;
		default:
			local = "한국";				// default 문은 break 안 써도 무방함
		}
		System.out.println("당신은 "+local+"출신입니다.");
		
	}

}
/* 주민번호에서 출신지 번호가(뒷자리 두번째)
 * 0: 서울
 * 1: 인천/부산
 * 2: 경기
 * 9: 제주
 * 나머지: 한국
 * 
 * if(chul == '0'){
 * 	서울
 * }
 * else if(chul == '1'){
 * 	인천/부산
 * }
 * else if(chul == '2'){
 * 	경기
 * }
 * else if(chul == '9'){
 * 	제주
 * }
 * else{
 * 	한국
 * }
 * 
 */
