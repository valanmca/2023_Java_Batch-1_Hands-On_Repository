
//
package com.jeyavel.day4;
import java.util.Deque;
//import java.util.Comparator;
import java.util.LinkedList;

public class PriorityqExno2 {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);//[A,B,C,D]
		
		queue.offerFirst("z");//insert Z
		queue.offerLast("A");//insert A
		System.out.println(queue);//[Z,A,B,C,D,A]
		
		queue.pollFirst();//remove Z
		queue.pollLast();//remove A
		System.out.println(queue);////[A,B,C,D]
		
		

	}

}
