package e_exercise;

public class GradeExpr {

	int[] jumsu;
	
	public GradeExpr(int jumsu[]) {
		this.jumsu = jumsu;
	}
	
	public double getAverage() {
		return getTotal()/jumsu.length;
	}
	public double getTotal() {
		int sum = 0;
		for(int i=0; i < jumsu.length; i++)
			sum+=jumsu[i];
		return sum;
	}
	public double getGoodScore() {
		int goodScore = 0;
		for(int i=0; i < jumsu.length; i++)
			if (jumsu[i]>goodScore)
				goodScore = jumsu[i];
		return goodScore; 
	}
	public double getBadScore() {
		int badScore = 100;
		for(int i=0; i < jumsu.length; i++)
			if (jumsu[i]<badScore)
				badScore = jumsu[i];
		return badScore; 
	}
}
