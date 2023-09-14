/*********** Find the Queue Size without Using size()... *********/
package com.sara.day04;

import java.util.Queue;
import java.util.LinkedList;

public class Day4_Assignment1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		int count = 0;
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);

		while (!queue.isEmpty()) {
			queue.poll();
			count++;
		}
		System.out.println("The Size of the Queue is : " + count);

	}

}
