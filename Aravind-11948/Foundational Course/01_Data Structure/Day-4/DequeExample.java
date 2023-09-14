package com.aravind.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);// [A,B,C,D]

		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println(queue);// [Z,A,B,C,D,A]

		queue.pollFirst();// Remove z
		queue.pollLast();// remove A

		System.out.println(queue);// [A,B,C,D]

	}

}
