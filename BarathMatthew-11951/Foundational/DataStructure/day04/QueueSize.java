//find queue size
package com.matthew.day04;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueueSize {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		System.out.println(queue);
		int count = 0;
		while (! queue.isEmpty()) {
			count++;
			queue.poll();
		}
		System.out.println("Size of queue : "+count);
	}

}
