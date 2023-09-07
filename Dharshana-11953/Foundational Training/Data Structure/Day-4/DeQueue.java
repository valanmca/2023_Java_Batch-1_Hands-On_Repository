package com.dharshu.day4;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueue {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();

		//In Dequeue,the insertion and deletion can be done from both side either front or end
		
		// inserting the element in normal way
		deque.offer("Baby");
		deque.offer("Cat");
		deque.offer("Dog");
		deque.offer("Egg");
		deque.offer("Fan");
		deque.offer("Gift");

		System.out.println("The elements in an queue is:" + deque);

		// insert the element at the front
		deque.offerFirst("Apple");
		System.out.println("After inserting the elements in at first:" + deque);

		// insert the element at the end
		deque.offerLast("Home");
		System.out.println("After inserting the elements in at Last:" + deque);

		// remove the element at the front
		deque.pollFirst();
		System.out.println("After inserting the elements in at first:" + deque);

		// remove the element at the end
		deque.pollLast();
		System.out.println("After inserting the elements in at first:" + deque);

	}

}
