package com.dharshu.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSize {
	
   //Find the queue size without using the size method
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		// Inserting the Element at End/REAR
	
		queue.offer("A");// offer() method is used to inserting the element
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");

		System.out.println("The elements are:" + queue);// [A,B,C,D,E]
		
		int count=0;
		while(!queue.isEmpty()) {
			queue.poll();
			count++;
			
		}
		System.out.println("The  size of the queue :" +count);

	}

}
