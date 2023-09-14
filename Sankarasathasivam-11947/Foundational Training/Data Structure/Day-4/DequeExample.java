package com.shiva.day04;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();

		// Inserting Element at end/rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println("The List to be printed :"+queue);

		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println("\nAfter insertion from first and end :"+queue);

		queue.pollFirst();
		queue.pollLast();
		System.out.println("\nAfter removal of elements :"+queue);
	}

}
