package com.shaji.Day04;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Operations {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
		//Inserting Elements at End /REAR
				queue.offer("A");
				queue.offer("B");
				queue.offer("C");
				queue.offer("D");
				
				System.out.println("The Elements are " + queue);//[A, B, C, D]
				
				queue.offerFirst("Z");
				queue.offerLast("A");
				System.out.println("The Elements are " + queue);//[Z, A, B, C, D, A]
				
				queue.pollFirst();//Remove Z
				queue.pollLast();//Remove A
				System.out.println("The Elements are " + queue);//[A, B, C, D]

	}

}
