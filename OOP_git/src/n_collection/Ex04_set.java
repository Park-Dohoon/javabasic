package n_collection;

import java.util.*;

public class Ex04_set {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("zebra");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("dog");
		set.add("dog");
		
		System.out.println(set);
	}
}
