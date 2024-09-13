package e_method;

public class Ex99_선택문제0909 {
	public static void main(String[] args) {
		
		int N = 4;
		int votes[] = {1,3,2,3,2};
		
		int winner[] = solution(N, votes);
		
		System.out.print("\n당선자는");
		for (int i=0; i<winner.length; i++)
			System.out.print(" "+winner[i]+"번");
		System.out.println(" 후보입니다");
		
	}
	
	static int[] solution(int N, int[] votes) {
		
		int votes_cnt[] = new int[N];
		int top_cnt = 0;
		int numberOfWinner=0;
		
		// calculates gets of votes of candidate
		for (int i = 0; i<votes.length;i++) {
			
			votes_cnt[votes[i]-1]++;
			
			if (votes_cnt[votes[i]-1] > top_cnt) {
				top_cnt = votes_cnt[votes[i]-1];
				numberOfWinner = 1;
			}
			else if (votes_cnt[votes[i]-1] == top_cnt)
				numberOfWinner++;
		}
		
		// make array of winners
		int[] winners = new int[numberOfWinner];
		
		int idx_winner=0;
		for(int i = 0; i<N; i++) {
			if (votes_cnt[i] == top_cnt)
				winners[idx_winner++] = i+1;
			System.out.printf("%d번 후보가 %d표\n",i+1, votes_cnt[i]);
		}
		return winners;
	}
}
