/******** Reverse Order in Priority Queue... *********/
package com.sara.day04;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class PriorityQueue2 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());

		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println(queue);// [D, C, A, B]

		queue.poll();// Remove D
		System.out.println(queue);// [C, B, A]

		queue.poll();// Remove C
		System.out.println(queue);// [B, A]

	}

}
