//reversing PriorityQueue
package com.matthew.day04;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class PriorityQueueDemoReverse {

	public static void main(String[] args) {
		Queue<String> queue =new PriorityQueue<String>(Comparator.reverseOrder());
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println("Printing the full queue"+queue);
		queue.poll();
		System.out.println("Printing the queue after poll"+queue);

		queue.poll();
		System.out.println("Printing the queue after poll"+queue);
	}

	

}
