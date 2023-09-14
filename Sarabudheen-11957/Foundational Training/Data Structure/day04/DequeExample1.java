/*********** Inserting Elements at REAR and END ,Deleting the Elements in Dequeue... ***********/
package com.sara.day04;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample1 {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();

		// Inserting Element at REAR
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);// [A, B, C, D]
		
		// Inserting Element at REAR and END
		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println(queue);// [Z, A, B, C, D, A]
		
		// Deleting Element at REAR and END
		queue.pollFirst();
		queue.pollLast();
		System.out.println(queue);// [A, B, C, D]

	}

}
