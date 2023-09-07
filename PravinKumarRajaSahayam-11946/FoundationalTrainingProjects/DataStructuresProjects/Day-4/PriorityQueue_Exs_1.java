//PriorityQueue For Ascending order for the Strings Problems
package com.pravinkumar.day4;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueue_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();// Ascending
		// Inserting the Elements at the End / Rear

		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");

		System.out.println(queue);// [A,C,B,D]

		queue.poll(); // Remove A
		System.out.println(queue);// [B,C,D]

		queue.poll();// Remove B
		System.out.println(queue);// [C,D]

	}

}
