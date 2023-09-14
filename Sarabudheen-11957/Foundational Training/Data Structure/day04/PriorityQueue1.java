package com.sara.day04;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();

		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println(queue);// [A, C, B, D]

		queue.poll();// Remove A
		System.out.println(queue);// [B, C, D]

		queue.poll();// Remove B
		System.out.println(queue);// [C, D]

	}

}
