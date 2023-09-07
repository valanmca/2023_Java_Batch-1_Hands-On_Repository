package com.matthew.day04;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println("Printing the full queue"+queue);
		System.out.println("Inserting at first : ");
		queue.offerFirst("Z");
		System.out.println("Inserting at Last :");
		queue.offerLast("A");
		queue.pollFirst();
		System.out.println("Printing the queue after poll"+queue);

		queue.pollLast();
		System.out.println("Printing the queue after poll"+queue);
	}

}
