//Priority Queue in Descending order

package com.jeyandhan.day04;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDescend {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());
		queue.offer("B");
		queue.offer("E");
		queue.offer("A");
		queue.offer("C");
		queue.offer("D");
		System.out.println("The elements in the Queue are: " + queue);

		queue.poll();
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);

	}

}
