//ProiortyQueue for the Descending order Programs
package com.pravinkumar.day4;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());
		// Inserting the Element at End / Rear
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println(queue); // [D,C,B,A]

		queue.poll();// Remove D
		System.out.println(queue);// [C,B,A]

		queue.poll();// Remove C
		System.out.println(queue);// [B,A]

	}

}
