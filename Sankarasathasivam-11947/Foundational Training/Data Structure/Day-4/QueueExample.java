package com.shiva.day04;//Singular Queue

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		//Inserting Element at the end/Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println(queue);//[A, B, C, D]
		
		queue.poll();//Removes first element from front
		System.out.println(queue);//[B, C, D]
		
		System.out.println(queue.size());//3
		System.out.println(queue.peek());//B
		System.out.println(queue);//[B, C, D]
		
		System.out.println(queue.isEmpty());//false
		System.out.println(queue.contains("A"));//false
		
	}

}
