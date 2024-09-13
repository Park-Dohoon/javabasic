package n_collection;

import java.util.*;

public class Ex05_lotto {
	
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
//			int num = (int) (Math.random()*45)+1;
//			lotto.add(num);
			lotto.add((int)(Math.random()*45)+1);
		}
		List<Integer> list = new ArrayList<Integer>(lotto);
		Collections.sort(list);
		System.out.println(list);
	}
	
}
