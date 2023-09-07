package com.naveen.day4;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		//Inserting Element at End / Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println(queue);  //[A, B, C, D]
		
		//Remove first Element from the front
		queue.poll();
		System.out.println(queue); //[B, C, D]
		
		System.out.println(queue.size()); //3
		System.out.println(queue.peek()); //B
		System.out.println(queue); 
		System.out.println(queue.isEmpty()); //false

		System.out.println(queue.contains("A")); //false

		
		
	}

}
