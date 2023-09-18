//Find the queue size without using size()
package com.pravinkumar.day4;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);

		System.out.println(queue);

		int size = 0;
		if (!queue.isEmpty()) {
			queue.poll();
			size++;
		}
		System.out.println("The Size is: " + size);
	}

}
