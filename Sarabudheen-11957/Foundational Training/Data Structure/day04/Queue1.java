/******* Performing a Queue Operations Using LinkedList... *******/
package com.sara.day04;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		// Inserting Element at REAR
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);// [A, B, C, D]

		queue.poll();
		System.out.println(queue);// [B, C, D]

		System.out.println(queue.size());// 3
		System.out.println(queue.peek());// B
		System.out.println(queue);// [B, C, D]
		System.out.println(queue.isEmpty());// False
		System.out.println(queue.contains("A"));// False

	}

}
