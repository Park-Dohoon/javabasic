package n_collection;

import java.util.TreeSet;

public class Ex06_treeSet {
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet();		// 정렬이 되서 나옴
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("zebra");
		set.add("bee");
		set.add("dog");
		
		System.out.println(set);
		System.out.println(set.subSet("d", "s"));
		System.out.println(set.headSet("e"));			// e 보다 알파벳 순서가 빠른 단어
		System.out.println(set.tailSet("e"));			// e 보다 알파벳 순서가 느린 단어
	}
}
