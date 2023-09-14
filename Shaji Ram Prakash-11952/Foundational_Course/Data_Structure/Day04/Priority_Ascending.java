package com.shaji.Day04;

import java.util.Queue;
import java.util.LinkedList;

public class Priority_Ascending {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println("The Elements are " + queue);//[A, B, C, D]
		
		queue.poll();// Remove A
		System.out.println(queue);//[B, C, D]

		queue.poll();//Remove B
		System.out.println(queue);//[C, D]

	}

}
