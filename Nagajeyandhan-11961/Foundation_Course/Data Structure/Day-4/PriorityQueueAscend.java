//Priority Queue in Ascending order

package com.jeyandhan.day04;

import java.util.Queue;

import java.util.PriorityQueue;

public class PriorityQueueAscend {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
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
