package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_복습3 {

	public static void main(String[] args) {
		char[][] result = input();
		output(result);
	}
	
	/*
	문자 배열에 저장된 문자들을 화면에 출력한다.
	*/
	static void output(char ch[][]) {
		
		for (int i =0; i < ch.length; i++) {
			for (int j =0; j<ch[i].length; j++)
				System.out.print(ch[i][j]+" ");
			System.out.println();
		}
	}

	/*
	두 정수와 알파벳 문자 하나를 입력받는다
	[예] 3 4 F
	*/	
	static char[][] input() {
		Scanner in_str = new Scanner(System.in);
		String str = in_str.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int h = Integer.parseInt( st.nextToken());
		int w = Integer.parseInt( st.nextToken());
		char ch = st.nextToken().charAt(0);
		
		return makeSquare(h,w,ch);
	}
	
	// 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	//		입력받은 문자를 시작으로 저장한다. 
	/*
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char[][] makeSquare(int h, int w, char ch_in) {
		 char [][]  ch = new char[h][w];
		for(int i = 0; i<h*w; i++) {
			ch[i/w][i%w] = (char)(ch_in + i);
		}
		return ch;
	}

}