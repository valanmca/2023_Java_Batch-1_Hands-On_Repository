//basic operations in deque
package com.domnic.day4;
import java.util.Deque;
import java.util.LinkedList;

public class DeQueueEx1 {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();

		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		queue.offer("f");

		System.out.println(queue);
        System.out.println();
		queue.offerFirst("starting");   //adding on front
		queue.offerLast("ending");      //adding on rear
        System.out.println(queue);
        System.out.println();
		queue.pollFirst();               //removing on front
		queue.pollLast();                //removing on rear
		System.out.println(queue);
	}

}
