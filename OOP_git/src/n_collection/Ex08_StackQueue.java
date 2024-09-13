package n_collection;

import java.util.*;
/*
 * 		자료구조 기초
 * 
 * 		Stack : LIFO ( Last In First Out )
 * 				나중에 들어온 데이터가 먼저 나가는 구조
 * 
 * 		Queue : FIFO ( First In First Out )
 * 				먼저 들어온 데이터가 먼저 나가는 구조
 */

public class Ex08_StackQueue {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();		// LIFO
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("스택에서 data 꺼내기");
		while( !stack.empty() ) {
			System.out.println(stack.pop());
		}
		
		System.out.println("큐에서 data 꺼내기");
		Queue queue = new LinkedList();	// FIFO
		
		queue.offer("가");
		queue.offer("나");
		queue.offer("다");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
