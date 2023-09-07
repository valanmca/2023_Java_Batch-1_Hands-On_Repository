//Find the queue size without using size()
package com.domnic.day4;

import java.util.Queue;
import java.util.LinkedList;

public class QueueEx2 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
        int count=0;
		queue.offer("V");
		queue.offer("C");
		queue.offer("f");
		queue.offer("r");
		queue.offer("i");
		queue.offer("o");

		while (!queue.isEmpty()) {
			queue.poll();
			count ++;
		}
		System.out.println("Total elements in Queue is :"+count);
	}

}
