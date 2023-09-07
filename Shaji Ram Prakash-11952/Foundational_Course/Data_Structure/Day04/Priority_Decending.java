package com.shaji.Day04;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class Priority_Decending {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());
		//Inserting Elements at End /REAR
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		
		System.out.println("The Elements are " + queue);//[D, C, A, B]
		
		queue.poll();// Remove D
		System.out.println(queue);//[C, B, A]

		queue.poll();//Remove C
		System.out.println(queue);//[B,A]


	}

}
