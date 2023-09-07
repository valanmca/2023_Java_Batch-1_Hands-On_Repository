//Priority Queue Basic operation
package com.domnic.day4;

import java.util.Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PrQueueEx1 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		Queue<String> queue1 = new PriorityQueue<String>(Comparator.reverseOrder());


		queue.offer("p"); // Ascending
		queue.offer("b");
		queue.offer("a");
		queue.offer("p");
		queue.offer("q");

		System.out.println(queue);

		queue.poll();
		System.out.println(queue);
		System.out.println();

		queue.poll();
		System.out.println(queue);
		System.out.println();

		
		queue1.offer("i"); // Desending order
		queue1.offer("o");
		queue1.offer("l");
		queue1.offer("m");
		queue1.offer("n");

		System.out.println(queue1);
		System.out.println();

		queue1.poll();
		System.out.println(queue1);
		System.out.println();

		

	}

}
