
//Deque Program
package com.naveen.day4;

import java.util.Deque;
import java.util.LinkedList;

public class QueueEx04 {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
				
		//Inserting Element at End / Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println(queue);  //[A, B, C, D]
		
		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println(queue); //[Z, A, B, C, D, A]
		
		queue.pollFirst();
		queue.pollLast();
		System.out.println(queue); //[A, B, C, D]

	}

}
