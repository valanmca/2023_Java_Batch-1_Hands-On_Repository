//Ascending and Descending Priority Queue

package com.naveen.day4;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueEx03 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();

		System.out.println("Ascending Priority Queue");
		// Inserting Element at End / Rear
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");

		System.out.println(queue); // [A, C, B, D]

		queue.poll(); // Remove A
		System.out.println(queue); // [B, C, D]

		queue.poll(); // Remove B
		System.out.println(queue); // [C, D]

		Queue<String> queue01 = new PriorityQueue<String>(Comparator.reverseOrder());

		System.out.println("Descending Priority Queue");
		// Inserting Element at End / Rear
		queue01.offer("C");
		queue01.offer("B");
		queue01.offer("A");
		queue01.offer("D");
	

		System.out.println(queue01); // [D, B, C, A]

		queue01.poll(); // Remove D
		System.out.println(queue01); // [C, B, A]

		queue01.poll(); // Remove C
		System.out.println(queue01); // [B, A]

	}

}

