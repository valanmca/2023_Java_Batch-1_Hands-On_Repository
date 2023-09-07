package com.madhan.day04;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

public class DequeExample1 {

	public static void main(String[] args) {
		Deque<String> queue =new LinkedList<String>();
		// Inserting an element at Rear End
		queue.offer("M");
		queue.offer("A");
		queue.offer("D");
		queue.offer("A");
		queue.offer("N");
		System.out.println(queue);
		queue.offer("m");
		System.out.println(queue);
		//Insert element before Rear End
		queue.offerFirst("P");
		queue.offerLast("K");
		System.out.println(queue);
		
		queue.pollFirst();
		queue.pollLast();
		System.out.println(queue);
		
//		queue.peek();
		System.out.println(queue.peek());
		
		
		
	}

}
