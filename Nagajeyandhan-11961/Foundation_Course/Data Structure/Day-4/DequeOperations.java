//Deque Operations

package com.jeyandhan.day04;

import java.util.Deque;

import java.util.LinkedList;

public class DequeOperations {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();

		// Inserting Element at End/Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println("The elements in the Queue are: " + queue); // [A,B,C,D,E]

		queue.offerFirst("Z"); // Inserting Z at Front and A at Rear
		queue.offerLast("A");
		System.out.println("The elements in the Queue are: " + queue); // [Z,A,B,C,D,E,A]

		queue.pollFirst(); // Deleting Z from Front and A from Rear
		queue.pollLast();
		System.out.println("The elements in the Queue are: " + queue); // [A,B,C,D,E]
	}

}
