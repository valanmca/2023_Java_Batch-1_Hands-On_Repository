//Find the queue size without using size() method

package com.naveen.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");

		int size = 0;
		while (!queue.isEmpty()) {
			queue.poll();
			size++;
		}

		System.out.println("The size of the Queue is :" + size);

	}

}
