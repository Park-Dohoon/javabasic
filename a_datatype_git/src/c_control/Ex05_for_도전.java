package c_control;

import java.util.Scanner;

public class Ex05_for_도전 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("\n쌓을 피라미드의 단 수를 입력하시오: ");
		int layer = input.nextInt();
		input.close();

		// 피라미드 - 방법1 (트리 형태)
		System.out.println("\n\n#case1\n");
		for(int i = 0; i<layer; i++) {
			// 공백 출력
			for(int j = 0;j < layer-i-1; j++) {
				System.out.print(" ");
			}
			// * 출력
			for(int j = 0; j < i+1; j++) {
				System.out.print(" *");
			} // end of for j

			System.out.println();
		} // end of for i

		
		// 피라미드 - 방법2 (피라미드 형태)
		System.out.println("\n\n#case2\n");
		for(int i = 0; i<layer; i++) {
			// 공백 출력
			for(int j = 0;j < layer-i-1; j++) {
				System.out.print("  ");
			}
			// * 출력
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print(" *");
			} // end of for j

			System.out.println();
		}// end of for i
		
		
		// 피라미드 - 방법3 (토글 방식)
		System.out.println("\n\n#case3\n");
		int width = layer*2-1;
		for(int i = 1 ;  i <= layer ; i++) {
			int layer_width = i*2-1;
			for (int j = 0 ; j < width; j++) { // x * y 박스 출력
				if (j < (width-layer_width)/2 | j >= (width-layer_width)/2+layer_width) {
					System.out.print("  "); // *가 없어야 할 자리에 공백 출력
				}
				else {
					System.out.print(" *");
				}
			}// end of for j
			System.out.println();
		}// end of for i

	}
}
