package com.dharshu.day4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDescending {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());// descending order Priority queue

		queue.offer("D");
		queue.offer("A");
		queue.offer("E");
		queue.offer("B");
		queue.offer("C");

		System.out.println("The elements are:" + queue);

		queue.poll();
		System.out.println(queue);

	}

}
