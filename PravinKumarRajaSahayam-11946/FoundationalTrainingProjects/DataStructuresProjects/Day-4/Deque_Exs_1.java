//Using Dequeue in the ProiortyQueue in the String Programs;.
package com.pravinkumar.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;

public class Deque_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> queue = new LinkedList<String>();
//Inserting the Element in the End / Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);// [A,B,C,D]

		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println(queue);// [Z,A,B,C,D,A]

		queue.pollFirst();// Remove Z
		queue.pollLast();// Remove A
		System.out.println(queue);// [A,B,C,D]

	}

}
