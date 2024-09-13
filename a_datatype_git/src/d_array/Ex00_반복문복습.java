package d_array;


public class Ex00_반복문복습 {
	public static void main(String[]args) {
		
		// int temp = (int)(Math.random()*45) +1; // 0.0<= random value <1.0
		int temp = (int)(Math.random()*10) +1; // 0.0<= random value <1.0
		
		// for
		for(int i = 0; i<6; i++) {
			temp = (int)(Math.random()*45) +1;
			System.out.print(temp+"/");
		}
		System.out.println("	- for");
		
		//while
		int cnt = 0;
		while(cnt++ < 6) {
			temp = (int)(Math.random()*45) +1;
			System.out.print(temp+"/");
		}
		System.out.println("	- while");
		
		// do while
		int cnt2 = 1;
		do {
			temp = (int)(Math.random()*45) +1;
			System.out.print(temp+"/");
		} while(cnt2++ < 6); 
		System.out.println("	- do~while");
	}
}
