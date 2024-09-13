package xx_omok;

public class Omok {
	static char[][] background;
	static int background_size = 10;
	
	public static void main(String[] args) {
		
		for (int i = 0; i< background_size; i++) {
			
			background = new char[background_size][];
			background[i] = new char[] {'┼', '─', '┼', '─', '┼', '─', '┼', '─', '┼', '─', '┼', '─', '┼', '─', '┼', '─', '┼', '─', '┼'};
			
			for(int j=0; j<background[i].length; j++) {
				
				System.out.print(background[i][j]);
			}
			System.out.println();
		}
	}
}
