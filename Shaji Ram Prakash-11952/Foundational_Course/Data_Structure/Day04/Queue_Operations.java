package com.shaji.Day04;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Operations {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList();
		//Inserting Element at End / Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue); //[A,B,C,D]
		
		queue.poll();//Remove First Element from the FRONT
		System.out.println(queue);//[B,C,D]
		
		System.out.println(queue.size());//3
		System.out.println(queue.peek());//B
		System.out.println(queue);//[B,C,D]
		System.out.println(queue.isEmpty());//false
		System.out.println(queue.contains("A"));//false


	}

}
