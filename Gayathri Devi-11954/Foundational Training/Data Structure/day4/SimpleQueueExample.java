package com.gayathri.day4;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

	public static void main(String[] args) {
		Queue <String> queue = new LinkedList <String> () ;

		//Insert element at end/rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println(queue);
		
		//remove the 1st element from the front
		queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.size());//find queue size
		
		System.out.println(queue.peek());//display the 1st element 
		System.out.println(queue.isEmpty()); //it check whether the queue is empty or full
		System.out.println(queue.contains("g")); //it check whether the B is in the queue or not? 
		//if it is present return true, or false 
		
	}

}
