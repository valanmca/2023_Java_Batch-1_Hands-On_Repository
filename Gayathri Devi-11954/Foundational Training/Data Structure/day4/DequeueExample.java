package com.gayathri.day4;
import java.util.Deque;
import java.util.LinkedList;
public class DequeueExample {

	public static void main(String[] args) {
		
		Deque <String> queue = new LinkedList <String> ();
		//insertion & deletion can be done in both front & rear end
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		
		System.out.println(queue);
		
		queue.offerFirst("Z");
		System.out.println(queue);

		queue.offerFirst("W");
		System.out.println(queue);

		queue.offer("X");
		System.out.println(queue);
		
		queue.offerLast("P");
		System.out.println(queue);
		
		queue.offerLast("Q");
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);
		
		queue.pollFirst();
		System.out.println(queue);
		
		queue.pollLast();
		System.out.println(queue);
	}

}
