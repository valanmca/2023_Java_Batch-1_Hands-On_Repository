package com.pravinkumar.day4;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();

		// Inserting the Element in the rear / End
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);// [A,B,C,D]

		// Removing the First Element in the Front

		queue.poll();
		System.out.println(queue);// [B,C,D]

		// Finding the Element in the Queue
		System.out.println(queue.size());// 3
		System.out.println(queue.peek());// B
		System.out.println(queue);
		System.out.println(queue.isEmpty());// False
		System.out.println(queue.contains("A"));// False
	}

}
