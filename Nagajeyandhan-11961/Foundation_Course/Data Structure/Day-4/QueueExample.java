//Queue Operations

package com.jeyandhan.day04;

import java.util.Queue;

import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		// Inserting Element at End/Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println("The elements in the Queue are: " + queue);

		queue.poll(); // Remove first element from the FRONT
		System.out.println("The elements in the Queue are: " + queue);

		System.out.println("The Size of the Queue is: " + queue.size()); // 4
		System.out.println("The First element is: " + queue.peek()); // B
		System.out.println("The Elements in the Queue are: " + queue); // [B,C,D,E]
		System.out.println("The Queue is empty or not? " + queue.isEmpty()); // false
		System.out.println("The Queue contains the element are not? " + queue.contains("A")); // false

	}

}
