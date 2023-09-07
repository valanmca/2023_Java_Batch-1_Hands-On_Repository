// Find the queue size without using size.

package com.jeyandhan.day04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSize {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		int count = 0;
		// Inserting Element at End/Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println("The elements in the Queue are: " + queue);

		while (!queue.isEmpty()) {
			queue.poll();
			count++;
		}
		System.out.println("The Size of the Queue is: " + count);

	}

}
