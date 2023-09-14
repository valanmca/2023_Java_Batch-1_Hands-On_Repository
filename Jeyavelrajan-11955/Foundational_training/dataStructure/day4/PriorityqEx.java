
//Priority reverse order using comparator
//order the elements through Ascii order 
package com.jeyavel.day4;

import java.util.Queue;
import java.util.Comparator;
//import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityqEx {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());
		// Inserting "element at Ends
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println("Printing the queue:"+queue);// [A,C,B,D] //[D,C,B,A]

		queue.poll(); // Remove A Remove D
		System.out.println("After Poll():"+queue);// [B,C,D] //[C,B,A]

		queue.poll();// Remove B //Remove C
		System.out.println("After Poll() 2 nd time:"+queue);// [C,D] //[B,A]

	}

}
